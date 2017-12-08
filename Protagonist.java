
public abstract class Protagonist {
    protected ArrayList<BrownCard> ;
    protected ArrayList<BrownCard> ;
    protected ArrayList<BrownCard> ;
    protected ArrayList<BrownCard> ;
    protected ArrayList<BrownCard> ;
    protected ArrayList<BrownCard> ;
    protected int moneyCount;

    protected Vector2f cursorPosition;
    
    public abstract void wait(); //on attend qu'il finisse son tour (ça peut être une IA, un joueur local ou un joueur internet)
    
    public final updateGraphics(){
    }
    
}
