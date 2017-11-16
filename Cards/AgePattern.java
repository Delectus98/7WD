
public class AgePattern extends gObject{
    private String name;
    private ArrayList<CardLocation> locations;
    
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
    
    public boolean useDeck(Deck deck){
        if (deck.size() >= locations.size()){
            deck.shuffle();
        
            //for each
            
            return true;
        } else {
            return false;   
        }
        
        
    }
    
    
    // User/Player Pattern
    public AgePattern(){}
    
    public boolean loadFromFile(String path){}
    
    public boolean create(String name){
        //'name' has to be unique >> check names in the folder "Decks/..."
    }
    
    public boolean delete(String name){
        //
    }
        
}
