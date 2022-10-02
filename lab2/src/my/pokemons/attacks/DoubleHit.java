package my.pokemons.attacks;
import ru.ifmo.se.pokemon.*;

public class DoubleHit extends PhysicalMove {
    public DoubleHit(){
        super(Type.NORMAL, 35, 90, 0, 2);
    }
    @Override
    protected String describe() {
        return " double hit ";
    }

}
