package Lexa10.interfaces;

public class Main1 {
    public static void main(String[] args) {

        FractionNumber fraction1 = new FractionNumber(1,5);
        FractionNumber fraction2 = new FractionNumber(3,5);

        FractionNumberOperations calculator = new FractionNumberOperations();
        FractionNumber resultAdd = calculator.add(fraction1, fraction2);
        System.out.println(resultAdd);

    }
}
