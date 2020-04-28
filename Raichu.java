public class Raichu extends Pikachu{ //mutate of pikachu 

    public Raichu(String name){
        super(name,500);  //can change 
    }
    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(100);  // can change
    }
}