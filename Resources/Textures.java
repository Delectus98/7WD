public class Textures{
    //miscellaneous
    static private HashMap<String, Texture> utils;
    static private HashMap<String, Texture> gui;
    
    //cards
    static private HashMap<String, Texture> nativeCardsImages;
    static private HashMap<String, Texture> userCardsImages;

    static private Texture laureateTexture = new Texture();
    static private Texture simpleCardTexture = new Texture();    
    static private Texture brownTopTexture = new Texture();
    static private Texture greyTexture = new Texture();
    static private Texture yellowTopTexture = new Texture();
    static private Texture blueTopTexture = new Texture();
    static private Texture greenTopTexture = new Texture();
    static private Texture redTopTexture = new Texture();

    //models
    static private Texture goldTexture = new Texture();
    static private Texture stoneTexture = new Texture();
    static private Texture woodTexture = new Texture();
    static private Texture clayTexture = new Texture();
    static private Texture paperTexture = new Texture();
    static private Texture glassTexture = new Texture();
    
    //structures

    
    static public void load(){
      
    }
    
    static public Texture getUtils(String name){
        return utils.get(name);   
    }
    
    static public Texture getGUI(String name){
        return gui.get(name);   
    }
    
    //@TODO native
    static public Texture getNativeCardsImage(String name){
        return nativeCardsImages.get(name);   
    }
    
    //@TODO user
    static public Texture getUserCardsImage(String name){
        return userCardsImages.get(name);   
    }
}
