package my.pokemons;
import my.pokemons.attacks.QuickAttack;
import ru.ifmo.se.pokemon.*;
import my.pokemons.attacks.DoubleHit;

public class Scyther extends Pokemon{
    public Scyther(String name, int level) {
        super(name, level);
        setStats(70, 110, 80, 55, 80, 105);
        setType(Type.BUG, Type.FLYING);
        setMove(new DoubleHit(), new QuickAttack());
        return;
    }
}
