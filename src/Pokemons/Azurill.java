package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Azurill extends Pokemon {
    public Azurill(String name, int level){
        super(name, level);
        this.setStats(50, 20, 40, 20, 40, 20);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setMove(new Facade(), new Swagger());
    }
}
