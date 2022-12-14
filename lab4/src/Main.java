import dev.*;


public class Main {
    public static void main(String[] args) {
        Room location = new Room("Майами", PurityState.DIRTY);
        Genius znayka = new Genius("Знайка", 18, State.ILL, location);
        znayka.setBusyStatus(BusyState.BUSY);

        try{
            znayka.thinkAbout("лунный камень");
        } catch (BusyException e){
            System.out.println(e.toString());
        }

        znayka.setBusyStatus(BusyState.FREE);
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