
public class AgePattern extends gObject{
    private String name;
    private final Deck deck;
    private ArrayList<CardLocation> firstLine;
    
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
    
    public AgePattern(){}
    
    public void loadFromFile(String path){}
    
    public void loadFromMemory(String data){
        
    }
    
    public AgePattern(){}

}
