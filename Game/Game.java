
public class Game { 
    //classe static uniquement pour jouer et comment on va joueur != Gameruler classe static pour changer et ajouter du contenu
    static private Gamerules rules;
    static private RenderWindow window = new RenderWindow( VideoMode.getDesktopMode(), "7 Wonders Duel");
    
    
    static private Player playerA;
    static private Player playerB;
    
    //preload
    static private boolean load(){
         if (!Textures.preload()) return false;
         if (!Sounds.preload()) return false;
         if (!Fonts.preload()) return false;
         if (!Musics.preload()) return false;
        
         if (!Cards.preload()) return false; //native cards and native wonders
         if (!Deck.preload()) return false;//user cards and user wonders >> gÃ©nÃ¨re dynamiquement les cartes utilisateurs
         if (!AgePattern.preload()) return false; //gÃ©nÃ¨re dynamiquement les patternes utilisateurs
        
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
            }
            
            switch (){
                case MAIN_MENU:/*select menu*/break;
                case STEP_GAMERULES:/*select game rules > native : user*/break;
                case STEP_AGEPATTERNS:/*select agepatterns > native : user*/break;
                case STEP_DECKS:/*select decks > native : user*/break;
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Native Assets exception throw : Can't load all resources. \n" +
                                          "Please make sure that you do not remove any of native resources.");
        }
    }
    
}
