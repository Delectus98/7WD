
public class BrownCard extends ACard{
    //values
    private int wood = 0;
    private int stone = 0;
    private int clay = 0;
    
    //graphics
    private ArrayList<MaterialModel> models;
    private Sprite brownBanner = new Sprite();
    
    public BrownCard(String name, int wood, int stone, int clay){
        super(name);
        
        this.wood = wood;
        this.stone = stone;
        this.clay = clay;
        
        if (wood != 0){
             models.add(new WoodModel(wood));
             models.get(models.size()-1).setPosition(0, 0);
        }
        
        if (stone != 0){
             models.add(new StoneModel(stone));
             models.get(models.size()-1).setPosition((wood != 0) ? 50 : 0, 0); 
        }
        
        if (clay != 0){
             models.add(new WoodModel(clay));
             models.get(models.size()-1).setPosition((wood != 0) ? ((stone != 0) ? 100 : 50) : 0, 0); 
        }
        
        this.banner.setTexture(Textures.get("Resources/Cards/brown_banner.jpg"), true);
    }
    
    
    
    @Override
    public void draw(RenderTarget target){
        target.draw(brownBanner);
        
        for (MaterialModel model : models){
            models.draw(target);
        }
    }
    
}
