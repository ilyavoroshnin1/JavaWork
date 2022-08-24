package Lesson3;

public class Main2 {
    public static void main(String[] args) {
        /**
         * Есть массив с числами
         * нужно вывести на консоль сумму только четных чисел
         */

        int [] numbers = {2,5,8,2,9,5,2,6,4,1,8,6};

        int summaChetnyhChisel = 0;

        for (int i = 0; i < numbers.length; i++ ){
            if (numbers[i] % 2 ==0){
                summaChetnyhChisel = summaChetnyhChisel + numbers[i];

            }


        } System.out.println(summaChetnyhChisel);
    }
}
