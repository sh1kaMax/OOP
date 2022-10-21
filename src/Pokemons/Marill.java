package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Marill extends Pokemon {
    public Marill(String name, int level){
        super(name, level);
        this.setStats(70, 20, 50, 20, 50, 40);
        this.setType(Type.WATER, Type.FAIRY);
        this.setMove(new Facade(), new Swagger(), new BellyDrum());
    }
}
