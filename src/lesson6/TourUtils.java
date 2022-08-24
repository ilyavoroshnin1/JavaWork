package lesson6;

import java.util.Scanner;

public class TourUtils {

    public static int getAveragePriceByCountry(String[][] tours, String countryBy) { //узнаем среднюю стоимость тура, в котором есть нужная страна

        int allPriceByCountry = 0; // общая цена туров
        int countTours = 0;

        for (int i = 0; i < tours.length; i++) { // создается цикл для прохода по каждой строчке массива
            String countriesFromCurrentTour = tours[i][1]; // "i" - номер ячейки  ( countryesFromCurrentTour - страны из текущего тура)
            // на 1 сохранено название страны

            countriesFromCurrentTour = countriesFromCurrentTour.replace(",", " "); // 6 занятие, 1:01:00!!! ОЧень сложно
            // убрали запятиые между слов!!!

            // разбили на массив    // split - разрезать
            String[] countries = countriesFromCurrentTour.split(" "); // тут сделали массив стран?? за счет сплита разрещаем двойные названия на одинарные (Грузия, Армения заменяем на Грузия Армения!)

            //теперь нужно понять, содержится ли внутри массива страна, которую пользователь вбил?
            // проверяем наличие нужной страны в туре!
            if (TourUtils.findCountry(countries, countryBy)) { // происходит: ЕСЛИ ЕСТЬ ТАКАЯ-ТО СТРАНА СРЕДИ ЭТИХ СТРАН?! 1:19:40
                // если ДА, тогда нужно на (allPriceByCountry) НАРАСТИТЬ СТОИМОСТЬ ТУРА!
                // ("1", "Италия", "5 дней", "Самолет", "5 звезд", "120000", "полупансионат"). Стоитмость тура - 5я ячейка. Нужно "120000" из STRING преобразовать в INT!!!
                // нужна еще отдельная переменная для того, чтобы посчитать среднюю стоимость туров с этой страной. назвали (int countTours = 0)!!

                // считаем кол-во туров с такой страной
                countTours++;
                // наращиваем на переменную стоимости туров
                allPriceByCountry = allPriceByCountry + Integer.parseInt(tours[i][5]);
                // Integer.parseInt(tours[i][5] - значит стрингу распознать как инт! [i] - меняется, номер строчки, [5] - ячейка, где у всех хранятся данные о стоимости!
            }
        }
        return allPriceByCountry / countTours; // здесь возвращается следующее:
        // когда мы узнали (allPriceByCountry) - общую стоимость всех туров с необходимой нам страной
        // (countTours) - количество туров с нужной страной,
        // тогда чтобы выявить среднюю стоимость, нужно (allPriceByCountry / countTours) - общую стимость разделить на кол-во туров!!!
    } // дописать

    private static boolean findCountry(String[] countries, String countryBy) { //закрытый метод проверки наличия вбитой пользователем страны в
        // (getAveragePriceByCountry(String countryBy!!!)) в итоговом массиве по разбивке стран ( String[] countries !!! = countriesFromCurrentTour.split)
        // т.к. метод приватный, он виден ТОЛЬКО ВНУТРИ ЭТОГО КЛАССА

        // for each - для каждого, не важны индексы
        for (String c : countries) { // с правой стороны кладется массив, по которому нужно пройтись
            // с левой стороны указывается 2 слова: первое обозначает тип, который лежит внутри правого массива (countries),
            // второе - назание того, что доставли из массива (с). ОБЫЧНО НАЗЫВАЮТ ПЕРВОЙ БУКВОЙ НАЗВАНИЯ МАССИВА
            // второе - ТО, ЧТО ИСПОЛЬЩУЕТСЯ В ТЕЛЕ МАССИВА!!! ВСЕ СТРАНЫ В (countries) ПООЧЕРЕДНО СТАНУТ (String c)!!
            // если в (countries) 5 туров, то (c) станет каждый тур, и цикл проработает 5 раз

            // если (c) станет каждый тур, значит (c) должно сравняться с (String countryBy)
            if (countryBy.equals(c)) { // если (countryBy), КОТОРУЮ МЫ ИЩЕМ, хоть раз совпало с (c) ТЕКУЩИМ ТУРОМ, тогда возвращается (true), потому что используется метод (boolean)
                return true; // (equals) - метод равенства двух стринговых перем-ых
            }
        }
        return false; // если не будет ниодного совпадения, тогда будет (return false)!
    }

