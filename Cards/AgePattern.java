
public class AgePattern extends Loadable implements gObject{

    private static class CardLocation {
        private final ACard card;
        private CardLocation left;
        private CardLocation right;
        
        public CardLocation(ACard card){
        	 this.card = card;
        }
        
        public void createLeft(ACard card){
            if (left == null)
              left = new CardLocation(card);
        }
        
        public void createRight(ACard card){
            if (right == null)
              right = new CardLocation(card);
        }
    }
    //user patterns
    public AgePattern(){}
	
    @Override
    public boolean loadFromFile(String namespace, String name){}

    //native patterns
    static public AgePattern FirstAgePattern;
    static public AgePattern SecondAgePattern;
    static public AgePattern ThirdAgePattern;

    static public boolean preload(){
        //FirstAgePattern = ...
        //SecondAgePattern = ...
        //ThirdAgePattern = ...
	    return true;
    }
    
    
    private String namespace;
    private String name;
    private ArrayList<CardLocation> locations;
    
    public boolean useDeck(Deck deck){
        if (deck.size() >= locations.size()){
            deck.shuffle();
        
            //for each
            
            return true;
        } else {
            return false;   
        }
        
        
    }
    public final String getName(){
        return name;
    }
    
    public final String getNamespace(){
        return namespace;
    }
	
	
    @Override
    public void draw(RenderTarget target) {

 
    }
    // User/Player Pattern
    
        
}
