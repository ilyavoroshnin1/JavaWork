package Lesson5;

public class Main {
    public static void main(String[] args) {
        // учимся создавать методы и вызывать их в другом файле
        MathOperationgs.printTypeOfTriangle(30,4,6);



        double Square1 = MathOperationgs.ploshadTriangle(3, 7, 6);
        double Square2 = MathOperationgs.ploshadTriangle(4, 8);
        if (Square1>Square2){
            System.out.println("Первый треугольник больше");
        } else if (Square1<Square2){
            System.out.println("Второй треугольник больше");
        }else {
            System.out.println("Треугольники равны");
        }


    }
}
