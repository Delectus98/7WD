import java.util.*;


public abstract class ACard extends gObject
{
    private String namespace;
    private String name;
    protected Text title;
    
    public ACard(String name){
        this.name = name;
        
        this.title.setString(name);
        
        this.title.setFont(Fonts.get("Resources/Fonts/regular.ttf"));
        
        this.title.setOrigin(this.title.getGlobalBounds().width/2, this.title.getGlobalBounds().height/2);
    }
    
    public final String getName(){
        return name;
    }
    
    public final String getNamespace(){
        return namespace;
    }
    
}


