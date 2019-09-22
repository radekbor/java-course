package dev.borowiecki.practices.day3.zoo;

public class Cat extends Pet {

    protected Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Miu miu");
    }
}
