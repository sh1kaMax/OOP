package Moves;
import ru.ifmo.se.pokemon.*;
import static ru.ifmo.se.pokemon.Effect.confuse;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 0.85);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +2);
        confuse(p);
    }
    public String describe(){
        return "раздражает цель, провоцируя её на необдуманные действия";
    }
}
