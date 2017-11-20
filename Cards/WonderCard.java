

public class WonderCard extends ACard{
    private GameScript internalScript;
    private Trigger trigger;
    
    public void listen(Trigger trigger){
        if (this.trigger == trigger){ 
            //ou autre comparaison
            internalScript.execute();
        }
    }
}
