package my.pokemons.attacks;

import my.pokemons.Func;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class IronHead extends PhysicalMove {
    public IronHead(){
        super(Type.STEEL, 80,100);
    }

    @Override
    protected String describe(){
        return " ironhead ";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(Func.rand(30)){
            Effect.flinch(p);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

    }
}
