package Lesson2;

public class MM {
    public static void main(String[] args) {
        int money = 1200;
        int pizzaPrice = 230;
        int bubbleGumPrice = 26;
        double candyPrice = 2.5;

        int pizza = money / pizzaPrice; //количество пицц
        int rest1 = money % pizzaPrice; //сдача с пиццы

        int bubbleGum = rest1 / bubbleGumPrice; //количество жвачек
        int rest2 = rest1 % bubbleGumPrice; //сдача с жвачек

        double rest3 = rest2 % candyPrice; // сдача с конфет
        int candy = (int) (rest2 / candyPrice); // количество конфет

        System.out.println("На " + money + "р. мы можем купить:" + "\n" + pizza + " пиццы" + "\n" + bubbleGum + " жвачек" + "\n" + candy + " конфет" + "\n" + "сдача: " + rest3 + "р.");

    }
}