    public static void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            String countries = tours[i][1]; // взяли все туры
            countries = countries.replace(",", ""); // убрали запятую
            String[] countrs = countries.split(" "); // разбили на массив
            if (TourUtils.findCountry(countrs, country)) { // передали созданному ранее (TourUtils.findCountry) - содержится или не содержится нужная страна?
                TourUtils.printTour(tours, i); // если содержится, нужно её напечатать
            }
        }
    }

    private static void printTour(String[][] tours, int i) { // т.к. туры будут часто выводиться, нужно вынести в отдельный метод
        // нужно передать массив туров и порядковый номер тура (String[][] tours, int i)

        System.out.printf(" Тур: %s, за %s рублей, %s, на %s ночей, %s, %s \n", //printf - отформатированный вывод, не переходит на новую строку, потому (/n)
                tours[i][1], tours[i][5], tours[i][4], tours[i][2], tours[i][6], tours[i][3]);
        // (%s) - название страны, (tours [i][1],) - подбор страны
        // (%s) - на второй строчке хоть это и пишем, но стоимость тоже переведена в текст! (tours [i][5]) - подбор стоимости
    }

    public static int averageCostOfTours(String[][] tours) {

        int allPrice = 0;
        int countTours = 0;
        for (int i = 0; i < tours.length; i++) {
            countTours++;
            allPrice = allPrice + Integer.parseInt(tours[i][5]);
        }
        return allPrice / countTours;
    }

    public static void priseToursFromAndTo(String[][] tours) {
        System.out.println("Введите стоимость от: ");
        Scanner scanner1 = new Scanner(System.in);
        int priceFrom = scanner1.nextInt();

        System.out.println("Введите стоимость до:");
        Scanner scanner2 = new Scanner(System.in);
        int priceTo = scanner2.nextInt();

        for (int i = 0; i < tours.length; i++) {

            if (Integer.parseInt(tours[i][5]) <= priceTo && Integer.parseInt(tours[i][5]) >= priceFrom) { // т.к. у нас происходит интовое сравнение в УСЛОВИЕ ИФ,
                // необходимо РАСПАРСИТЬ стринговые цены из общего массива - перевести из STRING в INT!!!

                printTour(tours, i); // ранее мы уже создали метод по напечатанию туров
                // в IF мы написали условия отбора туров, в (printTour(tours, i)) мы задаем печать выбранных туров!
            }
        }
    }

    public static void toursByDurationAndCountry(String[][] tours) {
        System.out.println("Введите длительность пребывания: ");
        Scanner scanner1 = new Scanner(System.in);
        int durationOfLocation = scanner1.nextInt();

        System.out.println("Введите страну пребывания: ");
        Scanner scanner2 = new Scanner(System.in);
        String country = scanner2.nextLine();

        for (int i = 0; i < tours.length; i++) {
            String tempCountry = tours[i][1];
            tempCountry = tempCountry.replace(",", "");
            String[] countries = tempCountry.split(" ");
            if (TourUtils.findCountry(countries, country)) { //проверяем - есть ли введенная страна
                String tempDuration = tours[i][2]; // взял из метода (printToursByCountry) для разбивки (10 дней) на (10) и (дней) - иначе не работает
                tempDuration = tempDuration.replace(" дней", "");
                if (durationOfLocation >= Integer.parseInt(tempDuration) - 2 && durationOfLocation <= Integer.parseInt(tempDuration) + 2) {
                    printTour(tours, i);
                }
            }
        }
    }

    public static void profitableTours(String[][] tours) {
        for (int i = 0; i < tours.length; i++) {
            String tempDuration = tours[i][2];
            tempDuration = tempDuration.replace(" дней", "");
            int days = Integer.parseInt(tempDuration);
            if ((Integer.parseInt(tours[i][5]) / days) < 10000) {
                printTour(tours, i);
            }
        }
    }
}



