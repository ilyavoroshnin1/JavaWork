package Lesson4;

public class Main2 {
    public static void main(String[] args) {

        int [][] numbers = new int[8][8]; // создаем сперва двухмерный массив 8*8, заполненый ноликами
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++){
                if (i == j){ // для того, чтобы правильно составить уравнение, нужно в экселе прорисовать и вывести формулу. если ((i+j) % 2 == 0) - нолики и единички будут печататься поочередно
                    System.out.print("0 ");
                }else {
                    System.out.print(" _ ");
                }

            }
            System.out.println();
        }

    }
}
