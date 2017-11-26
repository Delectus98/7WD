

public class IsometricModel extends Sprite implements gGraphics{
    private int length;
    
    public IsometricModel(ConstTexture texture, int length){
        sprite.setTexture(texture);
        
        this.length = length;
        //sprite.setOrigin(downleftcorner);
    }
    
    public int getSquareLength() {
        return length;
    }
}
