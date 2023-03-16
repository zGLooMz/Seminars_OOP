package Seminars_OOP.Seminar3;

import java.util.Comparator;

public class PriceReduction implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        return o2.getCost() - o1.getCost();
    }

}