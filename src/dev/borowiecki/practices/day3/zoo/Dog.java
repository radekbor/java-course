package dev.borowiecki.practices.day3.zoo;

public class Dog extends Pet {
    protected Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("hau hau");
    }
}
