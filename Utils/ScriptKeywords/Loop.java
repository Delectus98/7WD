

public abstract class Loop extends CodeFragment {
    protected ArrayList<CodeFragment> inside;
    protected Condition condition;
    
    public Loop(){}
    
    public Loop(Condition condition){
        this.condition = condition;
    }
    
    public void setCondition(Condition condition){
        this.condition = condition;
    }
    
    public void addCodeFragment(CodeFragment frag){
        frag.add(frag);
    }
    
    public void addCodeFragment(CodeFragment frag, int pos){
        frag.add(frag, pos);
    }
    
    
    @Override
    public abstract void modify(){}

    
}
