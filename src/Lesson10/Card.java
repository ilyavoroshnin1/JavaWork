package Lesson10;

public class Card {

    private String name; // например валет трефа
    private int value; // сколько весит? все картинки по 10, туз 11, цифры согласно номиналу

    public Card() { // делаем сперва пустой конструктор
    }

    public Card(String name, int value) { // обычный констр с 2мя пар-ми
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    } // геттеры и сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() { // вес карты
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
