# part2-lexical

Introduction to Language Theory and Compiling
INFO-F-403
Project part 2
Parser
Academic Year 2016-2017
Luke BURKE
Michael MEJIA
1 Introduction
Computers are integrated into every aspect of the modern world. They run our
telephones, automobiles, even watches. But in order for them to do their job correctly, they need
to be programmed. In order to have a programming language that works on multiple systems,
compilers are needed. Compilers translate a program written in a language understood by
humans to a set of instructions understood by the system’s hardware. Here, we will illustrate the
steps needed in order to transform a given grammar into a form understood by a LL(1) Parser
that we have implemented.
Grammar Transformation
The steps to transform the original grammar are as follows:
1) Removal of unreachable and unproductive symbols
2) Removal of ambiguities taking into account priority and associativity of operators
3) Removal of left factor and left-recursion.
Removal of Unproductive Symbols
Unproductive symbols are symbols within the grammar that are incapable of producing a
valid string of terminals. In order to remove these we apply the following algorithm to the
grammar:
The iterations of the algorithm are as follows:
V0={}
V1={<Vars>, <VarList>, <Code>, <ExprArith>, <Op>, <BinOp>, <Comp>} U V0
V2= {<Program>, <Assign>, <SimpleCond>, <Do>, <Read>, <ExpList>} U V1
V3={<Instruction>, <Cond>, <Print>} U V2
V4={<If>} U V3
V5={} U V4
V5 = V4, so we stop the algorithm
We see that V5 contains all the variables of the original grammar, as such, there are no
unproductive symbols.
Removal of Unreachable Symbols
Unreachable symbols are the set of symbols such that there exists no path from the start
symbol to said symbol. Here we apply to following algorithm:
The iterations of the algorithm are as follows :
V0={<Program>}
V1={<Vars> | <Code> | PROGRAM | [ProgName] | [EndLine] | END} U V0
V2={<VarList> | [VarName] | ε | <Instruction>} U V1
V3={<Assign> | <If> | <Do> | <Print> | <Read>} U V2
V4= {<ExprArith> | = | IF |( | <Cond> | ) | THEN | ELSE | ENDIF | DO | [Number] | , | ENDDO |
PRINT* | <ExpList> | READ* } U V3
V5= {- | <Op> | <BinOp> | .NOT. | <SimpleCond>} U V4
V6= { + | * | / | .AND. | .OR. | <Comp>} U V5
V7= {.EQ. | . GE. | .GT. | .LE. | .LT. | .NE. } U V6
V8 = {} U V7
V8 = V7 so we stop the algorithm.
We see that V8 contains all the variables and terminals of the original grammar, as such, there
are no unreachable symbols.
We see that the original grammar, in fact, does not contain any useless symbols.
Removal of Ambiguities
A requirement for the creation of an LL(1) parser is that all words that are able to be
generated have one and only one derivation tree. If multiple derivation trees occur for the same
word, the grammar is said to be ambiguous. Ambiguities most often occur from mathematical
rules of associativity and boolean expressions. In the original grammar the rules containing
<BinOp> and <Op> are ambiguous and as such these rules are removed and replaced with the
modified rules below (Underlined and Bolded for clarity)
[1] <Program> → PROGRAM [ProgName] [EndLine] <Vars> <Code> END
[2] <Vars> → INTEGER <VarList> [EndLine]
[3] → ε
[4] <VarList> → [VarName], <VarList>
[5] → [VarName]
[6] <Code> → <Instruction> [EndLine] <Code>
[7] → ε
[8] <Instruction> → <Assign>
[9] → <If>
[10] → <Do>
[11] → <Print>
[12] → <Read>
[13] <Assign> → [VarName] = <ExprArith>
[14] <Cond> → <Cond> .OR. <AndCond>
[15] → <AndCond>
[16] <AndCond> → <AndCond> .AND. <EndCond>
[17] → <EndCond>
[18] <EndCond> → <SimpleCond>
[19] → .NOT. <SimpleCond>
[20] <SimpleCond> → <ExprArith> <Comp> <ExprArith>
[21] <Comp> → .EQ.
[22] → .GE.
[23] → .GT.
[24] → .LE.
[25] → .LT.
[26] → .NE.
[27] <ExprArith> → <ExprArith> + <ExprTerm>
[28] → <ExprArith> - <ExprTerm>
[29] → <ExprTerm>
[30] <ExprTerm> → <ExprTerm> * <ExprFact>
[31] → <ExprTerm> / <ExprFact>
[32] → <ExprFact>
[33] <ExprFact> → [VarName]
[34] → [Number]
[35] →(<ExprArith>)
[36] → - <ExprFact>
[37] <If> → IF (<Cond>) THEN [EndLine] <Code> ENDIF
[38] → IF (<Cond>) THEN [EndLine] <Code> ELSE [EndLine]<Code> ENDIF
[39] <Do> → DO [VarName] = [Number], [Number] [EndLine] <Code> ENDDO
[40] <Print> → PRINT*, <ExpList>
[41] <Read> → READ*, <VarList>
[42] <ExpList> → <ExprArith>, <ExpList>
[43] → <ExprArith>
Figure 2: Unambiguous Grammar
Left Factor removal
Application of the above algorithm to our set of unambiguous rules will render all rules
left-factored, but it need only be applied to the following rules:
Left factor removal on <VarList>
<VarList> → [VarName], <VarList>
→ [VarName]
In order to remove the left factor of <VarList> ([VarName]) we replace the former rules with
the following rules:
<VarList> → [VarName] <VarListCont>
<VarListCont> → ,<VarList>
→ ε
Left factor removal on <ExprArith>
<ExprArith> → <ExprArith> + <ExprTerm>
→ <ExprArith> - <ExprTerm>
→ <ExprTerm>
In order to remove the left factor of <ExprArith> (<ExprArith>) we replace the former rules
with the following rules:
<ExprArith> → <ExprArith><SumDiff>
→ <ExprTerm>
<SumDiff> → + <ExprTerm>
→ - <ExprTerm>
Left factor removal on <ExprTerm>
<ExprTerm> → <ExprTerm> * <ExprFact>
→ <ExprTerm> / <ExprFact>
→ <ExprFact>
In order to remove the left factor of <ExprTerm> (<ExprTerm>) we replace the former rules
with the following rules:
<ExprTerm> → <ExprTerm> <ProdDiv>
→<ExprFact>
<ProdDiv> → * <ExprFact>
→ / <ExprFact>
Left factor removal on <If>
<If> → IF (<Cond>) THEN [EndLine] <Code> ENDIF
→ IF (<Cond>) THEN [EndLine] <Code> ELSE [EndLine]<Code> ENDIF
In order to remove the left factor of <If> (IF (<Cond>) THEN [EndLine] <Code>) we replace
the former rules with the following rules:
<If> → IF (<Cond>) THEN [EndLine] <Code><ElIf>
<ElIF> → ENDIF
→ ELSE [EndLine]<Code> ENDIF
Left factor removal on <ExpList>
<ExpList> → <ExprArith>, <ExpList>
→ <ExprArith>
In order to remove the left factor of <ExpList> (<ExprArith>) we replace the former rules with
the following rules:
<ExpList> → <ExprArith> <ExpListCont>
<ExpListCont> → ,<ExpList>
→ ε
After applying the left-factor removal algorithm we get the following grammar with the modified
rule sets highlighted in red:
[1] <Program> → PROGRAM [ProgName] [EndLine] <Vars> <Code> END
[2] <Vars> → INTEGER <VarList> [EndLine]
[3] → ε
[4] <VarList> → [VarName] <VarListCont>
[5] <VarListCont> → ,<VarList>
[6] → ε
[7] <Code> → <Instruction> [EndLine] <Code>
[8] → ε
[9] <Instruction> → <Assign>
[10] → <If>
[11] → <Do>
[12] → <Print>
[13] → <Read>
[14] <Assign> → [VarName] = <ExprArith>
[15] <Cond> → <Cond> .OR. <AndCond>
[16] → <AndCond>
[17] <AndCond> → <AndCond> .AND. <EndCond>
[18] → <EndCond>
[19] <EndCond> → <SimpleCond>
[20] → .NOT. <SimpleCond>
[21] <SimpleCond> → <ExprArith> <Comp> <ExprArith>
[22] <Comp> → .EQ.
[23] → .GE.
[24] → .GT.
[25] → .LE.
[26] → .LT.
[27] → .NE.
[28] <ExprArith> → <ExprArith><SumDiff>
[29] → <ExprTerm>
[30] <SumDiff> → + <ExprTerm>
[31] → - <ExprTerm>
[32] <ExprTerm> → <ExprTerm> <ProdDiv>
[33] →<ExprFact>
[34] <ProdDiv> → * <ExprFact>
[35] → / <ExprFact>
[36] <ExprFact> → [VarName]
[37] → [Number]
[38] →(<ExprArith>)
[39] → - <ExprFact>
[40] <If> → IF (<Cond>) THEN [EndLine] <Code><ElIf>
[41] <ElIF> → ENDIF
[42] → ELSE [EndLine]<Code> ENDIF
[43] <Do> → DO [VarName] = [Number], [Number] [EndLine] <Code> ENDDO
[44] <Print> → PRINT*, <ExpList>
[45] <Read> → READ*, <VarList>
[46] <ExpList> → <ExprArith> <ExpListCont>
[47] <ExpListCont> → ,<ExpList>
[48] → ε
Figure 3: Grammar after left factor removal
Left-recursion removal
Removal of left recursion is required for our parser since it is a top-down parser. If kept in the
grammar, left-recursion could lead to infinite loops in the parser execution, an undesirable effect.
Application of the above algorithm to the latest grammar will remove and replace rules
containing left-recursion. Notably to the following rules:
Removal of left-recursion on :
<Cond> → <Cond> .OR. <AndCond>
→ <AndCond>
Replace these rules by:
<Cond> → <AndCond> <PostCond>
<PostCond> →.OR. <AndCond><PostCond>
→ ε
Removal of left-recursion on :
<AndCond> → <AndCond> .AND. <EndCond>
→ <EndCond>
Replace these rules by:
<AndCond> → <EndCond><PoAndCond>
<PoAndCond> →.AND. <EndCond><PoAndCond>
→ε
Removal of left-recursion on :
<ExprArith> → <ExprArith><SumDiff>
→ <ExprTerm>
Replace these rules by:
<ExprArith> → <ExprTerm><PostExprArith>
<PostExprArith> → <SumDiff><PostExprArith>
→ ε
Removal of left-recursion on :
<ExprTerm> → <ExprTerm> <ProdDiv>
→<ExprFact>
Replace these rules by:
<ExprTerm> → <ExprFact> <PoExprTerm>
<PoExprTerm> → <ProdDiv><PoExprTerm>
→ε
Final Grammar
[1] <Program> → PROGRAM [ProgName] [EndLine] <Vars> <Code> END
[2] <Vars> → INTEGER <VarList> [EndLine]
[3] → ε
[4] <VarList> → [VarName] <VarListCont>
[5] <VarListCont> → ,<VarList>
[6] → ε
[7] <Code> → <Instruction> [EndLine] <Code>
[8] → ε
[9] <Instruction> → <Assign>
[10] → <If>
[11] → <Do>
[12] → <Print>
[13] → <Read>
[14] <Assign> → [VarName] = <ExprArith>
[15] <Cond> → <AndCond> <PostCond>
[16] <PostCond> →.OR. <AndCond><PostCond>
[17] → ε
[18] <AndCond> → <EndCond><PoAndCond>
[19] <PoAndCond> →.AND. <EndCond><PoAndCond>
[20] →ε
[21] <EndCond> → <SimpleCond>
[22] → .NOT. <SimpleCond>
[23] <SimpleCond> → <ExprArith> <Comp> <ExprArith>
[24] <Comp> → .EQ.
[25] → .GE.
[26] → .GT.
[27] → .LE.
[28] → .LT.
[29] → .NE.
[30] <ExprArith> → <ExprTerm><PostExprArith>
[31] <PostExprArith> → <SumDiff><PostExprArith>
[32] → ε
[33] <SumDiff> → + <ExprTerm>
[34] → - <ExprTerm>
[35] <ExprTerm> → <ExprFact> <PoExprTerm>
[36] <PoExprTerm> → <ProdDiv><PoExprTerm>
[37] →ε
[38] <ProdDiv> → * <ExprFact>
[39] → / <ExprFact>
[40] <ExprFact> → [VarName]
[41] → [Number]
[42] →(<ExprArith>)
[43] → - <ExprFact>
[44] <If> → IF (<Cond>) THEN [EndLine] <Code><ElIf>
[45] <ElIF> → ENDIF
[46] → ELSE [EndLine]<Code> ENDIF
[47] <Do> → DO [VarName] = [Number], [Number] [EndLine] <Code> ENDDO
[48] <Print> → PRINT*, <ExpList>
[49] <Read> → READ*, <VarList>
[50] <ExpList> → <ExprArith> <ExpListCont>
[51] <ExpListCont> → ,<ExpList>
[52] → ε
First and Follow
After removal of left-recursion we find a grammar that is ready to be used in a LL(1) top-down
parser. The last step in order to begin programing the parser is to create an action table. In order
to create the action table we compute the First and Follow of all variables in our grammar.
Variable First1() Follow1()
<Program> PROGRAM
<Vars> INTEGER | ε [VarName] | IF | DO | PRINT* |
READ* | END
<VarList> [VarName] [EndLine]
<VarListCont> , | ε [EndLine]
<Code> [VarName] | IF | DO | PRINT* |
READ* | ε
END | ENDIF | ELSE | ENDDO
<Instruction> [VarName] | IF | DO | PRINT* |
READ*
[EndLine]
<Assign> [VarName] [EndLine]
<Cond> [VarName] | [Number] | ( | - | .NOT. )
<PostCond> .OR. | ε )
<AndCond> [VarName] | [Number] | ( | - | .NOT. .OR. | )
<PoAndCond> .AND. | ε .OR. | )
<EndCond> [VarName] | [Number] | ( | - | .NOT. .AND. | .OR. | )
<SimpleCond> [VarName] | [Number] | ( | - .AND. | .OR. | )
<Comp> .EQ. | .GE. | .GT. | .LE. | .LT. | .NE. [VarName] | [Number] | ( | -
<ExprArith> [VarName] | [Number] | ( | - [EndLine] | .EQ. | .GE. | .GT. | .LE. |
.LT. | .NE. | .AND. | .OR. | ) | ,
<PostExprArith> + | - | ε [EndLine] | .EQ. | .GE. | .GT. | .LE. |
.LT. | .NE. | .AND. | .OR. | ) | ,
<SumDiff> + | - + | - | [EndLine] | .EQ. | .GE. | .GT. |
.LE. | .LT. | .NE. | .AND. | .OR. | ) | ,
<ExprTerm> [VarName] | [Number] | ( | - + | - | [EndLine] | .EQ. | .GE. | .GT. |
.LE. | .LT. | .NE. | .AND. | .OR. | ) | ,
<PoExprTerm> * | / | ε
+ | - | [EndLine] | .EQ. | .GE. | .GT. |
.LE. | .LT. | .NE. | .AND. | .OR. | ) | ,
<ProdDiv> * | / * | / | + | - | [EndLine] | .EQ. | .GE. |
.GT. | .LE. | .LT. | .NE. | .AND. | .OR.
| ) | ,
<ExprFact> [VarName] | [Number] | ( | - * | / | + | - | [EndLine] | .EQ. | .GE. |
.GT. | .LE. | .LT. | .NE. | .AND. | .OR.
| ) | ,
<If> IF [EndLine]
<ElIf> ENDIF | ELSE [EndLine]
<Do> DO [EndLine]
<Print> PRINT* [EndLine]
<Read> READ* [EndLine]
<ExpList> [VarName] | [Number] | ( | - [EndLine]
<ExpListCont> , | ε [EndLine]
Figure 5: First and Follow Table
Action Table
