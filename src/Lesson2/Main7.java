package Lesson2;

public class Main7 {
    public static void main(String[] args) {
        /**
         * Сколько мы заберем денег с банка, если положим 100000 на 5 лет под 8 процентов депозита
         * проценты капают ежемесячно, сложный процент
         */

        int money = 100000;
        int years = 5;
        int procent = 8;

        for ( int month = 0; month<12 * years; month++){
            money = money + ((money / 100 * procent) / 12);
        }

        System.out.println(money);
    }
}
