

public class Musics {
	  
    private static HashMap<String, Music> musicList; //music 
    private static Music current;

    public static boolean preload(){
                  
         try {
            Path path = Paths.get("Assets/Musics.txt"); 
            File file = Files.open(path);
            return true;
            //for each lines >> Music temp = new Music(); 
            //if (temp.openFromFile(file.getLine(index))) 
                //musicList.add(file.getLine(index), temp);

         } catch (IOException exception) {
            
         }
         
    }

    public static void play(String name){
        if (current != null)
          current.stop();
        
        current = musicList.get(name);
        
        if (current != null)
          current.play();
    }
    
    public static void playRandom(){
        int rand = Math.Random() % musicList.size();
       
        this.play(musicList.get(rand));
    }
    
    public static void stop(){
          if (current != null)
              current.stop();
    }
    
    public void setVolume(float volume){
        if (current != null)
          current.setVolume(volume);
    }
    
    public void setSpeed(float speed){
        if (current != null)
          current.setPitch(speed);
    }
    
    public void fadeIn(){
        //quand la musique commence (pas obligÃ©)
    }
    
    public void fadeOut(){
        //quand la musique se termine le son devient plus faible
    }
    
    public int getPlaylistSize(){
        return musicList.size();
    }
    
    public Music get(int index){
        return musicList.get(index);
    }

}
