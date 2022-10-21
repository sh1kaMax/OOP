package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Azumarill extends Pokemon {
    public Azumarill(String name, int level){
        super(name, level);
        this.setStats(100, 50, 80, 60, 80, 50);
        this.setType(Type.WATER, Type.FAIRY);
        this.setMove(new Facade(), new Swagger(),new BellyDrum(), new AquaTail());
    }
}
