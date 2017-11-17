
public class AgePattern implements gObject{

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
    
    public boolean loadFromFile(String path){return true;}
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
	@Override
	public void draw(RenderTarget target) {
		
		
	}
    // User/Player Pattern
    
        
}
