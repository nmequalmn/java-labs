package my.pokemons;

import my.pokemons.attacks.DoubleHit;
import my.pokemons.attacks.QuickAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class TempPokemon extends Pokemon {

    public TempPokemon(String name, int level) {
        super(name, level);
        setStats(70, 110, 80, 55, 80, 105);
        setType(Type.BUG, Type.FLYING);
        setMove(new DoubleHit(), new QuickAttack());
        return;
    }

}
