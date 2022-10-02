package my.pokemons;

import ru.ifmo.se.pokemon.*;

public class TempMove extends PhysicalMove{

    public TempMove(){
        super(Type.NORMAL, 10.0,10.0);
    }

    @Override
    protected String describe(){
        return " tempmove ";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

    }
}
