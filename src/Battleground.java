import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Battleground {
    public static void main(String[] args) {
        Battle battleground = new Battle();
        battleground.addFoe(new Azumarill("", 1));
        battleground.addFoe(new Meowth("", 1));
        battleground.addFoe(new Rotom("", 1));
        battleground.addAlly(new Marill("", 1));
        battleground.addAlly(new Azurill("", 1));
        battleground.addAlly(new Persian("", 1));
        battleground.go();
    }
}
