package Moves;
import ru.ifmo.se.pokemon.*;
import static ru.ifmo.se.pokemon.Effect.paralyze;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 0.7);
    }
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.3) paralyze(p);
    }
    public String describe(){
        return "атакует цель мощнейшим ударом молнии";
    }
}
