package my.pokemons.attacks;

import my.pokemons.Func;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC, 90,100);
    }

    @Override
    protected String describe(){
        return " thunderbolt ";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(Func.rand(10)) Effect.paralyze(p);
    }
}
