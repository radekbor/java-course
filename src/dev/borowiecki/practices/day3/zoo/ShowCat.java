package dev.borowiecki.practices.day3.zoo;

public class ShowCat extends Cat implements ShowAnimal {

    protected ShowCat(String name) {
        super(name);
    }

    @Override
    public void showPose() {
        System.out.println("Cat pose");
    }
}
