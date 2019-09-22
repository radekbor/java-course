package dev.borowiecki.practices.day3.zoo;

public class ShowDog extends Dog implements ShowAnimal{

    protected ShowDog(String name) {
        super(name);
    }

    @Override
    public void showPose() {
        System.out.println("Dog pose");
    }
}
