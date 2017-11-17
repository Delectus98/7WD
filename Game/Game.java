

public class Game { 
    //classe static uniquement pour jouer et comment on va joueur != Gameruler classe static pour changer et ajouter du contenu
    static private Gamerules rules;
    static private RenderWindow window = new RenderWindow("7WD", Videomode.getDesktopMode());
    
    static private Player playerA;
    static private Player playerB;
    
    //preload
    static private boolean preload(){
         if (!Textures.load()) return false;
         if (!Sounds.load()) return false;
         if (!Fonts.load()) return false;
         if (!Musics.load()) return false;
        
         if (!Cards.load()) return false; //native cards and native wonders >> génère dynamiquement les textures utilisateurs
         if (!Deck.load()) return false;//native deck >> génère dynamiquement les cartes utilisateurs
         if (!AgePattern.load()) return false; //native agepattern >> génère dynamiquement les patternes utilisateurs
        
         if (!Gamerules.load()) return false; //native rules
        
         return true;
    }
    
    //Gamerules
    static private boolean setNativeRules(){
        rules = Gamerules.nativeRules;
        return true;
    }
    static private boolean setUserRules(String fullpath){
        rules = new Gamerules();
        
        return rules.loadFromFile(fullpath);
    }
    
    //
    
    
    //In game
    static private void reset(){}
    
    static private void close(){
        //save state 
            //yes >>
            //no
            window.close();
    }
    
    static private void events(){
        for (Event event : window.pollEvents){
            if (event.type == Event.Type.Closed)
                window.close();
        }
    }
    
    static public void main(String[] args){
        if (Game.load()){
            while (window.isOpen())
            {
                Game.events();
                
                switch (){
                    case MAIN_MENU:/*select menu*/break;
                    case STEP_GAMERULES:/*select game rules > native : user*/break;
                    case STEP_AGEPATTERNS:/*select agepatterns > native : user*/break;
                    case STEP_DECKS:/*select decks > native : user*/break;
                }
            }
            
            
            
        }
        else{
            JOptionPane pane = new JOptionPane("Les ressources de base du jeu sont manquantes", "ok");
            pane.open();
        }
    }
    
}
