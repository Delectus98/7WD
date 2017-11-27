

public class ReferenceEquals extends Condition {
    private Object typeA;   
    private Object typeB;
    
    public ReferenceEquals(){}
    
    @Override
    public boolean test(){
        super.result = typeA == typeB;
    }
    
}

