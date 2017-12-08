/**
    On pourrait utiliser plusieurs fois le même bouton et il serais positionné selon le canvas qui veut le dessiner.
*/
    private final SceneControler controler;
    @FunctionalInterface CanvasAction/GenericAction;

public Scene extends Screen {
     
    public void update(){}
}

CanvasAction event = (Canvas canvas) -> {
    if (KeyInput.isPressed()){
        canvas.setColor();
    } else {
        canvas.setColor();
    }
};


String[] vertex = 
{
    "uniform vec2 usingCanvasPosition;",
    "",
    "void main()",
    "{",
    "   gl_Position = gl_ModelViewProjectionMatrix * usingCanvasPosition.xy;",
    "   gl_TexCoord[0] = gl_TextureMatrix[0] * gl_MultiTexCoord0;"
    "   gl_FrontColor = gl_Color;"
    "}"
};

this.shader.setParameter("usingCanvasPosition", canvases.get(i).localPos);
target.draw(canvases.get(i).content, this.shader);


public class Screen implements Drawable
    private ArrayList<Canvas>

    public void print(org.jsfml.graphics.Drawable drawable){
        screenTexture.draw(drawable);
    }
    
    private Vector2<Float> projectTop(Vector<Float> pos, int index){
        for (int i=index ; i >= 0 ; --i){
        }
    }
    
    public void build(){
        pos1;
        pos2;
        pos3;
        pos4;
    }
}
