package lesson1;

public class Main1 {

    public static void main(String[] args) {

        /**
         * есть число, нужно понять - оно четное или нет
         */
        int number = 12541215;

        // всегда останется или 0 или 1
        if (number % 2 == 0) {
            System.out.println("Четное");
        } else if (number % 2 > 0){
            System.out.println("Нечетное");
        }
    }

}
