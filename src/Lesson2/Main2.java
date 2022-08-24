package Lesson2;

public class Main2 {
    public static void main(String[] args) {
        /**
         * У нас есть оценка, которую принес ученик со школы. Нужно напечатать на консоль
         * ОТЛИЧНО
         * ХОРОШО
         * НЕ ОЧЕНЬ
         * ПЛОХО
         * ЭТО НЕ ОЦЕНКА
         * в зависимости от оценки, которую нам принесли
         */

        int mark = 10;

        if (mark == 5) {
            System.out.println("ОТЛИЧНО");
        } else if (mark == 4) {
            System.out.println("ХОРОШО");
        } else if (mark == 3) {
            System.out.println("НЕ ОЧЕНЬ");
        } else if (mark == 2) {
            System.out.println("ПЛОХО");
        } else {
            System.out.println("ЭТО НЕ ОЦЕНКА");
        }

    }
}