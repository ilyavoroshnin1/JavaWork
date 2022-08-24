package Lesson3;

public class Main {
    public static void main(String[] args) {

        /** Как создать массив?
         * 1. Когда мы не знаем, что там лежит!
         * 2. Уже знаем, что там лежит, и создаем уже заполненный!
         *
         * СОздать массив чисел и вывести все значения на консоль
         */

        int[] numbers = {2, 5, 6, 2, 1, 4, 6};

//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[5]);
//        System.out.println(numbers[6]);

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }


    }
}
