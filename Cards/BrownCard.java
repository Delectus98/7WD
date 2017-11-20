
public class BrownCard extends ACard{
    //values
    private int wood = 0;
    private int stone = 0;
    private int clay = 0;
    
    //graphics
    private ArrayList<ResourcesModel> models;
    
    public BrownCard(String name, int wood, int stone, int clay){
        super(name);
        
        this.wood = wood;
        this.stone = stone;
        this.clay = clay;
        
        if (wood != 0){
            WoodModel temp = new WoodModel();

        }
        
        if (stone != 0){
            StoneModel temp = new StoneModel();
        }
        
        if (clay != 0){
            ClayModel temp = new ClayModel();
        }
    }
}
