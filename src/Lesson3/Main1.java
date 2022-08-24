package Lesson3;

public class Main1 {
    public static void main(String[] args) {
        /**
         * Создать массив в 10 ячеек и наполнить его четными числами от 30 и далее
         * { 30, 32, 34, 36, 38, 40, 42, 44, 46, 48
         */


        int[] numbers = new int[10];

//        numbers [0] = 30;
//        numbers [1] = 32;
//        numbers [2] = 34;
//        numbers [3] = 36;
//        numbers [4] = 38;
//        numbers [5] = 40;
//        numbers [6] = 42;
//        numbers [7] = 44;
//        numbers [8] = 46;
//        numbers [9] = 48;
//
        int even = 30;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = even;
            even += 2;

        }


    }
}
