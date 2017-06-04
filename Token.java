
public class Token {
    LexicalUnit L;
    Variable V;
    int type; 
    //with this class we can create the tokens or snippets that the parser extracts from the file and what should come after.
    public Token(LexicalUnit L){
        this.L=L;
        this.V=null;
        this.type=1;
    }
    
    public Token(Variable V){
        this.L=null;
        this.V=V;
        this.type=2;
    }
  
    public Token(Variable V, LexicalUnit L){
        this.L=L;
        this.V=V;
        this.type=3;
    }
    
    public boolean isTerminal(){
        if(this.type==1) return true;
        else return false;
    }
    
    public boolean isVariable(){
        if(this.type==2) return true;
        else return false;
    }
    
    public boolean isEND_OF_STREAM(){
    	if(this.isTerminal() && this.L==LexicalUnit.ENDLINE)
    		return true;
    	else return false;
    }
    
    public String toString(){
    	if(this.type==1) return this.L.toString();
    	else if(this.type==2) return "<"+new String(this.V.toString()).toLowerCase()+">";
    	return "";
    }
    
    public boolean equals(Token tok){
    	return (this.type==tok.type && this.V==tok.V && this.L==tok.L);
    }
}