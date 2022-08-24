package Homework2;

public class Homework4 {
    public static void main(String[] args) {
        // Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500

        int money = 200000;
        int montlypayment = 9500;
        int payments = 0;

        for (int i = 0; i < money; i = i + montlypayment) {
            payments++;
        }
        int years = payments / 12;
        int month = payments % 12;
        System.out.println("Для этого нужно" + " " + years + " " + "год и" + " " + month + " " + "месяцев");
    }
}

