

public class While extends Loop {
    protected Condition condition;

    public void setCondition(Condition condition){
        this.condition = condition;
    }

    @Override
    public String execute(){
        while (condition.test()){
            for (CodeFragment fragment : inside){
                fragment.execute();
            }
        }
    }
    
    @Override
    public void modify(){}
    
}
