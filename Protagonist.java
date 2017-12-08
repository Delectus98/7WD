public class CardCollection <T extends ACard> {
    private ArrayList<ACard> cards;
}


public abstract class Protagonist {
    protected CardCollection collection;
    protected ArrayList<BrownCard> ;
    protected ArrayList<GreyCard> ;
    protected ArrayList<YellowCard> ;
    protected ArrayList<BrownCard> ;
    protected ArrayList<BrownCard> ;
    protected ArrayList<BrownCard> ;
    protected int moneyCount;

    protected Vector2f cursorPosition;
    
    public abstract void wait(); //on attend qu'il finisse son tour (ça peut être une IA, un joueur local ou un joueur internet)
    
    public final updateGraphics(){
    }
    
}

public class LocalPlayer extends Protagonist {
}

public class NetworkPlayer extends Protagonist {
    //si les deux protagonistes sont mis en tant que NetworkPlayer alors on verra une partie qui se déroule ailleurs
}

public class IAPlayer extends Protagonist {
    //si les deux prootagonistes sont des IA alors le jeu se déroule tout seul
}
