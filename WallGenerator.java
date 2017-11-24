

public class WallGenerator extends Wall{
    //Génère des monstres aux alentours de la tuile ou est positionné le mur
    
    private int radius = 0;
    private Monster monsterType = null;
    
    pubic WallGenerator(World world, int radius, Monster type){
        super (world, Assets.....);
        this.radius = radius;
        this.monsterType = type;
    }
    
    //trouver un moyen d'updater certains types de Structures
    public void update(....){}
    
}
