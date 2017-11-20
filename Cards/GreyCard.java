

public class GreyCard extends ACard{
    //values   
    private int glass = 0;
    private int paper = 0;
    
    //graphics
    private Sprite banner = new Sprite();
    private ArrayList<MaterialModel> models;
    
    public GreyCard(String name, int glass, int paper){
        this.glass = glass;
        this.paper = paper;
    
        if (this.glass != 0){
            models.add(new GlassModel(this.glass));
            
        }
        
        if (this.paper != 0){
            models.add(new PaperModel(this.paper));

        }
    }
    
    @Override
    public void draw(RenderTarget target){
        target.draw(banner);
        
        for (MaterialModel model : models){
            models.draw(target);
        }
    }
}
