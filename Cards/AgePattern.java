
public class AgePattern extends gObject{
    private String name;
    private final Deck deck;
    private ArrayList<CardLocation> ;
    
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
