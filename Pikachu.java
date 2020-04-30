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
        /*
        System.out.println(name + "Level : " + levelstart);
        */
    }
    /*
    public void level(){
        System.out.println(levelstart);
        if(feedstatus <= 10){
        }
        else if(feedstatus > 10){
            this.levelstart++;
        }
    }
    */

    public void Hpspecial(Pokemon hp){
        System.out.println("HP special : +10 " + hp.getHp());
    }

    public void damagespecial(Pokemon Damage){
        Damage.damage(10+10);
    }
}