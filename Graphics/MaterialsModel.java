

public abstract class MaterialModel extends ContentModel{
       
    protected MaterialModel(int count){
        super(count);  
    }
    
   //set scale for each if the bounds are too big 
    public static StoneModel(int count) extends MaterialContent{
        super (count);
        
        super.content.setTexture(Textures.get("Resources/Textures/stone.png"), true);
        
        super.content.setOrigin(this.content.getGlobalBoudns().width/2, this.content.getGlobalBoudns().height/2);
    }
    
    public static ClayModel(int count){
        super (count);
        
        super.content.setTexture(Textures.get("Resources/Textures/clay.png"), true);
        
        super.content.setOrigin(this.content.getGlobalBoudns().width/2, this.content.getGlobalBoudns().height/2);
    }
    
    public static WoodModel(int count){
        super (count);
        
        super.content.setTexture(Textures.get("Resources/Textures/wood.png"), true);
        
        super.content.setOrigin(this.content.getGlobalBoudns().width/2, this.content.getGlobalBoudns().height/2);
    }
    
    public static GlassModel(int count){
        super (count);
        
        super.content.setTexture(Textures.get("Resources/Textures/glass.png"), true);
        
        super.content.setOrigin(this.content.getGlobalBoudns().width/2, this.content.getGlobalBoudns().height/2);
    }
    
    public static PaperModel(int count){
        super (count);
        
        super.content.setTexture(Textures.get("Resources/Textures/paper.png"), true);
        
        super.content.setOrigin(this.content.getGlobalBoudns().width/2, this.content.getGlobalBoudns().height/2);
    }
    
    public static GoldModel(int count){
        super (count);
        
        super.content.setTexture(Textures.get("Resources/Textures/gold.png"), true);
        
        super.content.setOrigin(this.content.getGlobalBoudns().width/2, this.content.getGlobalBoudns().height/2);
    }
    

}
