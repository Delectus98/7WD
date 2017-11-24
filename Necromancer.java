

public class Necromancer extends Monster{
    private Necromander father = null;
    
    private int summonLimit;
    private int currentSons = 0;
    private Necromancer[] summoned;
    
    private Time waitForNextSummoning;
    private Time elapsed = Time.ZERO;
  
    public Necromancer(World world, int summonLimit, Time waitForNextSummoning){
        super (world, Assets.....);
        this.summonLimit = summonLimit;
        this.summoned = new Necromancer[this.summonLimit];
        this.waitForNextSummoning = waitForNextSummoning;
    }
    
    private Necromancer(World world, int summonLimit, Time waitForNextSummoning, Necromancer summoner){
        super (world, Assets....);
        super.setTexture(....., ....., .... , etc...);
        
        this.father = summoner;
        
        this.summonLimit = summonLimit;
        this.summoned = new Necromancer[this.summonLimit];
        this.waitForNextSummoning = waitForNextSummoning;
    }
    
    private void remove(Necromancer son){
        for (int i=0 ; i < currentSons ; ++i){
            if (summoned[i] == son){
                //On décale les élements du tableau
                for (int j=i+1 ; j < currentSons ; ++j){
                    summoned[j-1] = summoned[j]; 
                }
                currentSons--;
                
                break;
            }
        }
    }
    
    private void summon(){
        summoned = new Necromancer(world, summonLimit-1, waitForNextSummoning, this);
        currentSons++;
    }
    
    public void update(Time elapsedTime){
        elapsed = Time.add(elapsed, elapsedTime);
        if (elapsed.compareTo(waitForNextSummoning) >= 0 && currentSons <= summonLimit){
            
        }
        
    }
    
    @Override
    public void die(){
        super.die();
        
        if (father != null)
          father.remove(this);
        
        for (int i=0 ; i < currentSons ; ++i){
            summoned[i].die();
        }
    }
    
    @Override
    public void draw(RenderTarget target){
        for (int i=0 ; i < currentSons ; ++i){
            summoned[i].draw(target);
        }
    }

}
