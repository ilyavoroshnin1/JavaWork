package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Мы - турагенство, у нас есть определенное кол-во туров
         * "я хочу поехать в такую страну с таким то бюджетом? или какая сегодня средняя стоимость и куда?... - максимально популярные вопросы
         * будем брать с клавиатуры, прога будет выдавать прав варианты в зависимости от того, что мы выбрали
         *
         *
         * ПРОГРАММА отображает правильный набор туров в зависимости от потребностей человека
         *
         */

        String[][] tours = {{"1", "Италия", "5 дней", "Самолет", "5 звезд", "120000", "полупансионат"},
                            {"2", "Франция", "7 дней", "Самолет", "4 звезд", "15000", "завтрак"},
                            {"3", "Грузия, Армения", "10 дней", "Автобус", "4 звезд", "80000", "пансионат"},
                            {"4", "Армения", "12 дней", "Автобус", "1 звезда", "90000", "завтрак"},
                            {"5", "Турция", "13 дней", "Самолет", "5 звезд", "130000", "полупансионат"},
                            {"6", "Турция", "19 дней", "Автобус", "3 звезд", "110000", "полупансионат"},
                            {"7", "Италия, Франция", "6 дней", "Автобус", "4 звезды", "150000", "полупансионат"},
                            {"8", "Италия", "7 дней", "Самолет", "5 звезд", "150000", "завтрак"},
                            {"9", "Мальдивы", "9 дней", "Самолет", "3 звезды", "140000", "пансионат"},
                            {"10", "Мальта, Турция", "12 дней", "Самолет", "2 звезды", "190000", "пансионат"}
        };
        System.out.println("Добрый день! Выберите действие: ");

        System.out.println(" 1 - Узнать среднюю стоимость тура в определенную страну");
        System.out.println(" 2 - Узнать среднюю стоимость любого тура");
        System.out.println(" 3 - Вывести туры в определенную страну");
        System.out.println(" 4 - Вывести туры ценой ОТ и ДО");
        System.out.println(" 5 - Вывести туры +- 2 дня от введенной длительности в определенную страну");
        System.out.println(" 6 - Вывести выгодные туры (выгодными считаются туры со стоимостью ДО 10т в день)");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("1")) {
            String country = ScannerUtils.getInputCountry(); // метод по выбору страны! чтобы человек выбрал страну,
            int averagePrice = TourUtils.getAveragePriceByCountry(tours, country); // узнали среднюю стоимость
            System.out.println("Средняя стоимость в " + country + " = " + averagePrice);
        } else if (answer.equals("2")) {
            int averageCostOfTours = TourUtils.averageCostOfTours(tours);
            System.out.println("Средняя стоимость всех имеющихся туров составляет: " + averageCostOfTours);
        } else if (answer.equals("3")) {
            String country = ScannerUtils.getInputCountry();
            System.out.println("Туры в эту страну " + country + ": ");
            TourUtils.printToursByCountry(tours, country);
        } else if (answer.equals("4")) {
            TourUtils.priseToursFromAndTo(tours);
        } else if (answer.equals("5")) {
            TourUtils.toursByDurationAndCountry(tours);
        } else if (answer.equals("6")) {
            TourUtils.profitableTours(tours);
        }
    }
}
