package Lesson2;

public class Main6 {
    public static void main(String[] args) {
        /**
         * напечатать на консоль числа от 30 до 100 числа кратные 3 и 5
         */
        for (int i = 30; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);

            }
        }
    }
}
