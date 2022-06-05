public class Pokemon {

    private String name;
    private int hp;

    //setter

    public void setName(String name){
        this.name=name;
        }
    public void setHp(Integer hp){
        this.hp=hp;
    }

    //getter

    public String getName(){
        return name;
    }
    public Integer getHp(){
        return hp;
    }

    //constructor

    public Pokemon(){
        System.out.println("I have summoned a Pokemon");
    }

    // constructor with parameters

    public Pokemon(String name, Integer hp){
        this.name = name;
        this.hp  =hp;
        System.out.println("I have summoned a Pokemon and his name is "+ name + ", it has a HP of: "+ hp);
    }

    // Methode

    public void eats(String food){
        System.out.println(name + " eats " + food);
    }
    public void speaks(String language){
        System.out.println(name + " speaks " + language);
    }
    }

