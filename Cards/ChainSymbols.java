

public class ChainSymbols {
    public static class Symbol{
        private String name;
        private Texture texture = null;
        
        private Symbol(String name, Texture texture){
            this.name = new String(name);
            this.texture = texture;
        }
    }
    
    private static HashMap<String, Symbol> symbols;
    
    public static boolean addSymbol(String name, String textureName){
        if (symbols.find(name)){
            return false;
        } else {
            symbols.add(name, new Symbol(name, Texture.get(TextureName)));
            return true;   
        }
    }
    //priceSymbol
    //chainSymbol
}
