package Moves;
import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 1);
    }
    protected void applySelfEffects(Pokemon p, Pokemon def){
        Status PokemonCondition = def.getCondition();
        if(PokemonCondition.equals(Status.SLEEP)) {
            p.setMod(Stat.HP, -(int) (power * 0.5));
        }
    }
    public String describe(){
        return "ворует сны цели и насылает на неё кошмары";
    }
}
