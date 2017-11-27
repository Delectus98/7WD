

public abstract class CodeFragment {
    protected CodeFragment next;
    
    public CodeFragment(){
        this.next = null;
    }
    
    public CodeFragment(CodeFragment next){
        this.next = next;
    }
    
    public final void setCodeFragment(CodeFragment next){
        this.next = next;
    }
   
}
