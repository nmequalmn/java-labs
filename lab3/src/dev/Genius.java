package dev;

public class Genius extends Human implements GymnasticGym, Clean {

    public Genius(String name, int age, State status, Space location ){
        super(name, age, status, location);
    }

    @Override
    public void doGym() {
        System.out.println(getName()+" делает гимнастическую разминку!");
        setMood(Mood.GOOD);
        setStatus(State.HEALTHY);
        return;
    }

    @Override
    public void doClean(Room room) {
        room.setPurity(PurityState.CLEAN);
        System.out.println(getName()+" убирается в комнате '" + room.getName() + "'!");
        return;
    }
}