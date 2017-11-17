
public class AgePattern extends gObject{

    private static class CardLocation {
        private final ACard card;
        private CardLocation left;
        private CardLocation right;
        
        public CardLocation(){}
        
        public void setCard(ACard card){
            this.card = card;
        }
        
        public void createLeft(){
            if (left == null)
              left = new CardLocation();
        }
        
        public void createRight(){
            if (right == null)
              right = new CardLocation();
        }
        
    }
    
    //user patterns
    public AgePattern(){}
    
    public boolean loadFromFile(String path){}
    //natives patterns
    static public AgePattern FirstAgePattern:
    static public AgePattern SecondAgePattern:
    static public AgePattern ThirdAgePattern:

    static public void preload(){
        //FirstAgePattern = ...
        //SecondAgePattern = ...
        //ThirdAgePattern = ...
    }
    
    
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
    
    public String getName(){
        return name;
    }
    
    public void draw(RenderTarget target){}
    
    
    // User/Player Pattern
    
        
}
