package Lesson13;

import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        Moneta moneta1 = new Moneta(2.5, 2, "Золото", 5);
        Moneta moneta2 = new Moneta(2.5, 2, "Золото", 5);
        Moneta moneta3 = new Moneta(2, 10, "Серебро", 555);
        Moneta moneta4 = new Moneta(5, 5, "Золото", 1);
        Moneta moneta5 = new Moneta(5, 12, "Бронза", 15);
        Moneta moneta6 = new Moneta(4, 44, "Бронза", 44);

        HashSet<Moneta> monetas = new HashSet<>();
        monetas.add(moneta1);
        monetas.add(moneta2);
        monetas.add(moneta3);
        monetas.add(moneta4);
        monetas.add(moneta5);
        monetas.add(moneta6);

        for (Moneta m : monetas) {
            System.out.println(m);
        }
    }
}
