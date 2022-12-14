import dev.*;


public class Main {
    public static void main(String[] args) {
        Room location = new Room("Майами", PurityState.DIRTY);
        Genius znayka = new Genius("Знайка", 18, State.ILL, location);
        System.out.println(znayka.toString());
        znayka.doGym();
        System.out.println(znayka.toString());
        System.out.println("Room " + location.getName() + " is " + location.getPurity().name());
        if(znayka.getBusyStatus() == BusyState.FREE){
            znayka.doClean(location);
        }
        System.out.println("Room " + location.getName() + " is " + location.getPurity().name());
    }
}