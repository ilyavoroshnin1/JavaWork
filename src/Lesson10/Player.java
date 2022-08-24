package Lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {

    private String name; // добавляем эту строку для того, чтобы в конструкторе "public void setName" работать с именами игроков
    private ArrayList<Card> hand = new ArrayList<>(); // называем "hand" - рука, карта в руке
    private boolean canWin = true; // МОЖЕТ ЛИ ИГРОК ЕЩЕ ВЫЙГРАТЬ ИЛИ НЕТ?

    public boolean isCanWin() { // ввели геттере и сеттеры, чтобы могли мы изменить тру/фолс
        return canWin; // ПРОВЕРКА - ТЕКУЩИЙ ИГРОК ЕЩЕ В ИГРЕ ИЛИ НЕТ?
    }
    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addCardToHand(Card card) { // создаем метод по добавлению карты в руку. для этого выше пишем коллекцию
       hand.add(card); // взяли название "hand" из выше написанной коллекции, через метод ".add(card)" добавили карту в руку
    }

    @Override
    public boolean needsCard() { // метод проверки - НУЖНА ЛИ ЕЩЕ КАРТА?
        this.openHand(); // выводит на консоль текущие карты
        System.out.println("Нужна ли еще одна карта?");
        Scanner scanner = new Scanner(System.in); // включаем сканер для возможности ввести пользователю ответ
        String answer = scanner.nextLine(); // введенный текстовый ответ, строка
        if (answer.equalsIgnoreCase("да")){ // (answer - ответ), (equalsIgnoreCase - метод равенства без учета регистра) под названием "да"
            return true;
        }
        return false; // любое другое, чтобы пользователь не написал, приведет к тому, что карта не нужна (бла бла, нахрен надо, нет, давай, пофиг ...)
    }

    @Override
    public void openHand() { // метод открытия карт
        System.out.println("---- ВАШИ КАРТЫ ----" + this.name); // "this.name" - имя текущего игрока, чтобы тоже отображалось
        for (Card c: hand){ //теперь нужно пройтись по всем картам, которые есть в руке "hand"
            System.out.println(c.getName()); // у текущей карты выводим только имя, без числового значения, через метод ранее созданный ".getName()"
     // чтобы пользователь самостоятельно считал кол-во очков
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    public int valuesHand(){ // метод по подсчету веса карт в руке!
        int values = 0; // берется вес в цикле ниже каждой карты и суммируется в переменной "int values"
        for (Card c: hand){ // проходимся циклом по всем картам в руке
            values = values + c.getValue(); //
        }
        return values;
    }
}
