

public abstract class Loop extends CodeFragment {
    protected ArrayList<CodeFragment> inside;
    
    public Loop(){}
   
    public void addCodeFragment(CodeFragment frag){
        frag.add(frag);
    }
    
    public void addCodeFragment(CodeFragment frag, int pos){
        frag.add(frag, pos);
    }
    
    
    @Override
    public abstract void modify(){}

    
}
