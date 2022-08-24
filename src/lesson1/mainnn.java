package lesson1;

public class mainnn {
    public static void main(String[] args) {
        /**
         * у нас есть 3 стороны треугольника
         * напечатать на консоль какой это вид треугольник?
         * разносторонний
         * равнобедренный
         * равносторонний
         */

        int a = 12;
        int b = 13;
        int c = 15;

        // управляющая конструкция

        if (a != b && b!= c && c!= a){
            System.out.println("Это разносторонний треугольник!!!");
        } else if (a == b && b == c && c == a){
            System.out.println("Это равносторонний треугольник!!!");
        } else {
            System.out.println("Это равнобедренный треугольник!!!");
        }
    }
}
