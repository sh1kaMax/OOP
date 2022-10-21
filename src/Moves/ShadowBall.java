package Moves;

import ru.ifmo.se.pokemon.*;


public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 1);
    }
    protected void applyOppEffects (Pokemon p){
        if (Math.random() <= 0.2) p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
    public String describe(){
        return "формирует шар из тёмной энергии, после чего запускает его в цель";
    }
}
