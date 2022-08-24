package Lesson12;

public class Matrix implements IMatrix {
    //матрица максимально похожа на двухмерный массив, потому создаем сперва сам массив
    private double[][] numbers; // т.к. мы не знаем какая будет матрица, мы просто закрываем без знака =

    public Matrix() { // в пустом конструкторе задаем условия миним-ой матрицы!
        numbers = new double[IMatrix.DEFAULT_MATRIX_SIZE][IMatrix.DEFAULT_MATRIX_SIZE]; // IMatrix.DEFAULT_MATRIX_SIZE (интерфейс) - размер матрицы для конструктора без параметров. После этого действия мин. матрица будет теперь 1*1
    }

    public Matrix(int row, int col) { // создаем конструктор уже с пар-ми; (int row)-кол-во строк, (int col)-кол-во колонок
        numbers = new double[row][col];
    }

    public Matrix(double[][] numbers) { // создаем последний вариант конструктора со всеми пар-ми входящими, чтобы было удобно работать в МЕЙНЕ
        this.numbers = numbers;
    }


    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException { // вернуть значение по позиции
        if (rowIndex < 0 || rowIndex >= getRows()) { // rowIndex <= 0 - чтобы колонок всегда было больше 0;       rowIndex >= getRows() - ???
            System.out.println("Неверный индекс строки!");
            return -1;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!");
            return -1;
        }
        return numbers[rowIndex][colIndex];
    }


    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException { // переприсвоить значение по индексам
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!");
            return;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!");
            return;
        }
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException { // СЛожение матриц
        // this - а матрица
        // otherMatrix - b матрица

        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Ошибка! Пар-мы матриц не равны по строкам");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Ошибка! Пар-мы матриц не равны по столбцам");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i,j) + otherMatrix.getValueAt(i,j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        return null;
    }

    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public void fillMatrix(double value) {

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        return false;
    }

    @Override
    public void printToConsole() { //48:00  исправили метод по вызову матрицы на консоль
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
