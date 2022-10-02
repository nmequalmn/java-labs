package my.pokemons;

import my.pokemons.attacks.Tackle;
import my.pokemons.attacks.ScaryFace;
import my.pokemons.attacks.IronHead;
import my.pokemons.attacks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Passimian extends Pokemon {

    public Passimian(String name, int level) {
        super(name, level);
        setStats(100,120,90,40,60,80);
        setType(Type.FIGHTING);
        setMove(new Tackle(), new ScaryFace(), new IronHead(), new Rest());
        return;
    }

}
