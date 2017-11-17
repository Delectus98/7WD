

public class Sounds {
    private HashMap<String, SoundBuffer> buffers;
    
    public boolean preload(){}
    
    public SoundBuffer get(String name){
        return buffers.get(name);
    }
}


