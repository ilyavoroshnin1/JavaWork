package Lesson3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main4 {
    public static void main(String[] args) {

        /**
         * нам пользователь задал пароль
         * нужно напечатать на консоль - подходит этот пароль или нет?
         * пароль пожходит, если:
         * - содержит более 8 символов
         * - содержит цифру
         * - содержит большую букву
         */

        // Создаем интерфейс, чтобы пользователь задавал пароль с консоли
        // тип scanner - может считывать информацию из папки, файла, и также с клавиатуры.

        Scanner scanner = new Scanner(System.in); //int a = 9; System.in - клавиатура!
        System.out.println("Введите пароль "); // перед вводом пароля необходимо пользователя попросить его ввести.
        String inputPassword = scanner.nextLine();  // String - популярный тип, кусок текста \\ "Сканер, достань строку, которую пользователь вбил scanner.nextLine()".  После полученное сохраняется на переменную "String inputPassword".


        char[] charsFromPassword = inputPassword.toCharArray(); // преобразование в массив чаров. но после inputPassword.toCharArray (Наталья взяла с сайта) будет написано в всплывшей табличке, что нужен в начале данной мини-формулы еще один чар.

        if (charsFromPassword.length < 8) { // начинаем писать условия, что если данный массив charsFromPassword.length < 8, то тогда на консоль должна высветиться надпись про облом
            System.out.println("Длина пароля меньше 8 символов");
            return; // остановка работы метода public static void main. Потому что пароль введен уже неправильный, дальше проверять нет смысла
        }


        // далее прописываем наличие цифры.
        // 1) берется цикл FOR, который сможет пройтись по всем ячейкам массива и проверить наличие цифры

        int countNumbers = 0; // 2) нужно посчитать кол-во цифр. для этого создается переменная int countNumbers (кол-во номеров).
        int upperCase = 0; // 5) создаем новую переменную для проверки прописной буквы
        for (int i = 0; i < charsFromPassword.length; i++) {
            if (charsFromPassword[i] == '0' || // 3/ если взятые символы имеют 0 чисел, тогда переходим в "или"
                    charsFromPassword[i] == '1' || // 4) каждый символ теперь в пароле разбит в массиве на ячейки. каждая ячейка теперь проверяется на число.
                    charsFromPassword[i] == '2' || // типа символ равен 0 ил 1 или 2 до 9? если нет, тогда цифр в пароле нет
                    charsFromPassword[i] == '3' || // и выйдет надпись, что цифр нет. если цифра есть, тогда проверка пароля пойдет дальше
                    charsFromPassword[i] == '4' ||
                    charsFromPassword[i] == '5' ||
                    charsFromPassword[i] == '6' ||
                    charsFromPassword[i] == '7' ||
                    charsFromPassword[i] == '8' ||
                    charsFromPassword[i] == '9') {
                countNumbers++;
            }
        }

        for (int i = 0; i < charsFromPassword.length; i++) {
            if (Character.isUpperCase(charsFromPassword[i])) {                  // 6) после проверки на числа проверяем пароль на прописную букву
                upperCase++;
            }
        }


        if (countNumbers == 0) {
            System.out.println("В пароле нет чисел"); // если нет чисел, проверка остановится и выйдет надпись
            return;
        } else if (upperCase == 0) {
            System.out.println("В пароле нет прописных букв");
            return;
        } else {
            System.out.println("Ваш пароль успешно принят!");
        }


    }

    //            for (int j = 0; i < charsFromPassword.length; j++) {
//                Character.isUpperCase(charsFromPassword[j]);
//                upperCase++;
//                if (upperCase == 0) {
//                    System.out.println(" Пароль не содержит прописную!");
//                    return;
//                } else if (upperCase >= 1) {
//
//                }


//        boolean b = Character.isUpperCase(charsFromPassword.length);
//        for (int i = 0; i < charsFromPassword.length; i++) {
//            if (charsFromPassword[i] == b){
//                i++;
//            }
//        }


//        int j = 0;
//        boolean b = Character.isUpperCase(charsFromPassword.length);
//        for (j = 0; j <= Character.isUpperCase(charsFromPassword.length); j++ ){
//
//        }
//
//        System.out.println(" Ваш пароль не содержит большую букву  "+b);


// далее прописываем Большую Букву в пароле
//        for (int j = 0; j <= Character.isUpperCase('A'); j++){
//            System.out.println(Character.isUpperCase('A'));


//    import java.util.Scanner;
//
//    public class HM5 {
//        public static void main(String[] args) {
//            try {
//                System.out.println("Введите пароль: ");
//                Scanner scanner = new Scanner(System.in);
//                String inputPassword = scanner.nextLine();
//                char[] charsFromPassword = inputPassword.toCharArray();
//                if (Character.isUpperCase('R'))
//                    System.out.println(" Пароль не содержит пропусную букву ");
//            } catch (Exception e) {
//                System.out.println("Invalid Input!!");
}












