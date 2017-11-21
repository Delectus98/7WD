

public class Symbol{
    private String namespace;
    private String name;
    private Texture texture = null;

    private Symbol(String name, Texture texture){
        this.name = new String(name);
        this.texture = texture;
    }

    public final String getName(){
        return name;
    }

    public final String getNamespace(){
        return namespace;
    }

    
    
    private static HashMap<String, Symbol> symbols;

    public static boolean addSymbol(String name, String textureName){
        if (symbols.find(name)){
            return false;
        } else {
            symbols.add(name, new Symbol(name, Texture.getUserTexture(TextureName)));
            return true;   
    }
}

