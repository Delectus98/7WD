

public class GameScript {
    private ArrayList<String> lines;
    private Trigger trigger = null;
    //private ArrayList<> compiled
    
    // Memory cache
    private <String> acardvar;
    private <String> wonderscards;
    private <String> progressTokens;
    private <String[]> strsvars;
    private <int> ivar;
    
    
    
    public GameScript(String[] data, Trigger trigger){
        
        this.trigger = trigger;
    }
    
    public boolean loadFromMemory(String[] lines){
    
    }
    
    public void onTrigger(Trigger trigger){
        //trigger est une fonction, une action qui teste pour chaque script disponible si qqc doit agir
        if (this.trigger.sameAs(trigger))){
            this.execute();
        }
    } 
    
    public void execute(){
        
    }
    
    public loadFromMemory(String[] args){
        
    }
}
