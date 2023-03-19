package Seminars_OOP.Seminar4;

public class Main {

    public static void main(String[] args) {
        // Есть классы: GoldenApple -> Apple -> Fruit
        // Orange -> Fruit
        // Есть класс Box. Нужно:
        // 1. Организовать его так, чтобы он мог хранить только фрукты какого-то типа
        // 2. Реализовать методы добавления фрукта, пересыпания в другую коробку,
        // получение сумарного веса
        // Ограничения:
        // В коробку с апельсинами нельзя добавить яблоки
        // В коробку с золотыми яблоками нельзя добавить апельсины и яблоки
        // Пересыпать из коробки с золотыми яблоками в коробку с яблоками можно!
        // 3.* Реализовать итерируемость по коробке

        Box<Apple> appleBox = new Box<Apple>(new Apple(10));
        Box<Orange> orangeBox = new Box<Orange>();
        Box<GoldenApple> goldenAppleBox = new Box<>(new GoldenApple(15));

        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(4));
        System.out.println("Масса яблок: " + appleBox.getWeight());

        orangeBox.add(new Orange(5));
        System.out.println("Масса апельсинов: " + orangeBox.getWeight());

        goldenAppleBox.add(new GoldenApple(2));
        System.out.println("Масса золотых яблок: " + goldenAppleBox.getWeight());

        goldenAppleBox.moveTo(appleBox);
        System.out.println("Масса золотых яблок после пересыпания: " + goldenAppleBox.getWeight());
        System.out.println("Масса яблок с золотыми яблоками после пересыпания: " + appleBox.getWeight());

        // 3
        System.out.println();
        for (Apple apple : appleBox) {
            System.out.println(apple.getWeight());
        }

    }
}