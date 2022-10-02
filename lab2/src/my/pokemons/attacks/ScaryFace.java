package my.pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class ScaryFace extends StatusMove{

    public ScaryFace(){
        super(Type.NORMAL, 0,100);
    }

    @Override
    protected String describe(){
        return " scary targer's face ";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect att = new Effect().stat(Stat.SPEED,-2);
        p.addEffect(att);
    }
}
