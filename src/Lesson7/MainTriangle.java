package Lesson7;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

       // вызов метода
        // в метод всегда передается 2 типа параметров:
        // явные - передаются в метод в виде входящих пар-ов (явно вложены) (triangle.setA( ЭТО - 7););
        // неявные - тот объект, у которого вызван данный метод ( ЭТО - triangle) --> внутри метода THIS. доступен!!!
        triangle.setA(7);
        triangle.setB(5);
        triangle.setC(10);

        Triangle triangle2 = new Triangle(5,5,6);
//        triangle2.setA(5);
//        triangle2.setB(5);
//        triangle2.setC(6);

        System.out.println(triangle.perimetr());
        System.out.println(triangle2.perimetr());



        System.out.println();
    }
}
