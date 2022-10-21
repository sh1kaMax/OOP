package Moves;
import ru.ifmo.se.pokemon.*;


public class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 0, 1);
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    public String describe(){
        return " доверяет цели секрет, и цель теряет способность к концентрации";
    }
}
