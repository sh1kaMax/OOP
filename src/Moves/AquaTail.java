package Moves;
import ru.ifmo.se.pokemon.*;

public class AquaTail extends PhysicalMove {
    public AquaTail(){
        super(Type.WATER, 90, 0.9);
    }
    public String describe(){
        return "атакует цель, размахивая своим хвостом, будто хлёсткой волной в бушующий шторм";
    }
}
