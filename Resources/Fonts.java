

public class Fonts {
    private HashMap<String, Font> fontList;
    
    public static void preload(){}
    
    public static Font get(String name){
        return fontList.get(name);
    }
}
