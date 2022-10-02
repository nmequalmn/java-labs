package my.pokemons;

import my.pokemons.attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gallade extends Pokemon {
    public Gallade(String name, int level) {
        super(name, level);
        setStats(68,125,65,65,115,80);
        setType(Type.PSYCHIC, Type.FIGHTING);
        setMove(new Thunderbolt(), new ShadowBall(), new MagicalLeaf(), new Rest());
        return;
    }
}
