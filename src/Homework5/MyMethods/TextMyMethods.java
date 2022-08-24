package Homework5.MyMethods;

public class TextMyMethods {
    // 2) Метод принимает входящими параметрами текст, печатает на консоль этот же текст, только в обратном порядке
    public static String reverseText(String str) {
        char[] text = str.toCharArray();
        String result = "";
        for (int i = text.length - 1; i >= 0; i--) {
            result = result + text[i];
        }
        return result;
    }

    // 1) Метод принимает входящими параметрами текст, и возвращает кол-во гласных букв в тексте
    public static void vowelLetters(String stringToProc) {
        //массив гласных
        char[] vocalArr = new char[]{'у', 'е', 'э', 'о', 'а', 'ы', 'я', 'и', 'ю'};
        //результат
        int counter = 0;
        //получаем массив
        char[] arrayToProc = stringToProc.toCharArray();
        //вложенный цикл
        for (char ch : arrayToProc) {
            for (char ch2 : vocalArr) {
                if (ch == ch2) {
                    counter++;
                }
            }
        }
        //вывод в консоль
        System.out.println("Количество гласных букв в тексте: " + counter);
    }

    //3) Метод принимает входящими параметрами текст, и печатает на консоль сколько в тексте знаков пунктуации
    public static void punctuation(String text) {
        char[] punctuatia = {'.', ',', '-', ':', ';', '?', '!'};
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < punctuatia.length; j++) {
                if (text.charAt(i) == punctuatia[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("В тексте " + count + " знака пунктуации");
    }

    // 4) В метод передаем кол-во строк и кол-во колонок, метод печатает на консоль квадрат из единичек по этим параметрам
    public static void squareFromUnit(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("1  ");
            }
            System.out.println();
        }
    }

    // 5) В метод передаем 3 числа, метод должен вернуть меньшее число из 3х
    public static int minNumber(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}