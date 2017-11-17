

public class Sounds {
    private HashMap<String, SoundBuffer> buffers;
    
    public boolean preload(){
        return true;
    }
    
    public SoundBuffer get(String name){
        return buffers.get(name);
    }
}


