



public class Trigger {
    private String whatHappened;
    
    @Override //none copyable
    private Trigger copy(){ return; }
    
    private Trigger(String whatHapenned){}
    
    private Trigger(String whatHapenned, String withWhat, int count){}

    
    static public void create(String whatHappened){}
    
    static public void create(String whatHappened, String withWhat, int count){}

    static public Trigger get(String whatHappened){}
    
    //all possible events && all dynamics events (dynamics == with different way to do a same)
    static private Trigger onBuyingResources = new Trigger("onBuyingResources");
    static private Trigger onBuyingResource = new Trigger("onBuyingResource", "Stone", 1);
    static private Trigger onDeleteCard = new Trigger("onDeleteCard");
    static private Trigger onBuildCard = new Trigger("onBuildCard");
    static private Trigger onBuyingCard = new Trigger("onBuyingCard");

}

