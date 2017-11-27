
public final class Gamerules extends Loadable{
    public static Gamerules nativeRules;
    
    public static boolean preload(){
        nativeRules = new Gamerules();
    }
    
    ///<String=Namespace, String=Name>
    private Pair<String, String>[] ages; 
    private Pair<String, String>[] decks;
    private MultiHashMap<String, String> wonders;
    private MultiHashMap<String, String> coins;
    
    public boolean loadFromFile(String fullpath){
        //fenêtre graphique de selection d'un fichier
        return false;
    }
   
    
}
