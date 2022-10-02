package my.pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class MagicalLeaf extends SpecialMove {
    public MagicalLeaf(){
        super(Type.GRASS, 0,0);
    }

    @Override
    protected String describe(){
        return " magicalleaf ";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect attack = new Effect().stat(Stat.HP,-60);
        p.addEffect(attack);
    }
}
