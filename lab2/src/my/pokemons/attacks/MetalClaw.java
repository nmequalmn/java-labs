package my.pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class MetalClaw extends PhysicalMove {
    public MetalClaw(){
        super(Type.STEEL, 50,95);
    }

    @Override
    protected String describe(){
        return "  metalclaw ";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect att = new Effect().stat(Stat.ATTACK, +1);
        p.addEffect(att);
    }
}
