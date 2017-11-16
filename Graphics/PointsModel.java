

public class PointsModel implements gObject{
    
    private Sprite laureate = new Sprite();
    private Text points = new Text();
    private int count;
    
    public PointsModel(int count){
        this.count = count;
        
        if (this.count < 0)
          this.count = - this.count;
        
        this.points.setString(String.valueOf(this.count));
        
        this.points.setOrigin(this.points.getGlobalBounds().width/2, this.points.getGlobalBounds().height/2);
        
        this.laureate.setTexture(Textures.get("Resources/Textures/laureate.png"), true);
        
        this.laureate.setOrigin(75, 75);
    }
    
    public void setPosition(Vector2f position){
        this.laureate.setPosition(position);
        this.points.setPosition(position);
    }
    
    public void draw(RenderTarget target){
        target.draw(laureate);
        target.draw(points);
    }
    
}
