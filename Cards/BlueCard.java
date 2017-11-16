

public class BlueCard extends ACard{
    private int civilPoints = 0;
    private PointsModel model;
    
    public BlueCard(int civilPoints){
        this.civilPoints = civilPoints;
        
        this.model = new PointsModel(this.civilPoints);
    }
    
    
    public void draw(RenderTarget target){
        model.draw(target);
    }
    
}
