

public abstract class MaterialsModel implements gObject{
    private Sprite sprite = new Sprite();
    private Text amouth = new Title();
    private int count;
    
    public MaterialsModel(int count){
        this.count = count;
        
        if (this.count < 0)
          this.count = - this.count;
          
        
    }
    
}
