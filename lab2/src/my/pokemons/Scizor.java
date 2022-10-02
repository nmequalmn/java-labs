package my.pokemons;

import my.pokemons.attacks.DoubleHit;
import my.pokemons.attacks.DoubleTeam;
import my.pokemons.attacks.MetalClaw;
import my.pokemons.attacks.QuickAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Scizor extends Pokemon {
    public Scizor(String name, int level) {
        super(name, level);
        setStats(70,130,100,55,80,65);
        setType(Type.BUG, Type.STEEL);
        setMove(new DoubleTeam(), new QuickAttack(), new DoubleHit(), new MetalClaw());
        return;
    }
}
