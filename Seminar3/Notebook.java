package Seminars_OOP.Seminar3;

public class Notebook implements Comparable<Notebook> {
    private int cost;
    private int ram;
    private int ssd;

    public Notebook(int cost, int ram, int ssd) {
        this.cost = cost;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String toString() {
        return "Notebook (cost = " + cost + ", ram = " + ram + ", SSD = " + ssd + ")";
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setRAM(int RAM) {
        this.ram = RAM;
    }

    public void setSSD(int SSD) {
        this.ssd = SSD;
    }

    public int getCost() {
        return cost;
    }

    public int getRam() {
        return ram;
    }

    public int getSSD() {
        return ssd;
    }

    @Override
    public int compareTo(Notebook o) {
        if (this.cost > o.cost) {
            return 1;
        } else if (cost == o.cost) {
            return 0;
        }
        return -1;
    }

}