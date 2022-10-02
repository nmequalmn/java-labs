package my.pokemons;

import my.pokemons.attacks.MagicalLeaf;
import my.pokemons.attacks.ShadowBall;
import my.pokemons.attacks.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kirlia extends Pokemon {
    public Kirlia(String name, int level) {
        super(name, level);
        setStats(38,35,35,65,55,50);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Thunderbolt(), new ShadowBall(), new MagicalLeaf());
        return;
    }
}
