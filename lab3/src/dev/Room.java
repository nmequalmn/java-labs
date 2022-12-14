package dev;

public class Room extends Space{
    private PurityState purity;
    public Room(String name, PurityState cleanliness){
        super(name);
        this.purity = cleanliness;
        return;
    }

    public void setPurity(PurityState cleanliness){
        this.purity = cleanliness;
        return;
    }

    public PurityState getPurity(){
        return this.purity;
    }
}