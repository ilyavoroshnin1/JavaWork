package Lesson8;

import java.util.Scanner;

public class PrintUtils { // файл с методами по вводу и выводу вопросов

    public static void printQuestion(Question question) { // делаем метод вывода на консоль одного вопроса (в скобках нам передали вопрос)
        System.out.println(question.getQuestion()); //печатаем вопрос на консоль!
        Option[] options = question.getOptions(); //выводим массив вариантов! -  (question.getOptions()) - у введеного ранее вопроса варианты ответов
        for (int i = 0; i < options.length; i++) {
            if (options[i] != null) { //мы указали макс. 10 вар-ов ответов, потому нужно, чтобы выводились только те вар-ты, у которых есть текст!
                System.out.println("  " + (i + 1) + " - " + options[i].getOption()); // options[i] - у текущего варианта ответа берется "getOption()" - именно текст!
            } // (i + 1) - порядковый номер
        } // переходим в MAIN
    }

    public static int[] getAnswers() { // метод, что вбил пользователь // int[] - пользователь может забить несколько вариантов
        System.out.println("Выберите варианты ответов: ");
        Scanner scanner = new Scanner(System.in);

        String inputAnswer = scanner.nextLine(); // объявляем текстовый введенный ответ, было "1", "2", "3"
        String[] nums = inputAnswer.split(" "); // ответ может быть разно напечатан, потому мы разбиваем его на массив стрингов, разделяя по пробелу! стало ["1", "2", "3"]
        int[] result = new int[nums.length]; // переводим в ИНТЫ, теперь все выглядит [0, 0, 0]

        //проходимся циклом по любому массиву, выбрали стринги
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);// взяли текущую ячейку, распознали в инт и положили в result[i]
            // после этого int[] result станет не [0, 0, 0], а [1, 2, 3]
        }
        return result;
    }
}
