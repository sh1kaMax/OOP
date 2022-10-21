package Moves;
import ru.ifmo.se.pokemon.*;

public class BellyDrum extends StatusMove {
    public BellyDrum(){
        super(Type.NORMAL, 0, 1);
    }
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, (int) (Stat.HP.ordinal() * 0.5));
        p.setMod(Stat.ATTACK, Stat.ATTACK.ordinal());
    }
    public String describe(){
        return "бьёт себя по животу, наигрывая некий боевой марш";
    }
}
