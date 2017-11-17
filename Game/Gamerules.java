
public final class Gamerules {
    public static Gamerules nativeRules;
    
    public static boolean load(){
        nativeRules = new Gamerules();
    }
    
    
    private String name;
    private ArrayList<AgePattern> ages; //using Decks 
    
    private HashMap<String, WonderCard> wonders;
    private HashMap<String, PCoin> coins;
    
    public void loadFromFile(String fullpath){
        //
    }
    
    public String getName(){
        return name:
    }
    
}
