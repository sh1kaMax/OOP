package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Persian extends Pokemon{
    public Persian(String name, int level){
        super(name, level);
        this.setStats(65, 70,60, 65, 65, 115);
        this.setType(Type.NORMAL);
        this.setMove(new ShadowBall(), new Thunder(), new DarkPulse(), new PowerGem());
    }
}
