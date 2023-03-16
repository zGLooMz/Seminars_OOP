package Seminars_OOP.Seminar3;

import java.util.Comparator;

public class IncreaseSSD implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        return o1.getSSD() - o2.getSSD();
    }
}