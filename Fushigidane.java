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
    /*
    public void level(Pokemon levelstart){
        System.out.println(name + "Level :" + levelstart);
        if(feedstatus <= 10){
        }
        else if(feedstatus > 10){
            this.levelstart++;
        }
   }*/

   public void Hpspecial(Pokemon hp){
    System.out.println("HP special : +10 " + hp.getHp2());
   }

   public void damagespecial(Pokemon Damage){
    Damage.damage(10+10);
   }
}