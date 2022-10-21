package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Meowth extends Pokemon {
    public Meowth(String name, int level){
        super(name, level);
        this.setStats(40, 45, 35, 40, 40, 90);
        this.setType(Type.NORMAL);
        this.setMove(new DarkPulse(), new ShadowBall(), new Thunder());
    }
}
