public class FirePokemon extends Pokemon{

    private String fireMode;
    private int fireRange;
    private int fireStrength;
    private int fireDuration;

    // constructor

    public FirePokemon (String name, int hp, String fireMode, int fireRange, int fireStrength, int fireDuration){
        super(name, hp);
        this.fireMode=fireMode;
        this.fireRange=fireRange;
        this.fireStrength=fireStrength;
        this.fireDuration=fireDuration;
    }

    // setter

    public void setFireMode(String  fireMode){
        this.fireMode=fireMode;
    }
    public void setFireRange(int fireRange){
        this.fireRange=fireRange;
    }
    public void setFireStrength(int fireStrength){
        this.fireStrength=fireStrength;
    }
    public void setFireDuration(int fireDuration){
        this.fireDuration=fireDuration;
    }

    // getter

    public String getFireMode(){
        return fireMode;
    }
    public int getFireRange(){
        return fireRange;
    }
    public int getFireStrength(){
        return fireStrength;
    }
    public int getFireDuration(){
        return fireDuration;
    }

    // methodes

    @Override
    public void speaks(String language){
        System.out.println(super.getName() + " can do telepathy and does not speaks " + language);
    }

    public void inferno(){
        System.out.println(getName() + " has the ability to throw flames as far as " + fireRange + " meters for " + fireDuration + " minutes.");
    }
    public void pyroBall(){
        System.out.println(getName() + " has the ability to launch pyro balls thru its " + fireMode + " and it reaches a temperature of " + fireStrength + " Celsius.");

    }
}
