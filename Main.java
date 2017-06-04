import java.io.*;
import java.util.*;

public class Main {
private static Stack<Token> stack;
  private static Rule[] rules;   
  static EnumMap<Variable, EnumMap<LexicalUnit, Integer>> actionTable;
  static boolean accept, error;
 static int rulenumber;
List<String> words = new ArrayList<String>();
List<String> line = new ArrayList<String>();
boolean PR = false;
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
	for (int i = 0; i < args.length; i++) {
		initial();
			BufferedReader br = new BufferedReader(new FileReader(args[i]));

			tester t = new tester(br);//our flex file
			Stack<Token> follow_=new Stack<Token>();
			while(!error && !accept){
        	
        	if (follow_.empty())
        		follow_.push(new Token(t.next().getType()));
        	begins(follow_);
        }
				
 		}	
 			
 	}
 	

 	private static class Rule {
	  private int number;
	  private Token[] right;

	  public Rule(int number, Token[] right){
	      this.number=number;
	      this.right=right;
	  }

    public void produce(){
	  	if(!this.isEpsilon()) {
				Vector<Token> v = new Vector<Token>(Arrays.asList(right));
				stack.addAll(v);
	  	}
	  	
	  }

	  public int getNumber(){ return this.number;}

    
	  public boolean isEpsilon() {
	  	if (this.right == null) return true;
	  	return false;
	  }

}

public static Rule getRule(int number){
  return rules[number-1];
}

public static Rule getRule(Variable v, LexicalUnit lu){
	if(actionTable.containsKey(v)){
		EnumMap<LexicalUnit, Integer> actionTableLine = actionTable.get(v);
		if(actionTableLine.containsKey(lu)){
			int r = actionTableLine.get(lu);
			return getRule(r);
		}
	}
	System.out.println("the Variable "+v+", cannot continue with "+lu+" Error at rule" + rulenumber);
	return null;
}



public static void initial(){
  rules = new Rule[53];
  Ruless.Ruless();
  actionTable= new EnumMap<Variable, EnumMap<LexicalUnit, Integer>>(Variable.class);
  initial_AT.initial_AT();
  accept=false;
  error=false;
  stack=new Stack<Token>();
  stack.push(new Token(Variable.PROGRAM));
}


 	public void sym(LexicalUnit a, String b){
 		Symbol s = new Symbol(a,b);
 		
 	}

 	public static void begins(Stack<Token> follow_){
          
        //gone through the whole input means we have no errors and are finished
         	if(stack.empty()){
			 				if(follow_.pop().isEND_OF_STREAM()){
       					 accept=true; //ACCEPT
       					System.out.print("Parsed!");}
       				else
       					 error=true;  //REFUSE
			 		}

			 		//continue until its empty
			 		else{
 						Token top=stack.pop();
 						Token first=follow_.peek();
 						//PRODUCE
	  				if (top.isVariable()) {
	 				   
	 				    Rule r = getRule(top.V, first.L);
	 				    if(r!=null) {
	 				    	
	 				    	tt abc = new tt();
	 				    	rulenumber = r.getNumber();
                System.out.println(r.getNumber()+abc.tr(r.getNumber()));
	 				    	r.produce();
	 				    }
	 				    else error=true;
	  				}
	  				else if (top.isTerminal()) {
              
	  					if(top.equals(follow_.pop())) {  
	  						
	  					}
	  				  else { // Refuse input
	  						System.out.println("Input symbol is not in the language");
	  						error=true;
	  					}
	  				}
	  				else { // Refuse input
              System.out.println("Input symbol is not in the language");
            }
	    		}
}

public static void addToRules(int number, Token[] right){
	Rule r = new Rule(number, right);
	rules[number-1]=r;
}
public static void addToActionTable(Variable v, LexicalUnit lu, int num){
	EnumMap<LexicalUnit, Integer> e;
	if(!actionTable.containsKey(v)) {
			e = new EnumMap<LexicalUnit, Integer>(LexicalUnit.class);
			e.put(lu, num);
			actionTable.put(v, e);}
	else {
		e = actionTable.get(v);
		e.put(lu,num);
	}
}



	
	}
       	 
        
    
