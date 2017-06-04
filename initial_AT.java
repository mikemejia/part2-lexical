

public class initial_AT{

//this is just copying the action table we made. with each input there will be a correlation with the rules. 

public static void initial_AT(){
 Main.addToActionTable(Variable.PROGRAM, LexicalUnit.PROGRAM, 1);
 Main.addToActionTable(Variable.VARS, LexicalUnit.INTEGER, 2);
 Main.addToActionTable(Variable.VARS, LexicalUnit.VARNAME, 3);
 Main.addToActionTable(Variable.VARS, LexicalUnit.END, 3);
 Main.addToActionTable(Variable.VARS, LexicalUnit.IF, 3);
 Main.addToActionTable(Variable.VARS, LexicalUnit.DO, 3);
 Main.addToActionTable(Variable.VARS, LexicalUnit.PRINT, 3);
 Main.addToActionTable(Variable.VARS, LexicalUnit.READ, 3);	
 Main.addToActionTable(Variable.VARLIST, LexicalUnit.VARNAME, 4);
 Main.addToActionTable(Variable.VARLISTCONT, LexicalUnit.COMMA, 5);
 Main.addToActionTable(Variable.VARLISTCONT, LexicalUnit.ENDLINE, 6);
 Main.addToActionTable(Variable.CODE, LexicalUnit.VARNAME, 7);
 Main.addToActionTable(Variable.CODE, LexicalUnit.END, 8); 
 Main.addToActionTable(Variable.CODE, LexicalUnit.IF, 7);
 Main.addToActionTable(Variable.CODE, LexicalUnit.ENDIF, 8);
 Main.addToActionTable(Variable.CODE, LexicalUnit.ELSE, 8);
 Main.addToActionTable(Variable.CODE, LexicalUnit.DO, 7);
 Main.addToActionTable(Variable.CODE, LexicalUnit.ENDDO, 8);
 Main.addToActionTable(Variable.CODE, LexicalUnit.PRINT, 7);
 Main.addToActionTable(Variable.CODE, LexicalUnit.READ, 7);
 Main.addToActionTable(Variable.INSTRUCTION, LexicalUnit.VARNAME, 9);
 Main.addToActionTable(Variable.INSTRUCTION, LexicalUnit.IF, 10);
 Main.addToActionTable(Variable.INSTRUCTION, LexicalUnit.DO, 11);
 Main.addToActionTable(Variable.INSTRUCTION, LexicalUnit.PRINT, 12);
 Main.addToActionTable(Variable.INSTRUCTION, LexicalUnit.READ, 13);
 Main.addToActionTable(Variable.ASSIGN, LexicalUnit.VARNAME, 14);
 Main.addToActionTable(Variable.COND, LexicalUnit.VARNAME, 15);
 Main.addToActionTable(Variable.COND, LexicalUnit.NUMBER, 15);
 Main.addToActionTable(Variable.COND, LexicalUnit.LEFT_PARENTHESIS, 15);
 Main.addToActionTable(Variable.COND, LexicalUnit.MINUS, 15);
 Main.addToActionTable(Variable.COND, LexicalUnit.NOT, 15);
 Main.addToActionTable(Variable.POSTCOND, LexicalUnit.RIGHT_PARENTHESIS, 17);
 Main.addToActionTable(Variable.POSTCOND, LexicalUnit.OR, 16);
 Main.addToActionTable(Variable.ANDCOND, LexicalUnit.VARNAME, 18);
 Main.addToActionTable(Variable.ANDCOND, LexicalUnit.NUMBER, 18);
 Main.addToActionTable(Variable.ANDCOND, LexicalUnit.LEFT_PARENTHESIS, 18);
 Main.addToActionTable(Variable.ANDCOND, LexicalUnit.MINUS, 18);
 Main.addToActionTable(Variable.ANDCOND, LexicalUnit.NOT, 18);
 Main.addToActionTable(Variable.POANDCOND, LexicalUnit.RIGHT_PARENTHESIS, 20);
 Main.addToActionTable(Variable.POANDCOND, LexicalUnit.AND, 19);
 Main.addToActionTable(Variable.POANDCOND, LexicalUnit.VARNAME, 20);
 Main.addToActionTable(Variable.ENDCOND, LexicalUnit.VARNAME, 21);
 Main.addToActionTable(Variable.ENDCOND, LexicalUnit.NUMBER, 21);
 Main.addToActionTable(Variable.ENDCOND, LexicalUnit.RIGHT_PARENTHESIS, 21);
 Main.addToActionTable(Variable.ENDCOND, LexicalUnit.NOT, 22);
 Main.addToActionTable(Variable.SIMPLECOND, LexicalUnit.VARNAME, 23);
 Main.addToActionTable(Variable.SIMPLECOND, LexicalUnit.NUMBER, 23);
 Main.addToActionTable(Variable.SIMPLECOND, LexicalUnit.LEFT_PARENTHESIS, 23);
 Main.addToActionTable(Variable.SIMPLECOND, LexicalUnit.MINUS, 23);
 Main.addToActionTable(Variable.COMP, LexicalUnit.EQUAL_COMPARE, 24);
 Main.addToActionTable(Variable.COMP, LexicalUnit.GREATER_EQUAL, 25);
 Main.addToActionTable(Variable.COMP, LexicalUnit.GREATER, 26);
 Main.addToActionTable(Variable.COMP, LexicalUnit.SMALLER_EQUAL, 27);
 Main.addToActionTable(Variable.COMP, LexicalUnit.SMALLER, 28);
 Main.addToActionTable(Variable.COMP, LexicalUnit.DIFFERENT, 29);
 Main.addToActionTable(Variable.EXPRARITH, LexicalUnit.VARNAME, 30);
 Main.addToActionTable(Variable.EXPRARITH, LexicalUnit.NUMBER, 30);
 Main.addToActionTable(Variable.EXPRARITH, LexicalUnit.LEFT_PARENTHESIS, 30);
 Main.addToActionTable(Variable.EXPRARITH, LexicalUnit.MINUS, 30);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.COMMA, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.LEFT_PARENTHESIS, 31);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.RIGHT_PARENTHESIS, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.MINUS, 31);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.AND, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.OR, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.EQUAL_COMPARE, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.GREATER_EQUAL, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.GREATER, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.SMALLER_EQUAL, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.SMALLER, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.DIFFERENT, 32);
 Main.addToActionTable(Variable.POSTEXPRARITH, LexicalUnit.ENDLINE, 32);
 Main.addToActionTable(Variable.SUMDIFF, LexicalUnit.MINUS, 34);
 Main.addToActionTable(Variable.SUMDIFF, LexicalUnit.PLUS, 33);
 Main.addToActionTable(Variable.EXPRTERM, LexicalUnit.VARNAME, 35);
 Main.addToActionTable(Variable.EXPRTERM, LexicalUnit.NUMBER, 35);
 Main.addToActionTable(Variable.EXPRTERM, LexicalUnit.LEFT_PARENTHESIS, 35);
 Main.addToActionTable(Variable.EXPRTERM, LexicalUnit.MINUS, 35);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.COMMA, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.RIGHT_PARENTHESIS, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.MINUS, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.PLUS, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.TIMES, 36);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.DIVIDE, 36);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.AND, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.OR, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.EQUAL_COMPARE, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.GREATER_EQUAL, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.GREATER, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.SMALLER_EQUAL, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.SMALLER, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.DIFFERENT, 37);
 Main.addToActionTable(Variable.POEXPRTERM, LexicalUnit.ENDLINE, 37);
 Main.addToActionTable(Variable.PRODIV, LexicalUnit.TIMES, 38);
 Main.addToActionTable(Variable.PRODIV, LexicalUnit.DIVIDE, 39);
 Main.addToActionTable(Variable.EXPRFACT, LexicalUnit.VARNAME, 40);
 Main.addToActionTable(Variable.EXPRFACT, LexicalUnit.NUMBER, 41);
 Main.addToActionTable(Variable.EXPRFACT, LexicalUnit.LEFT_PARENTHESIS, 42);
 Main.addToActionTable(Variable.EXPRFACT, LexicalUnit.MINUS, 43);
 Main.addToActionTable(Variable.IF, LexicalUnit.IF, 44);
 Main.addToActionTable(Variable.ELLF, LexicalUnit.ENDIF, 45);
 Main.addToActionTable(Variable.ELLF, LexicalUnit.ELSE, 46);
 Main.addToActionTable(Variable.DO, LexicalUnit.DO, 47);
 Main.addToActionTable(Variable.PRINT, LexicalUnit.PRINT, 48);
 Main.addToActionTable(Variable.READ, LexicalUnit.READ, 49);
 Main.addToActionTable(Variable.EXPLIST, LexicalUnit.VARNAME, 50);
 Main.addToActionTable(Variable.EXPLIST, LexicalUnit.NUMBER, 50);
 Main.addToActionTable(Variable.EXPLIST, LexicalUnit.RIGHT_PARENTHESIS, 50);
 Main.addToActionTable(Variable.EXPLIST, LexicalUnit.MINUS, 50);
 Main.addToActionTable(Variable.EXPLISTCONT, LexicalUnit.COMMA, 51);
 Main.addToActionTable(Variable.EXPLISTCONT, LexicalUnit.ENDLINE, 52);



}


}