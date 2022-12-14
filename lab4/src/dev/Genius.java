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
    public void doClean(Room room) throws HealthyException{
        if(this.getStatus()==State.ILL) throw new HealthyException("Нельзя убириаться больным!");
        room.setPurity(PurityState.CLEAN);
        class Object_to_Clean{
            /// some code here
        }
        /// some code here
        System.out.println(getName()+" убирается в комнате '" + room.getName() + "'!");
        return;
    }
}