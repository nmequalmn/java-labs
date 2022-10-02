package my.pokemons.attacks;

import my.pokemons.Func;
import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST,80,100);
    }

    @Override
    protected String describe(){
        return " shadowball ";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if(Func.rand(20)){
            Effect lower = new Effect().stat(Stat.SPECIAL_DEFENSE,-1);
            p.addEffect(lower);
        }
    }
}
