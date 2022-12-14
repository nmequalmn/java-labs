package dev;

public abstract class Space {

    private String name;

    public String getName() {
        return name;
    }

    public Space(String name){
        this.name = name;
        return;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) {return true;}
        Space loc = (Space) o;
        if(this.getName() != loc.getName()){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Location '" + getName() +  "'.";
    }

    @Override
    public int hashCode(){
        return getName().hashCode();
    }
}