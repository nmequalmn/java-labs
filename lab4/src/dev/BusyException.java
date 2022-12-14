package dev;

public class BusyException extends Exception{
    @Override
    public String toString(){
        return "Человек занят!";
    }
}
