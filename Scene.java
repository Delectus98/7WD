/**
    On pourrait utiliser plusieurs fois le même bouton et il serais positionné selon le canvas qui veut le dessiner.
*/
    private final SceneControler controler;
    @FunctionalInterface CanvasAction/GenericAction;

public Scene extends Screen {
     
    public void update(){}
}


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
