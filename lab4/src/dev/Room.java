package dev;

public class Room extends Space{
    class Furniture {
        // some code here
    }
    private PurityState purity;

    private Furniture[] furniture;

    private Furniture Door;

    public Room(String name, PurityState cleanliness){
        super(name);
        this.purity = cleanliness;
        Door = new Furniture(){
                public int color;
        };
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