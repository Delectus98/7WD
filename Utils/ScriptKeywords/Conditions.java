

public abstract class Condition extends CodeFragment{
    protected boolean result;

    public abstract boolean test();
    
    public final boolean equals(Condition condition){
        return result == condition.getResult();
    }
    
    public final boolean getResult(){
        return result;
    }
    
}
