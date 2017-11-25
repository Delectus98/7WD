

public final class Deck extends Loadable implements Loadable{
    //User decks
    static private HashMap<String, ACard> userDecks;
        //si un deck existe déja alors on en rajoute pas une et on renvoie false
        //les deck utilisateurs sont limités (pas plus de XXX >> à définir) et ils sont générés que si ils sont demandés
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

            return true;
        } else {
            return false;   
        }
        
    }
    
    static public boolean addDeck(Deck deck){}
    
    //Native Decks
    public static Deck FirstAgeDeck;
    public static Deck SecondAgeDeck;
    public static Deck ThirdAgeDeck;
   
    static private Deck createFirstNativeDeck(){}
    static private Deck createSecondNativeDeck(){}
    static private Deck createThirdNativeDeck(){}
    
    public static boolean preload(){
        FirstAgeDeck = createFirstNativeDeck();
        SecondAgeDeck = createSecondNativeDeck();
        ThirdAgeDeck = createThirdNativeDeck();
        return true;
    }
    
    
    
    private String namespace;
    private String name;
    private ArrayList<ACard> cards;

    public final String getName(){
        return name;
    }
    
    public final String getNamespace(){
        return namespace;
    }
  
    public void shuffle(){ 
        //Mélange de Fisher-Yates
        for (int i=0 ; i < cards.size() ; ++i){
            Random random = new Random(); 
            int rand = random.nextInt(cards.size());

            ACard ref = cards[i];

            cards[i] = cards[rand];
            
            cards[rand] = first;
        }       
    }
    
    public int size(){
        return cards.size();
    }
    
    public ACard get(int i){}
    
    //User/Player Deck
    
    
}
