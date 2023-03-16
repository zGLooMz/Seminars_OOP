package Seminars_OOP.Seminar3;

import java.util.ArrayList;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        Comparator<Notebook> PriceReduction = new PriceReduction();
        Comparator<Notebook> RamReduction = new RamReduction();
        Comparator<Notebook> IncreaseSSD = new IncreaseSSD();

        Notebook notebook1 = new Notebook(800, 16, 500);
        Notebook notebook2 = new Notebook(600, 6, 750);
        Notebook notebook3 = new Notebook(1200, 32, 1000);
        Notebook notebook4 = new Notebook(1000, 32, 750);
        Notebook notebook5 = new Notebook(300, 8, 120);
        Notebook notebook6 = new Notebook(500, 6, 240);

        ArrayList<Notebook> notebooks = new ArrayList<>();

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);

        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
        System.out.println("");

        notebooks.sort(null);
        System.out.println("1. По возрастанию цены");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }

        notebooks.sort(PriceReduction);
        System.out.println("2. По убыванию цены");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }

        notebooks.sort(RamReduction);
        System.out.println("3. По оперативке по убыванию. Если оперативки равны - по убыванию ценыы");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }

        notebooks.sort(IncreaseSSD);
        System.out.println("4. По объему диска по возрастанию");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }

    }
}