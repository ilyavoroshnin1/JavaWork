package Lesson13;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> texts = new LinkedList<>();
        texts.add("Привет ");
        texts.add("Как дела ");
        texts.add("Нормально ");
        texts.add("Хочу есть ");
        texts.add(2,"Pupka ");
        System.out.println(texts);
    }
}
