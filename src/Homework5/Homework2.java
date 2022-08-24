package Homework5;

import Homework5.MyMethods.TextMyMethods;

public class Homework2 {
    public static void main(String[] args) {
        System.out.print("Задание 2. Текст в обратном порядке: ");
        System.out.println(TextMyMethods.reverseText("етигамаП !юаминоп ен огечин Я"));
        System.out.println();

        System.out.print ("Задание 5. Возврат наименьшего числа: ");
        System.out.println(TextMyMethods.minNumber(13, 543, 5));
        System.out.println();
//
        System.out.print ("Задание 3. Кол-во знаков пунктуации в тексте: ");
        TextMyMethods.punctuation("Привет, как дела? Да никак, хотя хз.");
        System.out.println();
//
        System.out.print("Задание 4. Квадрат из елиничек. Указать кол-во строк и столб.:");
        System.out.println(); TextMyMethods.squareFromUnit(10);
        System.out.println();

//
        System.out.print("Задание 1. Возврат кол-ва гласных:");
        TextMyMethods.vowelLetters("Физрук закончил первую брачную ночь словами: три, четыре, закончили!");
    }
}