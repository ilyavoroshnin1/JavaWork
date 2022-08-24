package Lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        LinkedList<String> linkedlist = new LinkedList<>();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arraylist.add("Pupka" + i);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("Метод выполнения ArrayAdd " + (endtime - starttime));

        long starttime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedlist.add("Pupka" + i);
        }
        long endtime1 = System.currentTimeMillis();
        System.out.println("Метод выполнения linkedlistAdd " + (endtime1 - starttime1));


        System.out.println();






        long starttime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arraylist.get(i);
        }
        long endtime2 = System.currentTimeMillis();
        System.out.println("Метод выполнения ArrayGet " + (endtime2 - starttime2));

        long starttime3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedlist.get(i);
        }
        long endtime3 = System.currentTimeMillis();
        System.out.println("Метод выполнения linkedGet " + (endtime3 - starttime3));
    }
}
