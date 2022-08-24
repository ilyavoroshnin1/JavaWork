package Homework4;

public class Homework2 {
    public static void main(String[] args) { // сделать ромбик в массиве 6-6

        int[][] numbers = new int[4][7];
        for (int i = 0; i < numbers.length; i++) {
            int a = 1;
            if (i < numbers.length){ a= a +2;
            }
            for (int j = 0; j < numbers[i].length; j++) {
                int b = 3;
                if (i < numbers.length){
                    b -=1;
                }
//                System.out.print(" _ ");
                System.out.print(numbers[a][b] + " 1 ");
            }
            System.out.println();

        }
//        int[][] numbers1 = new int[4][7];
//        for (int i = 0; i < numbers1.length; i++) {
//            for (int j = 0; j < numbers1[i].length; j++) {
//                System.out.print(" _ ");
//
//            }
//            System.out.println();
    }
}
//}