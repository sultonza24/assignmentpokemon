import java.util.*;

class Trainer{
    public ArrayList<Pokemon> bag;
    private Scanner sc;
    private String name;
    public Trainer(String name){
        bag = new ArrayList<Pokemon>();
        bag.add(new Pikachu("Pikachu"));
        bag.add(new Fushigidane("Fushigidane"));
        sc = new Scanner(System.in);

        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    

    public void play(){
        String cmd = "";
        do{
            System.out.print("Enter cmd: ");
            cmd = sc.nextLine();
            if(cmd.equals("print")){
                System.out.println("\n\nPokemon in bag: ");
                printPokemon(bag);
            }
            else if(cmd.equals("catch")){
                catchPokemon();
            }
        }while(!cmd.equals("q"));
    }

    public void catchPokemon(){
        System.out.println("Catch Pokemon");
        ArrayList<Pokemon> pokemons = PokemonRandomizer.getPokemons(5);

        System.out.println("\n\nPokemon around you");
        int no = 0;
        printPokemon(pokemons);

        /*for(Pokemon p: pokemons){
            System.out.println("No. " + no  + " " + p.getName());
            no++;
        }*/

        System.out.println("\n\nSelect pokemon number or run(-1): ");
        no = sc.nextInt();
        if(no < 0){
            sc.nextLine();
            return;
        }
        Pokemon wildPokemon = pokemons.get(no);

        System.out.println("\n\nPokemon in bag:");
        printPokemon(bag);
        System.out.println("Select pokemon in bag ");
        
        no = sc.nextInt();
        Pokemon myPokemon = bag.get(no);

        boolean isWin = false;
        do{
            myPokemon.attack(wildPokemon);
            if(wildPokemon.getHp() == 0){
                isWin = true;
                break;
            }
            else{
                wildPokemon.attack(myPokemon);
                if(myPokemon.getHp() == 0){
                    isWin = false;
                    break;
                }
            }

        }while(true);

        if(isWin){
            System.out.println("You catch: ");
            bag.add(wildPokemon);
        }
        else{
            System.out.println(wildPokemon.getName() + " Win ");
        }
        sc.nextLine();
    }


    public void printPokemon(ArrayList<Pokemon> pokemons){
        System.out.println("Pokemon in bag");
        int number = 0;
        for(Pokemon p: pokemons){
            System.out.println("" + number + " " + p + " HP: " + p.getHp());
            number++;
        }
    }


    public ArrayList<Pokemon> getBag(){
        return bag;
    }

    public void playcount(){
        String cmd = "";
        do{
            System.out.print("Enter cmd: ");
            cmd = sc.nextLine();
            if(cmd.equals("print")){
                System.out.println("\n\nPokemon in bag: ");
                printPokemon(bag);
            }
        }while(!cmd.equals("q"));
    }

}