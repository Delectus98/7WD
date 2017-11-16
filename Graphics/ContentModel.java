public abstract class ContentModel implements gObject{
    
    protected Sprite content = new Sprite();
    private Text amouth = new Text();
    private int count;
    
    public ContentModel(int count){
        this.count = count;
        
        if (this.count < 0)
          this.count = - this.count;
        
        this.amouth.setString(String.valueOf(this.count));
        
        this.amouth.setFont(Fonts.get("Model.ttf"));
        
        this.amouth.setOrigin(this.amouth.getGlobalBounds().width/2, this.amouth.getGlobalBounds().height/2);
    }
    
    public void setPosition(Vector2f position){
        this.laureate.setPosition(position);
        this.amouth.setPosition(position);
    }
    
    public void draw(RenderTarget target){
        target.draw(laureate);
        target.draw(amouth);
    }
    
}
