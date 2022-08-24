package Lesson5;

import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {

    public static void addMine(int[][] fields, int maxIndexRow, int maxIndexCol) { //метод добавления мины
        int randomRowIndex = ThreadLocalRandom.current().nextInt(maxIndexRow); // выбираем место в строке
        int randomColIndex = ThreadLocalRandom.current().nextInt(maxIndexCol);// выбираем место в столбике
        if (fields[randomRowIndex][randomColIndex] != -1) { // если в выбранном месте НЕТ (-1)
            fields[randomRowIndex][randomColIndex] = -1; // тогда мину добавляем, обозначаем МИНУ КАК (-1)

        } else { // в противном случае, если там МИНА ЕСТЬ, необходимо НАЧАТЬ ЗАНОВО искать место
            addMine(fields, maxIndexRow, maxIndexCol); // вызываем заново метод! мы находимся в том же файлике, потому SaperUtils писать не нужно.
            // метод (static), потому можно просто написать (addMine), и внутрь уже вставить входящие пар-ры
        }
    }
}
