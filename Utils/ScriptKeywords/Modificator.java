

public abstract class Modificators {
    HashMap<String, Object> memory = new HashMap<String, Object>();
    //params
    Player currentPlayer;
    Player opponentPlayer;
    
    
    
    
    public static String execute(String function, String args[]){
        //Player|Opponent functions
        if (function.equals("Player.earnMoney")){ if (args.length == 1){
                int value;
                try { value = Interger.parseInt(execute(args[0])); } catch () { value = 0; } finnaly { currentPlayer.earnMoney(value); }
            } else {
                return "<initialise type=\"exception\" name=\"exception\" constructor=\"Player.earnMoney\">";
            }
        } 
        else if (function.equals("Opponent.earnMoney")){ if (args.length == 1){
                int value;
                try { value = Interger.parseInt(execute(args[0])); } catch () { value = 0; } finnaly { opponentPlayer.earnMoney(value); }
            } else {
                return "<initialise type=\"exception\" name=\"exception\" constructor=\"Opponent.earnMoney\">";
            }
        }
        else if (function.equals("Player.lossMoney")){ if (args.length == 1){
                int value;
                try { value = Interger.parseInt(execute(args[0])); } catch () { value = 0; } finnaly { currentPlayer.lossMoney(value); }
            } else {
                return "<initialise type=\"exception\" name=\"exception\" constructor=\"Player.lossMoney\">";
            }
        }
        else if (function.equals("Opponent.lossMoney")){ if (args.length == 1){
                int value;
                try { value = Interger.parseInt(execute(args[0])); } catch () { value = 0; } finnaly { opponentPlayer.lossMoney(value); }
            } else {
                return "<initialise type=\"exception\" name=\"exception\" constructor=\"Opponent.lossMoney\">";
            }
        }
        //Gameboard functions
    }
    
    
}
