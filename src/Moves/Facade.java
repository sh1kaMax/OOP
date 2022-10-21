package Moves;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 1);
    }
    protected void applyOppDamage(Pokemon def, double damage){
        Status PokemonCondition = def.getCondition();
        if(PokemonCondition.equals(Status.BURN) || PokemonCondition.equals(Status.PARALYZE) || PokemonCondition.equals(Status.POISON)) {
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }
    public String describe(){
        return "преодолевает трудности, атакуя с двойной силой";
    }
}
