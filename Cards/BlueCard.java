

public class BlueCard extends ACard{
    private int civilPoints = 0;
    private PointsModel model;
    private Sprite banner = new Sprite();
    
    public BlueCard(int civilPoints){
        this.civilPoints = civilPoints;
        
        this.model = new PointsModel(this.civilPoints);
        
        this.banner.setTexture(Textures.get("Resources/Cards/blue_banner.jpg"), true);
       
        
    }
    
    @Override
    public boolean loadFromFile(String namespace, String name){}
    
    @Override
    public void draw(RenderTarget target){
        target.draw(banner);
        
        model.draw(target);   
    }
    
}
