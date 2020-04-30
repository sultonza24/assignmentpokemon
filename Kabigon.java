public class Kabigon extends Pokemon{
    public Kabigon(String name){
        super(name,1000);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(5);
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
        System.out.println("HP special : +10 " + hp.getHp());
    }

    public void damagespecial(Pokemon Damage){
        Damage.damage(10+10);
    }
}