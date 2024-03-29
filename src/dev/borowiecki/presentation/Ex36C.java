package dev.borowiecki.presentation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex36C {

    public static void main(String[] args) {

        Set<Number> set = new LinkedHashSet<>();
        set.add(new Long(1));
        set.add(new Integer(2));
        set.add(new Integer(3));
        set.add(new Integer(1));
        System.out.println(set.size());
        System.out.println(set);

        Set<Car> set2 = new LinkedHashSet<>();
        set2.add(new Car("sth", 1));
        set2.add(new Car("sth", 1));
        System.out.println("<---->");
        set2.add(new Car("sth2", 1));
        set2.add(new Car("sth3", 2));
        System.out.println(set2);
        System.out.println("<---->");
        set2.add(new Car("sth", 1));


    }

    static class Car {

        private String name;
        private int seats;

        Car(String name, int seats) {
            this.name = name;
            this.seats = seats;
        }

        @Override
        public int hashCode() {
            System.out.println("hashCode");
            return seats;
        }

        @Override
        public boolean equals(Object obj) {
            System.out.println("equals");
            if (obj instanceof Car) {
                Car other = (Car) obj;
                if (other.seats == this.seats) {
                    return other.name.equals(this.name);
                }
            }
            return false;
        }
    }
}


