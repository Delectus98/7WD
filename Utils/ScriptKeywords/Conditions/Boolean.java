

public class Boolean extends Condition {
    
    public Boolean(boolean state){
        super.result = state;
    }
    
    @Override
    public boolean test(){
        return super.result;
    }

}
