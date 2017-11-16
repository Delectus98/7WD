

public class PointsModel extends ContentModel{
        
    public PointsModel(int count){
        super(count);
        
        super.content.setTexture(Textures.get("Resources/Textures/laureate.png"), true);
        
        super.content.setOrigin(this.content.getGlobalBoudns().width/2, this.content.getGlobalBoudns().height/2);
    }
}


