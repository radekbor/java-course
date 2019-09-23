package dev.borowiecki.presentation;

public class Ex28 {
    public static void main(String[] args) {

    }
}

enum PlanetsV2 {
    A, B {
        @Override
        boolean isCloser() {
            return true;
        }
    }, C;
    
    boolean isCloser() {
        return false;
    }
}
