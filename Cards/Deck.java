

public class Deck {
    private String name;
    private ArrayList<ACard> cards;
        
  
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
    public static final Deck FirstAgeDeck = createFirstNativeDeck();
    public static final Deck SecondAgeDeck = createSecondNativeDeck();
    public static final Deck ThirdAgeDeck = createThirdNativeDeck();
    
    
    static private Deck createFirstNativeDeck(){}
    static private Deck createSecondNativeDeck(){}
    static private Deck createThirdNativeDeck(){}
    
    
    //User/Player Deck
    public Deck(){}
    
    public boolean loadFromFile(String path){
        //load user deck
        //  > load existing cards (can't be removed) : "native:name"
        //  > load user cards "user:{all datas...}"
        
        //"native:name" c'est juste pour indiquer que la carte utiliser n'est pas de l'utilisateur et existe déja
        //"user:{all datas...}" la carte n'existe pas et du coup on a les informations pour la créer
        //ATTENTION : chaque carte on un nom unique
        
        this.name = FileName(path);
    }
    
}
