package dev.borowiecki.home.after_week_2.company.fluent;

import dev.borowiecki.home.after_week_2.company.fluent.*;

public class Test {
    public static void main(String[] args) {
        Manager crisCompany = new Manager("Cris")
            .withEmployee(
                new Manager("Tom")
                    .withEmployee(new Manager("Emily"))
                    .withEmployee(new Manager("Mark"))
            )
            .withEmployee(
                    new OfficeWorker("Joe")
            )
            .withEmployee(new OfficeWorker("Billy"));
        System.out.println(crisCompany.structure());
    }
}
