package Lesson2;

public class Main1 {
    public static void main(String[] args) {
        /**
         * Есть три стороны треугольника, наша задача написать вид треугольника:
         * разностооронний a!=b
         * равнобедренный
         * равносторонний a==b
         */

        int a = 15;
        int b = 15;
        int c = 15;

        // управляющая конструкция
        if (a == b && a==c && b==c) {
            System.out.println("равносторонний");

        } else if (a!=b && a!=c && b!=c) {
            System.out.println("разносторонний");

        } else {
            System.out.println( "равнобедренный");
        }
    }
}
