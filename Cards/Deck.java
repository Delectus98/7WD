

public final class Deck {
    static private HashMap<String, ACard> nativeCards;
    static private HashMap<String, ACard> userCards;
    
    private String name;
    private ArrayList<ACard> cards;
        
    static void load(){
        FirstAgeDeck = createFirstNativeDeck();
        SecondAgeDeck = createSecondNativeDeck();
        ThirdAgeDeck = createThirdNativeDeck();
    }
  
    public void shuffle(){ 
        //Mélange de Fisher-Yates
        for (int i=0 ; i < cards.size() ; ++i){
            int rand = Math.Random() % cards.size();

            ACard ref = cards[i];

            cards[i] = cards[rand];
            
            cards[rand] = first;
        }       
    }
    
    
    //Native Decks
    public static Deck FirstAgeDeck;
    public static Deck SecondAgeDeck;
    public static Deck ThirdAgeDeck;
    
    
    static private Deck createFirstNativeDeck(){}
    static private Deck createSecondNativeDeck(){}
    static private Deck createThirdNativeDeck(){}
    
    
    //User/Player Deck
    public Deck(){}
    
    public boolean loadFromFile(String fullpath){
        //load user deck
        // deck name est unique
        //  > load existing cards (can't be removed) : "native:name"
        //  > load user cards "user:{all datas...}"
        
        //"native:name" c'est juste pour indiquer que la carte utiliser n'est pas de l'utilisateur et existe déja
        //"user:{all datas...}" la carte n'existe pas et du coup on a les informations pour la créer
        //ATTENTION : chaque carte on un nom unique
        
        if (Files.getFileExtension(fullpath).equals("deck")){
            //on doit trouver la bonne extension du fichier 
            
            this.name = Files.getFileName(fullpath);

            
        } else {
            return false;   
        }
        
    }
    
}
