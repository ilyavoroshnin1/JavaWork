package Homework3;

public class Homework3 {
    public static void main(String[] args) {

        /**
         * Домашнее задание на среду:
         * Есть массив цифр (задайте его сами). Вывести на консоль:
         * 3) Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трем.
         */

        int[] numbers = {1, 4, 7, 12, 4000, 3, 5, 800, 9998};
        System.out.println("Все числа в обратном порядке (кратные трем - дважды):");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 3 == 0) {
                System.out.print(numbers[i] + " ");
            }
            System.out.print(numbers[i] + ",");
        }


//        System.out.println( );
//
//        System.out.println("Кратные трем:");
//        for (int j = 0; j < numbers.length; j++) {
//            if (numbers[j] % 3 == 0) {
//                System.out.print(numbers[j] + "," + numbers[j] + ",");
    }
}

