public class Main {
    public static void main(String[] args) {

        FirePokemon firePokemon = new FirePokemon("FiercyDragon", 150, "mouth", 50, 1000, 60) ;
        firePokemon.eats("flowers");
        firePokemon.speaks("gibberish");
        firePokemon.inferno();
        firePokemon.pyroBall();

        WaterPokemon waterPokemon = new WaterPokemon("HydroJetti", 200, "tsunami", 50, 1000, 250);
        waterPokemon.eats("whales");
        waterPokemon.speaks("sonar waves");
        waterPokemon.tsunami();
        waterPokemon.torrent();

        GrassPokemon grassPokemon= new GrassPokemon("GrassyChopper", 250, "grass spike storm", "grass wall", 60, 500);
        grassPokemon.eats( "cows");
        grassPokemon.speaks("Morse code");
        grassPokemon.storm();
        grassPokemon.tornadoes();

        ElectricPokemon electricPokemon = new ElectricPokemon("TeslaCrusher", 500, "electro storm", 10000,"thunderbolts", 100000 );
        electricPokemon.eats("gasolin guzzlers");
        electricPokemon.speaks("lightning flashes");
        electricPokemon.electrification();
        electricPokemon.lighteningStrike();

    }
}