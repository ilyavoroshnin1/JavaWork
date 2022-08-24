package Lesson3;

public class Main3 {
    public static void main(String[] args) {
        /**
         * Есть массив символов,
         * вывести на консоль весь массив в обратном порядке
         */


        char[] symbols = {'@', '#', '!', '&', '&', '*','^'};
//        System.out.println(7);
//        System.out.println(6);
//        System.out.println(5);
//        System.out.println(4);
//        System.out.println(3);
//        System.out.println(2);
//        System.out.println(1);
//        System.out.println(0);

        for (int i = symbols.length - 1; i >= 0; i--){
            System.out.print(symbols[i] + " ");
        }
    }
}
