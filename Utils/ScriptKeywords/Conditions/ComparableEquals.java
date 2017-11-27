

public class ComparableEquals extends Condition {
    private Comparable<Object> typeA;   
    private Comparable<Object> typeB;
    
    public ComparableEquals(){}
    
    @Override
    public boolean test(){
        super.result = typeA.equals(typeB);
    }
    
}
