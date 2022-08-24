package Homework4;

public class Homework1 { // сделать обратную диагональ
    public static void main(String[] args) {

        int[][] numbers = new int[8][8];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers[i].length - 1; j >= 0; j--) {
                if (i == j) {
                    System.out.print(" $ ");
                } else {
                    System.out.print(" . ");
                }

            }
            System.out.println();
        }
    }
}
