

public static class Game {
    static private Gamerules rules;
    static private RenderWindow window = new RenderWindow("7WD", Videomode.getDesktopMode());
    
    static private Player playerA;
    static private Player playerB;
    
    static private boolean setNativeRules(){
        rules = Gamerules.nativeRules;
        return true;
    }
    
    static private boolean setUserRules(String fullpath){
        rules = new Gamerules();
        
        return rules.loadFromFile(fullpath);
    }
    
    static private void reset(){}
    
    static private void close(){
        //save state 
            //yes >>
            //no
            window.close();
    }
    
    static public void main(String[] args){
        //select menu : native rules or user rules
    }
    
}
