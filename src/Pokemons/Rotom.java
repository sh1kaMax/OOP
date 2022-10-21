package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Rotom extends Pokemon {
    public Rotom(String name, int level){
        super(name, level);
        this.setStats(50, 50, 77, 95, 77, 91);
        this.setType(Type.ELECTRIC, Type.GHOST);
        this.setMove(new Confide(), new DreamEater(), new DarkPulse(), new DoubleTeam());
    }
}
