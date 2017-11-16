
public class BrownCard extends ACard{
    private int wood = 0;
    private int stone = 0;
    private int clay = 0;
    
    public BrownCard(String name, int wood, int stone, int clay){
        super(name);
        
        this.wood = wood;
        this.stone = stone;
        this.clay = clay;
    }
}
