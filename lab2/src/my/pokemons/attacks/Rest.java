package my.pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0,0);
    }

    @Override
    protected String describe(){
        return " rest ";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect rest = new Effect().stat(Stat.HP,100);
        p.addEffect(rest);
        Effect.sleep(p);
    }
}
