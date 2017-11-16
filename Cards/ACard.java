import java.util.*;


public abstract class ACard extends gObject
{
    private String name;
    protected Text title;
    
    public ACard(String name){
        this.name = name;
        
        this.title.setString(name);
        
        this.title.setFont();
        
        this.title.setOrigin(this.title.getGlobalBounds().width/2, this.title.getGlobalBounds().height/2);
    }
    
    public String getName(){
        return name;
    }
    
}
