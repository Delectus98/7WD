

public class IsometricModel implements gGraphics{
    private int cw;
    private int ch;
    private Sprite sprite = new Sprite();
    
    
    public IsometricModel(ConstTexture texture, int sizeU, int sizeW){
        sprite.setTexture(texture);
        //sprite.setOrigin(downleftcorner);
    }
    
    public boolean intersect(IsometricModel model){
        //model
        return false;
    }
    
    public void draw(RenderTarget target){
      target.draw(sprite);
    }
    
}
