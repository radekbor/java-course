package dev.borowiecki.practices.day3.zoo;

public class Test {

    public static void main(String[] args) {
        Dog dog = new ShowDog("Pixel");

        PetOwner owner = new PetOwner();

        owner.play(dog);

        Cat cat = new Cat("R");

        owner.play(cat);
    }

}
