package Lesson12;

public class Main {
    public static void main(String[] args) {

        double [][] nums1 = {{1, 1, 1, 1}, // 0:40:00
                             {2, 2, 2, 2}, // сделали два массива, чтобы было удобнее обернуть в матрицы
                             {3, 3, 3, 3}};

        double [][] nums2 = {{4, 4, 4, 4},
                             {5, 5, 5, 5},
                             {6, 6, 6, 6}};

        Matrix a = new Matrix(nums1); // создали 2 матрицы
        Matrix b = new Matrix(nums2);


        //прорабатываем метод ADD    1:04:00!!!!
        // Matrix a - (неявный параметр) - внутри метода уже, считается как this
        // Matrix b - (явный параметр) - идет уже как otherMatrix
        // от этого получается, что метод ADD складывает 2 матрицы (а.add(b))
        // IMatrix - возвращаемый тип интерфейс, так указано в самом методе!
        IMatrix result = a.add(b);
        result.printToConsole(); //sdadasd

    }
}
