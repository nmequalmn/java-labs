import ru.ifmo.se.pokemon.*;
import my.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle a = new Battle();
        Pokemon k = new Pokemon("Typical", 1);
        Pokemon b = new Scyther("Scyther", 1);
        a.addFoe(k);
        a.addAlly(b);
        a.go();
    }


}