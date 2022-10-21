package Moves;
import ru.ifmo.se.pokemon.*;
import static ru.ifmo.se.pokemon.Effect.flinch;

public class DarkPulse extends SpecialMove{
    public DarkPulse(){
        super(Type.DARK, 80, 1);
    }
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.2) flinch(p);
    }
    public String describe(){
        return "направляет на цель тёмные импульсы";
    }
}
