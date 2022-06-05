public class WaterPokemon extends Pokemon{

    private String waterMode;
    private int waveHeight;
    private int waveRange;
    private int waveSpeed;

    // constructor

    public WaterPokemon(String name, int hp, String waterMode, int waveHeight, int waveRange, int waveSpeed) {
        super(name, hp);
        this.waterMode = waterMode;
        this.waveHeight = waveHeight;
        this.waveRange = waveRange;
        this.waveSpeed = waveSpeed;
    }

    // setter

    public void setWaterMode(String waterMode){
        this.waterMode=waterMode;
    }
    public void setWaveHeight(int waveHeight){
        this.waveHeight =waveHeight;
    }
    public void setWaveRange(int waveRange){
        this.waveRange=waveRange;
    }
    public void setWaveSpeed(int waveSpeed){
        this.waveSpeed = waveSpeed;
    }

    // getter

    public String getWaterMode(){
        return waterMode;
    }
    public int getWaveHeight(){
        return waveHeight;
    }
    public int getWaveRange(){
        return waveRange;
    }
    public int getWaveSpeed(){
        return waveSpeed;
    }

    // methodes

    @Override
    public void speaks(String language){
        System.out.println(super.getName() + " doesn't speak but send "+ language);
    }

    public void tsunami(){
        System.out.println(getName() + " can launch a " + waterMode + " with a maximum wave height of "+ waveHeight + " meter.");
    }

    public void torrent(){
        System.out.println(getName() + " can also launch torrents with a speed of " + waveSpeed + " meters a second with a diameter of " + waveRange + " meters.");
    }
}
