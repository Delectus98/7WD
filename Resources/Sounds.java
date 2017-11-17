

public class Sounds {
    private HashMap<String, SoundBuffer> buffers;
    
    public static boolean preload(){
        return true;
    }
    
    public SoundBuffer get(String name){
        return buffers.get(name);
    }
}


