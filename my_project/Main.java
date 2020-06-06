package my_project;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Мурик", 20);
        cat[1] = new Cat("Тиша", 12);
        cat[2] = new Cat("Кеша", 33);

        Random ran = new Random();
        int r = ran.nextInt(50);
        Plate p = new Plate(r);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(p);
        }

        int food = r;
        System.out.println("Добавление еды в тарелку: " + food * 2);

        addFood(p, food);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(p);
        }
    }
        static void addFood (Plate p, int food)
        {
            p.increaseFood(food);
        }
}
