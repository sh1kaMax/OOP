package Moves;

import ru.ifmo.se.pokemon.*;

public class PowerGem extends SpecialMove {
    public PowerGem(){
        super(Type.ROCK, 80, 1);
    }
    public String describe(){
        return "атакует цель лучом, сияющим подобно драгоценному камню";
    }
}
