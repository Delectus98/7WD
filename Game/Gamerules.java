
public final class Gamerules {
    public static Gamerules nativeRules;
    
    public static boolean preload(){
        nativeRules = new Gamerules();
    }
    
    private String namespace;
    private String name;
    private ArrayList<Pair<String, String>> ages; //using Decks 
    
    private MultiHashMap<String, WonderCard> wonders;
    private MultiHashMap<String, PCoin> coins;
    
    public boolean loadFromFile(String fullpath){
        //fenêtre graphique de selection d'un fichier
        return false;
    }
    
    public final String getName(){
        return name;
    }
    
    public final String getNamespace(){
        return namespace;
    }
    
}
