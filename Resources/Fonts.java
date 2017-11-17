

public class Fonts {
    private static HashMap<String, Font> fontList;
    
    public static boolean preload(){
        return true;
    }
    
    public static Font get(String name){
        return fontList.get(name);
    }
}
