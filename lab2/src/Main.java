import ru.ifmo.se.pokemon.*;
import my.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle a = new Battle();
        Pokemon Oleg = new Passimian("Passimian",1);
        Pokemon Mark = new Scyther("Scyther",1);
        Pokemon Kostya = new Scizor("Scizor",1);
        Pokemon Michael = new Ralts("Ralts",1);
        Pokemon Nikita = new Kirlia("Kirlia",1);
        Pokemon Igor = new Gallade("Gallade",1);
        a.addFoe(Oleg);
        a.addFoe(Kostya);
        a.addFoe(Nikita);
        a.addAlly(Mark);
        a.addAlly(Michael);
        a.addAlly(Igor);
        a.go();
    }

}