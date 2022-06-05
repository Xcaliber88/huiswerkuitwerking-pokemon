public class ElectricPokemon extends Pokemon{

    private String electricMode;
    private int voltage;
    private String lightingMode;
    private int lightningSpeed;

    // constructor

    public ElectricPokemon(String name, int hp, String electricMode, int voltage, String lightingMode, int lightningSpeed){
        super(name, hp);
        this.electricMode= electricMode;
        this.voltage=voltage;
        this.lightingMode=lightingMode;
        this.lightningSpeed=lightningSpeed;
    }

    //setter

    public void setElectricMode(String electricMode){
        this.electricMode=electricMode;
    }
    public void setVoltage(int voltage){
        this.voltage=voltage;
    }
    public void setLightingMode(String lightingMode){
        this.lightingMode=lightingMode;
    }
    public void setLightningSpeed(int lightningSpeed){
        this.lightningSpeed=lightningSpeed;
    }

    //getter

    public String getElectricMode(){
        return electricMode;
    }
    public int getVoltage(){
        return voltage;
    }
    public String getLightingMode(){
        return lightingMode;
    }
    public int getLightningSpeed(){
        return lightningSpeed;
    }

    @Override
    public void speaks(String language){
        System.out.println(super.getName() + " doesn't speak but sends "+ language + ".");
    }

    public void electrification(){
        System.out.println( getName() + " can deploy " + electricMode+ " with deadly voltage of "+ voltage + " volts.");
    }

    public void lighteningStrike(){
        System.out.println(getName() + " can launch "+ lightingMode + " with speeds up to "+ lightningSpeed + " meters per second.");
    }
}
