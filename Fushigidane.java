public class Fushigidane extends Pokemon{

    public Fushigidane(String name){
        super(name,10);
    }

    public Fushigidane(String name,int Hpstart){
        super(name,Hpstart);
    }
    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName2());
        enemy.damage(10);
    }
}