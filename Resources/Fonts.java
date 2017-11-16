

public class Fonts {
    private HashMap<String, Font> fontList;
    
    public static void load(){}
    
    public static Font get(String name){
        return fontList.get(name);
    }
}
