package Lesson9;

public class Excellent extends Student {

    @Override
    public void printPerimetrTriangle(int a, int b, int c) {
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Это не треугольник");
        } else {
            System.out.println(a + b + c);
        }
    }
}
