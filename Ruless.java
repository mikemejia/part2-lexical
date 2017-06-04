public class Ruless{
	//creates the tokens in the order that they are inputed in the stack when the file is being read.

	public static void Ruless(){
    Token[] program = new Token [] {new Token(LexicalUnit.END),new Token(Variable.CODE),
                                                        new Token(Variable.VARS),
                                                        new Token(LexicalUnit.ENDLINE),
                                                        new Token(LexicalUnit.VARNAME),
                                                        new Token(LexicalUnit.PROGRAM)};
    Token[] vars =  new Token[] {new Token(LexicalUnit.ENDLINE),
                                                        new Token(Variable.VARLIST), 
                                                        new Token(LexicalUnit.INTEGER)};
    Token[] vars_a = null;
    Token[] varlist = new Token[] { new Token(Variable.VARLISTCONT), new Token(LexicalUnit.VARNAME)};
    Token[] varlistcont =  new Token[] { new Token(Variable.VARLIST),new Token(LexicalUnit.COMMA)};
    Token[] varlistcont_a = null;
    Token[] code = new Token[] {new Token(Variable.CODE),new Token(LexicalUnit.ENDLINE),
                                                         new Token(Variable.INSTRUCTION)};
    Token[] code_a = null;
    Token[] instruction_a = new Token[] {new Token(Variable.ASSIGN)};
    Token[] instruction_b = new Token[] {new Token(Variable.IF)};
    Token[] instruction_c = new Token[] {new Token(Variable.DO)};
    Token[] instruction_d = new Token[] {new Token(Variable.PRINT)};
    Token[] instruction_e= new Token[] {new Token(Variable.READ)};
    Token[] assign = new Token[] {  new Token(Variable.EXPRARITH),
                                    new Token(LexicalUnit.EQUAL),
                                    new Token(LexicalUnit.VARNAME)};
    Token[] cond = new Token[] {    new Token(Variable.POSTCOND),
                                    new Token(Variable.ANDCOND)};
    Token[] postcond = new Token[] { new Token(Variable.POSTCOND),new Token(Variable.ANDCOND),
                                    new Token(LexicalUnit.OR)};
    Token[] postcond_a = null;
    Token[] andcond = new Token[] { new Token(Variable.POANDCOND),
                                          new Token(Variable.ENDCOND)};
    Token[] poandcond = new Token[] { new Token(Variable.POANDCOND),new Token(Variable.ENDCOND),
                                      new Token(LexicalUnit.AND)};
    Token[] poandcond_a = null;
    Token[] endcond = new Token[] { new Token(Variable.SIMPLECOND)};
    Token[] endcond_a = new Token[] { new Token(Variable.SIMPLECOND),new Token(LexicalUnit.NOT)};
    Token[] simplecond = new Token[] { new Token(Variable.EXPRARITH),
                                          new Token(Variable.COMP),
                                          new Token(Variable.EXPRARITH)};
    Token[] comp_a = new Token[] {      new Token(LexicalUnit.EQUAL)};
    Token[] comp_b = new Token[] {      new Token(LexicalUnit.GREATER_EQUAL)};
    Token[] comp_c = new Token[] {      new Token(LexicalUnit.GREATER)};
    Token[] comp_d = new Token[] {      new Token(LexicalUnit.SMALLER_EQUAL)};
    Token[] comp_e = new Token[] {      new Token(LexicalUnit.SMALLER)};
    Token[] comp_f = new Token[] {      new Token(LexicalUnit.DIFFERENT)};
    Token[] exprarith = new Token[] {    new Token(Variable.POSTEXPRARITH),
                                          new Token(Variable.EXPRTERM)};
    Token[] postexprarith = new Token[] {    new Token(Variable.POSTEXPRARITH),
                                          new Token(Variable.SUMDIFF)};
    Token[] postexprarith_a = null;                                         
    Token[] sumDiff_a = new Token[] {       new Token(Variable.EXPRTERM),
                                          new Token(LexicalUnit.PLUS)};
    Token[] sumDiff_b = new Token[] {    new Token(Variable.EXPRTERM),
                                          new Token(LexicalUnit.MINUS)};
    Token[] exprterm = new Token[] {      new Token(Variable.POEXPRTERM),
                                          new Token(Variable.EXPRFACT)};
    Token[] poexprterm = new Token[] {    new Token(Variable.POEXPRTERM),
                                          new Token(Variable.PRODIV)};
    Token[] poexprterm_a = null;
    Token[] proddiv_a = new Token[] {    new Token(Variable.EXPRFACT),
                                         new Token(LexicalUnit.TIMES)};
    Token[] proddiv_b = new Token[] {    new Token(Variable.EXPRFACT),
                                         new Token(LexicalUnit.DIVIDE)};
    Token[] exprfact_a = new Token[] {   new Token(LexicalUnit.VARNAME)};
    Token[] exprfact_b = new Token[] {   new Token(LexicalUnit.NUMBER)};
    Token[] exprfact_c = new Token[] {   new Token(LexicalUnit.RIGHT_PARENTHESIS),
                                         new Token(Variable.EXPRARITH),
                                         new Token(LexicalUnit.LEFT_PARENTHESIS)};
    Token[] exprfact_d = new Token[] {   new Token(Variable.EXPRFACT),
                                            new Token(LexicalUnit.MINUS)};
    Token[] if_ = new Token[] {           new Token(Variable.ELLF),
                                          new Token(Variable.CODE),
                                          new Token(LexicalUnit.ENDLINE),
                                          new Token(LexicalUnit.THEN),
                                          new Token(LexicalUnit.RIGHT_PARENTHESIS),
                                          new Token(Variable.COND),
                                          new Token(LexicalUnit.LEFT_PARENTHESIS),
                                          new Token(LexicalUnit.IF)};
    Token[] ellf_a = new Token[] {         new Token(LexicalUnit.ENDIF)};
    Token[] ellf_b = new Token[] {           new Token(LexicalUnit.ENDIF),
                                             new Token(Variable.CODE),
                                             new Token(LexicalUnit.ENDLINE),
                                             new Token(LexicalUnit.ELSE)};
    Token[] do_ = new Token[] {               new Token(LexicalUnit.ENDDO),
                                              new Token(Variable.CODE),
                                              new Token(LexicalUnit.ENDLINE),
                                              new Token(LexicalUnit.NUMBER),
                                              new Token(LexicalUnit.COMMA),
                                              new Token(LexicalUnit.NUMBER),
                                              new Token(LexicalUnit.EQUAL),
                                              new Token(LexicalUnit.VARNAME),
                                              new Token(LexicalUnit.DO)};
    Token[] print = new Token[] {             new Token(Variable.EXPLIST),
                                            new Token(LexicalUnit.COMMA),
                                            new Token(LexicalUnit.PRINT)};
    Token[] read = new Token[] {             new Token(Variable.VARLIST),
                                            new Token(LexicalUnit.COMMA),
                                            new Token(LexicalUnit.READ)};                                        
    Token[] explist = new Token[] {         new Token(Variable.EXPLISTCONT),
                                            new Token(Variable.EXPRARITH)};
    Token[] explistcont = new Token[] {         new Token(Variable.EXPLIST),
                                                new Token(LexicalUnit.COMMA)};
    Token[] explistcont_a = null;
//then we add these tokens to the rules these are the rules after we have corrected the rule table by hand.

	Main.addToRules(1,program);
    Main.addToRules(2,vars); 
    Main.addToRules(3,vars_a);
    Main.addToRules(4,varlist);
    Main.addToRules(5,varlistcont); 
    Main.addToRules(6,varlistcont_a);
    Main.addToRules(7,code);
    Main.addToRules(8,code_a);
    Main.addToRules(9,instruction_a);
    Main.addToRules(10,instruction_b);
    Main.addToRules(11,instruction_c);
    Main.addToRules(12,instruction_d);
    Main.addToRules(13,instruction_e);
    Main.addToRules(14,assign);
    Main.addToRules(15,cond);
    Main.addToRules(16,postcond);
    Main.addToRules(17,postcond_a);
    Main.addToRules(18,andcond);
    Main.addToRules(19,poandcond);
    Main.addToRules(20,poandcond_a);
    Main.addToRules(21,endcond);
    Main.addToRules(22,endcond_a);
    Main.addToRules(23,simplecond);
    Main.addToRules(24,comp_a);
    Main.addToRules(25,comp_b);
    Main.addToRules(26,comp_c);
    Main.addToRules(27,comp_d);
    Main.addToRules(28,comp_e);
    Main.addToRules(29,comp_f);
    Main.addToRules(30,exprarith);
    Main.addToRules(31,postexprarith);
    Main.addToRules(32,postexprarith_a);
    Main.addToRules(33,sumDiff_a);
    Main.addToRules(34,sumDiff_b);
    Main.addToRules(35,exprterm);
    Main.addToRules(36,poexprterm);
    Main.addToRules(37,poexprterm_a);
    Main.addToRules(38,proddiv_a);
    Main.addToRules(39,proddiv_b);
    Main.addToRules(40,exprfact_a);
    Main.addToRules(41,exprfact_b);
    Main.addToRules(42,exprfact_c);
    Main.addToRules(43,exprfact_d);
    Main.addToRules(44,if_);
    Main.addToRules(45,ellf_a);
    Main.addToRules(46,ellf_b);
    Main.addToRules(47,do_);
    Main.addToRules(48,print);
    Main.addToRules(49,read);
    Main.addToRules(50,explist);
    Main.addToRules(51,explistcont);
    Main.addToRules(52,explistcont_a);

    






	}





}