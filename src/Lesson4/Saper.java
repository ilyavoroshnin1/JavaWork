package Lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {
    public static void main(String[] args) {

        System.out.println(" Выберите уровень игры");
        System.out.println(" 1 - новичок");
        System.out.println(" 2 - любитель");
        System.out.println(" 3 - профессионал");
        System.out.println(" 4 - особый");

        Scanner scanner = new Scanner(System.in); // 1)используем типа "Scanner", "System.in" - клавиатура!
        String level = scanner.nextLine(); // "String" - представляем, что пользователь вводит желаемый уровень игры словами!
        // "scanner.nextLine()" обозначает, что у scanner через точку достаем тип nextLine()

        // 2) далее идет развилка кода, состоящая из 4-х вариантов. по идее, нужно писать 4 раза "IF {} ELSE"
        // у нас в условиях стоит " 1 - новичок", " 2 - любитель" и т.д. В примитивных методах можно сравнить просто за счет оператора "==" (i == j)
        // в ссылочных методах, который тут используется, нужно проводить сравнение с помощью метода "equals", который есть во всех ссылочных типах
        // "equals" сравнивает 2 объекта и говорит - они равны или нет!

        int[][] fields = null;// 14) необходимо порой выносить переменные за скобки циклов, чтобы эти переменные были видны другим формулам/циклам
        // изначально формула была такая и ниже \int fields = new int[9][9]/, но вынесли выше  \int[][] fields/ для того, чтобы "fields" стала доступна другим циклам
        // 17) т.к. значения у "fields" могут быть разными, ибо непонятно - сколько выберет столбиков и линий игрок, потому сейчас присваивается значения " null" - пустота. Получается стартовая точка \int[][] fields = null;/ только ссылочные типы могут ссылаться на "null" пустоту!

        if (level.equals("1") || level.equalsIgnoreCase("новичек")) { // 3) формула читается: правда ли, что уровень иквел 1 равен уровню иквалигнор новичек?
            // после знака "|| - или" использовали \"equalsIgnoreCase"/ потому, что этот метод не смотрит на регист (с заглавной или маленькой буквы надпись), иначе если бы человек ввел не с той буквы как в условии, была бы ошибка
            // 4) если представим, что мина обозначает "-1", тогда число должно показывать - сколько мин рядом с выьранным местом, наш двухмерный массив - числовой!
            // 5) создаем двухмерный массив \ int [][] fields (поля) = new int [9][9] /, поскольку пользователь выбрал новичка. НУЖНО РАССТАВИТЬ 10 МИН
            // 6) как расставить мины рандомно? у каждой рандомной мины два индекса - строчка и столбик! чтобы найти формулу генерации, нужно забить в гугле \ java get random number is range или random number search range/ - искать формулу рандомного поиска!!! ответ только на сайте STACKOVERFLOW

            fields = new int[9][9]; // размеры поля для новичка.


            for (int mine = 0; mine < 10; mine++) { //13) потому создается цикл FOR и создает переменную \mine - мина/

                // 7) на сайте STACKOVERFLOW найдена подходящая формула \int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1)/ (целое нардомное число = какой-то файл "ThreadLocalRandom"(потому что с большой буквы) вызывающий метод под названием "current()". что он возвращает - без понятия, но вызывается след метод "nextInt" (следующее целое число), в параметрах которого "(min, max + 1)" - минимальное число ( у нас это 0) и максимальное число ( у нас это 8, ибо отсчет идет от нуля)
                // 7.1) \int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1)/ рождает одно рандомное число!
                // 8) на основе данной формулы делаем формулы поиска значений столбика и строчки
                int randomRowIndex = ThreadLocalRandom.current().nextInt(9); //9) строка: при написании \ThreadLocalRandom/ на него обязательно нужно дважды кликнуть, тогда сверху подтянется импорт \import java.util.concurrent.ThreadLocalRandom;/ вызываем метод \current()/.  Далее вызываем \nextInt/, на который если навести, то будет дано описание. Берем описание и проверяем через переводчик, в котором сказано, что данный метод \nextInt (int origin, int bound) работает "от нуля (включительно) до указанного числа (исключительно). У нас граница 0-8, значит нужно ставить 9
                int randomColIndex = ThreadLocalRandom.current().nextInt(9); // 10) копируем строчку и вставляем ниже для числа колонки! в скобках оставляем значение 9, поскольку колонки тоже 0-8
                fields[randomRowIndex][randomColIndex] = -1; // 11) делаем обозначение для бомбочки, поскольку ранее обозначали, что звездочка будет "-1". После ранее \fields/ обозначался как массив с двумя переменными в [][], то вставляем значения в скобки \randomRowIndex - поиск случайного числа для строки/ и \randomColIndex - поиск случайного числа для столбика/
                // 12) три строки выше - формула одной бомбочки! всего нам нужно 10 бомбочки. и тут можно либо 10 раз циклить данный код(?), либо зациклить их циклом.

            }
        }
        if (level.equals("2") || level.equalsIgnoreCase("любитель")) {
            fields = new int[16][16];

            for (int mine = 0; mine < 40; mine++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
                int randomColIndex = ThreadLocalRandom.current().nextInt(16);
                fields[randomRowIndex][randomColIndex] = -1;

            }
        }

        if (level.equals("3") || level.equalsIgnoreCase("профессионал")) {
            fields = new int[16][30];

            for (int mine = 0; mine < 99; mine++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
                int randomColIndex = ThreadLocalRandom.current().nextInt(30);
                fields[randomRowIndex][randomColIndex] = -1;

            }
        }
        int needMines = 0; // взято у Антона
        if (level.equals("4") || level.equalsIgnoreCase("особый")) {
            System.out.println("Введите кол-во столбиков");
            Scanner stolbiki = new Scanner(System.in);
            int x = stolbiki.nextInt();

            System.out.println("Введите кол-во строчек");
            Scanner strochki = new Scanner(System.in);
            int y = strochki.nextInt();

            System.out.println("Введите кол-во мин");
            Scanner mines = new Scanner(System.in);
            int minesForSpecial = mines.nextInt();
            fields = new int[x][y];
            do {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(x);
                int randomColIndex = ThreadLocalRandom.current().nextInt(y);
                if (fields[randomRowIndex][randomColIndex] != -1) {
                    fields[randomRowIndex][randomColIndex] = -1;
                    needMines++;
                }
            } while (needMines < minesForSpecial); // взято у Антона
        }


        // 15) печатаем минное поле, Наталья заранее нам показала формулу. теперь здесь есть доступ к \fields/!
        // будет цикл в цикле, чтобы генерировать индексы строк и столбиков
        for (int i = 0; i < fields.length; i++) { // 16) здесь переменная "fields" выделается красным, потому что выше в формуле \ int[][] fields/ у fields нет значений. Потому идем выше и присваиваем значения
            for (int j = 0; j < fields[i].length; j++) {
                // 18) начинаем печатать варианты заполнения ячеек
                if (fields[i][j] == -1) { // 19) если в текущей ячейке мина, обозначаем звездочкой с пробелами
                    System.out.print(" * ");
                } else { /// 20) если нет мины, оставляем либо пустое место, либо тире
                    System.out.print(" _ ");
                }
            }
            System.out.println(); // 21) здесь делаем переход на новую строку. Потому что цикл выше прорабатывал на наличие мины целую строчку, потому писали "print"


        }

    }
}

