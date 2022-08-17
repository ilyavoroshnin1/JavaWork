package Lex14;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();

        holodilnik.addProduct("Яблоко", 5);
        holodilnik.addProduct("Груша", 2);
        holodilnik.addProduct("Слива", 3);
        holodilnik.addProduct("Банан", 7);
        holodilnik.addProduct("Банан", 7);
        holodilnik.addProduct("Яблоко", 8);

        holodilnik.printAllProducts();
    }
}
