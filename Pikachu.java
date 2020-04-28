public class Pikachu extends Pokemon{

    public Pikachu(String name){
        super(name,10);
    }
    //overload constructor
    public Pikachu(String name,int Hpstart){
        super(name,Hpstart);
    }
    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(10);
    }
}