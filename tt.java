

public class tt{
// this will give the string with each case representing the rule that is being used. just an attempt to make the main class a bit cleaner. 
public String tr(int x){
   
    switch (x) {
            case 1:
            return "<Program> 	>>>> PROGRAM [ProgName] [EndLine] <Vars> <Code> END";
            case 2:
            return "<Vars>		>>>> INTEGER <VarList> [EndLine]";
            case 3: 
            return "<Vars>		>>>> E";
            case 4:
            return "<VarList>	>>>> [VarName] <VarListCont>";
            case 5:
            return "<VarListCont>   >>>> ,<VarList>";
            case 6:
            return "<VarListCont>	>>>> E";        
            case 7:
            return "<Code> 		>>>> <Instruction> [EndLine] <Code>";      
            case 8:
            return "<Code>		>>>> E";
            case 9:
            return "<Instruction> 	>>>> <Assign>";
            case 10:
            return "<Instruction> 	>>>> <If>";
            case 11:
            return "<Instruction> 	>>>> <Do>";
            case 12:
            return "<Instruction>	>>>> <Print>";
            case 13:
            return "<Instruction>	>>>> <Read>";
            case 14:
            return "<Assign>	>>>> [VarName] = <ExprArith>";
            case 15:
            return "<Cond>		>>>> <AndCond> <PostCond>";
            case 16:
            return "<PostCond>      >>>>.OR. <AndCond><PostCond>";
            case 17:
            return "<PostCond> 			>>>> E";
            case 18:
            return "<AndCond>	>>>> <EndCond><PoAndCond>";
            case 19:
            return "<PoAndCond>  >>>>.AND. <EndCond><PoAndCond>";
            case 20:
            return "<PoAndCond> 			>>>>E";
            case 21:
            return "<EndCond>	>>>> <SimpleCond>";
            case 22:
            return "<EndCond>	>>>> .NOT. <SimpleCond>";
            case 23:
            return "<SimpleCond>	>>>> <ExprArith> <Comp> <ExprArith>";
            case 24:
            return "<Comp>		>>>> .EQ.";
            case 25:
            return "<Comp>		>>>> .GE.";
            case 26:
            return "<Comp>		>>>> .GT.";
            case 27:
            return "<Comp>		>>>> .LE.";
            case 28:
            return "<Comp>		>>>> .LT";
            case 29:
            return "<Comp>		>>>> .NE";
            case 30:
            return "<ExprArith>	>>>> <ExprTerm><PostExprArith>";
            case 31:
            return "<PostExprArith>>>>> <SumDiff><PostExprArith>";
            case 32:
            return "<PostExprArith>>>>> E";
            case 33:
            return "<SumDiff>	>>>> + <ExprTerm>";
            case 34:
            return "<SumDiff>	>>>> - <ExprTerm>";
            case 35:
            return "<ExprTerm>	>>>> <ExprFact> <PoExprTerm>";
            case 36:
            return "<PoExprTerm> >>>> <ProdDiv><PoExprTerm>";
            case 37:
            return "<PoExprTerm>  >>>>E";
            case 38:
            return "<ProdDiv>	>>>> * <ExprFact>";
            case 39:
            return "<ProdDiv>	>>>> / <ExprFact>";
            case 40:
            return "<ExprFact>	>>>> [VarName]";
            case 41:
            return "<ExprFact>	>>>> [Number]";
            case 42:
            return "<ExprFact>	>>>>(<ExprArith>)";
            case 43:
            return "<ExprFact>	>>>> - <ExprFact>";
            case 44:
            return "<If>		>>>> IF (<Cond>) THEN [EndLine] <Code><ElIf>";
            case 45:
            return "<ElIF>		>>>> ENDIF";
            case 46:
            return "<ElIF>		>>>> ELSE [EndLine]<Code> ENDIF";
            case 47:
            return "<Do>		>>>> DO [VarName] = [Number], [Number] [EndLine] <Code> ENDDO";
            case 48:
            return "<Print>		>>>> PRINT*, <ExpList>";
            case 49:
            return "<Read>		>>>> READ*, <VarList>";
            case 50:
            return "<ExpList>	>>>> <ExprArith> <ExpListCont>";
            case 51:
            return "<ExpListCont>	>>>> ,<ExpList>";
            case 52:
            return "<ExpListCont>	>>>> E";

                    
            
        } return null;
        }
  }