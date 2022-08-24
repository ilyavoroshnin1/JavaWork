package Lexa10.interfaces;

public class Matrix {
    private double[][] matrix;

    public Matrix() {
    }

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
    }

    public int getRows() {
        return matrix.length; // кол-во строк
    }

    public int getColumns() {
        return matrix[0].length; // кол-во колонок
    }

    public double getValueAt(int rowIndex, int colIndex) {
        if (rowIndex >= getRows()) {
            System.out.println("Слишком большой индекс строки");
            return -1;
        }
        if (colIndex >= getColumns()) {
            System.out.println("Слишком большой индекс колонки");
            return -1;
        }
        return matrix[rowIndex][colIndex];
    }

    public void setValueAt(int rowIndex, int colIndex, double value) {
        if (rowIndex >= getRows()) {
            System.out.println("Слишком большой индекс строки");
            return;
        }
        if (colIndex >= getColumns()) {
            System.out.println("Слишком большой индекс колонки");
            return;
        }
        matrix[rowIndex][colIndex] = value;
    }

    public boolean isNullMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0.0) {
                    return false;
                }
            }
        }
        return true;
    }
}
