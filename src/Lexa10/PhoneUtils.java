package Lexa10;

import java.util.ArrayList;

public class PhoneUtils {
    public static void printAllPhonesByProduction(ArrayList<Phone> phones, String production){
        for (Phone p :phones) {
            if (p.getProizvoditel().equals(production)){
                System.out.println(p);
            }
        }
    }

    public static void printTheBiggestResolution(ArrayList<Phone> phones){
        Phone biggestPhone = phones.get(0);
        for (Phone p :phones){
            if (p.getDiagonal()>biggestPhone.getDiagonal()){
                biggestPhone = p;
            }
        }
        System.out.println(biggestPhone);
    }

    public static void printTheSmallestResolution(ArrayList<Phone> phones){
        Phone smallestPhone = phones.get(0);
        for (Phone p :phones){
            if (p.getDiagonal()<smallestPhone.getDiagonal()){
                smallestPhone = p;
            }
        }
        System.out.println(smallestPhone);
    }

    public static void print(ArrayList<Phone> phones){
        double summ = 0;
        for (Phone p :phones){
            summ = summ + p.getDiagonal();
        }
        System.out.println(summ / phones.size());
    }
}
