package Lesson13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main1 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashset = new LinkedHashSet<>();

        hashset.add("Pupka");
        hashset.add("Salut");
        hashset.add("Привет");
        hashset.add("Aloha");
        hashset.add("Привет");
        hashset.add("Bazuka");

        for(Iterator<String> iterator = hashset.iterator(); iterator.hasNext();){
            System.out.print(iterator.next( ) + " ");
        }
    }
}
