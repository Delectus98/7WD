import 


public final class Main {
  public static void main(String[] args){
      RenderWindow window = new RenderWindow(VideoMode.getDesktopMode(), "7WD");
      
      while (window.isOpen()){
        for (Event event : window.pollEvents){
            if (event.type == Event.Type.CLOSED){
                window.close();
            }
        }
        
        window.clear();
        
        //window.draw();
        
        window.render();
      }
  }
}
