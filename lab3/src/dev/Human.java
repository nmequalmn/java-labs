package dev;

public abstract class Human {
    private String name;
    private int age;
    private State status;
    private Mood mood;
    private BusyState busyStatus;
    private Space location;
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public State getStatus(){
        return this.status;
    }
    public Mood getMood(){
        return this.mood;
    }
    public BusyState getBusyStatus(){return this.busyStatus;}
    public Human(String name, int age, State status, Space location){
        this.name=name;
        this.age=age;
        this.status=status;
        this.location = location;
        this.mood = Mood.GOOD;
        this.busyStatus = BusyState.FREE;
        return;
    }

    protected void setStatus(State stat){
        this.status = stat;
        return;
    }

    protected void setMood(Mood mood){
        this.mood = mood;
        return;
    }
    protected void setBusyStatus(BusyState status){
        this.busyStatus = status;
        return;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) {return true;}
        Human human = (Human) o;
        if(getAge() != human.getAge() || getName() != human.getName() || getStatus() != human.getStatus()){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        String result = "Human with name " + getName() +  ", age " + getAge() + ", status ";
        if(getStatus()==State.HEALTHY){
            result += "HEALTHY.";
        }else {
            result += "ILL.";
        }
        return result;
    }

    @Override
    public int hashCode(){
        int M = (int) Math.pow((double) 10,(double) 7) + 19;
        int result = getName().hashCode()%M;
        result=(result+getAge())%M;
        if(getStatus()==State.HEALTHY) {result=(result+1)%M;}
        return result;
    }

    public Space getLocation() {
        return location;
    }

    public void goTo(Space location) {
        this.location = location;
        return;
    }
}