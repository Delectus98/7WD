
public final class Gamerules {
    public static Gamerules nativeRules;
    
    public static boolean preload(){
        nativeRules = new Gamerules();
    }
    
    
    private String name;
    private ArrayList<AgePattern> ages; //using Decks 
    
    private HashMap<String, WonderCard> wonders;
    private HashMap<String, PCoin> coins;
    
    public boolean loadFromFile(String fullpath){
        //fenêtre graphique de selection d'un fichier
        return false;
    }
    
    public String getName(){
        return name;
    }
    
}
