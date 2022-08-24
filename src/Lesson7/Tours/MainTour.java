package Lesson7.Tours;

public class MainTour {
    public static void main(String[] args) {
        Tour tour1 = new Tour(1, 5, "Самолет", 5, 120000,"полупансионат");
        Tour tour2 = new Tour(2, 7, "Самолет", 4, 150000,"завтрак");
        Tour tour3 = new Tour(3, 10, "Автобус", 4, 80000,"пансионат");
        Tour tour4 = new Tour(4, 12, "Автобус", 1, 90000,"завтрак");
        Tour tour5 = new Tour(5, 13, "Самолет", 5, 130000,"полупансионат");
        Tour tour6 = new Tour(6, 19, "Автобус", 3, 110000,"полупансионат");
        Tour tour7 = new Tour(7, 6, "Автобус", 4, 150000,"полупансионат");
        Tour tour8 = new Tour(8, 7, "Самолет", 5, 150000,"завтрак");
        Tour tour9 = new Tour(9, 9, "Самолет", 3, 140000,"пансионат");
        Tour tour10 = new Tour(10, 12, "Самолет", 2, 190000,"пансионат");

        tour1.addCountry("Италия");
        tour2.addCountry("Франция");
        tour3.addCountry("Грузия");
        tour3.addCountry("Армения"); // было две страны в одной ячейке, потому сделали две (tour3)
        tour4.addCountry("Армения");
        tour5.addCountry("Турция");
        tour6.addCountry("Турция");
        tour7.addCountry("Италия");
        tour7.addCountry("Франция");
        tour8.addCountry("Италия");
        tour9.addCountry("Мальдивы");
        tour10.addCountry("Мальта");
        tour10.addCountry("Турция");
    }
}
