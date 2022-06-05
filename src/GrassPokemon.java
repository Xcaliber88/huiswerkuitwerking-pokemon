public class GrassPokemon extends Pokemon{

    private String attackMode;
    private String defenseMode;
    private int regenerationSpeed;
    private int hurricaneSpeed;

    // constructor

    public GrassPokemon( String name, int hp, String attackMode, String defenseMode, int regenerationSpeed, int hurricaneSpeed){
        super(name,hp);
        this.attackMode=attackMode;
        this.defenseMode=defenseMode;
        this.regenerationSpeed=regenerationSpeed;
        this.hurricaneSpeed=hurricaneSpeed;
    }

    // setter

    public void setAttackMode(String attackMode){
        this.attackMode=attackMode;
    }
    public void setDefenseMode(String defenseMode){
        this.defenseMode=defenseMode;
    }
    public void setRegenerationSpeed(int regenerationSpeed){
        this.regenerationSpeed=regenerationSpeed;
    }
    public  void setHurricaneSpeed(int hurricaneSpeed){
        this.hurricaneSpeed=hurricaneSpeed;
    }

    // getter

    public String getAttackMode(){
        return attackMode;
    }
    public String getDefenseMode(){
        return defenseMode;
    }
    public int getRegenerationSpeed(){
        return regenerationSpeed;
    }
    public int getHurricaneSpeed(){
        return hurricaneSpeed;
    }

    // methodes

    @Override
    public void speaks(String language){
        System.out.println(super.getName() + " doesn't speak but sends "+ language + " signals.");
    }

    public void storm(){
        System.out.println(getName() + " can deploy "+ attackMode + ". And raise a " + defenseMode + ".");
    }
    public void tornadoes(){
        System.out.println("When "+ getName()+ " gets injured, it will regenerate itself in "+ regenerationSpeed + " seconds. It will also deploy hurricanes with speeds up to " + hurricaneSpeed + " meters per hour.");
    }
}
