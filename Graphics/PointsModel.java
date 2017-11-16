

public class PointsModel extends ContentModel{
        
    public PointsModel(int count){
        super(count);
        
        this.laureate.setTexture(Textures.get("Resources/Textures/laureate.png"), true);
        
        this.laureate.setOrigin(75, 75);
    }
    
}
