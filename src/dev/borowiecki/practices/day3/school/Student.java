package dev.borowiecki.practices.day3.school;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private int exams = 5;
    private int[] m = new int[exams];

    /*
    - Gdy uczen podszedl do wszystkich egzaminow zwroc srednia
    - W przeciwnym wypadku zwroc 0
     */
    public double avg() {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 0) {
                return 0.0;
            }
            sum += m[i];
        }
        return sum / exams;
    }

    public void receiveMark(int subject, int mark) {
        if (0 <= subject && subject < exams) {
            m[subject] = mark;
        }
    }

}
