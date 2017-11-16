

public class Deck {
    private String name;
    private ArrayList<ACard> cards;
    
    public Deck(String name){
        this.name = name;
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
    
    
}
