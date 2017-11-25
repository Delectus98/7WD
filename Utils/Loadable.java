

public abstract class Loadable {
    private String namespace;
    private String name;
    
    public boolean loadFromFile(String namespace, String name);
    
    public String getNamespace(){
        return namespace;
    }
    
    public String getName(){
        return name;
    }
    
}
