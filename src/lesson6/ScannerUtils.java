package lesson6;

import java.util.Scanner;

public class ScannerUtils {

    public static String getInputCountry (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну поездки: ");
        String country = scanner.nextLine();
        return country;
    }
}
