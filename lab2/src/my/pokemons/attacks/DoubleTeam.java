package my.pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0,0);
    }

    @Override
    protected String describe(){
        return " doubleteam ";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect usr  = new Effect().stat(Stat.EVASION,1);
    }
}
