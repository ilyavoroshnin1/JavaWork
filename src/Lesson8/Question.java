package Lesson8;

public class Question {
    // из чего состоит вопрос:
    private String question; // он состоит из вопроса, который в стринге, потому что надпись

    // но непонятно из чего состоит вариант ответа. может быть как надпись, так и цифра, и плюс еще boolean (правильный ответ или нет)
    // потому создается новый тип OPTION

    // далее прописывается кол-во вариантов ответа
    private Option[] options = new Option[10]; // Option[] - объявляется массив ответов, которые называются (options)
    // new Option[10] - 10 вариантов ответа максимум
    // баллы будут считаться внутри Option[]!!!
    // возвращаемся в TEST

    // генерируем пустой конструктор


    public Question() {
    }

    //теперь конструктор с одной стрингой только? 1:14:30

    public Question(String question) {
        this.question = question;
    }

    // далее ГЕТТЕРЫ и СЕТТЕРЫ

    public String getQuestion() { //возвращает(печатает) необходимый вопрос!
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    } // переходим в ТЕСТ


    // создаем привязку для МЕЙНА ответов к вопросу. есть массив ( private Option[] options = new Option[10];), сюда нужно добавить наши варианты ответов в МЕЙНЕ  1:29:00!!
    public void addOption(Option option) {      // входящими пар-ми добавляется один (option) - вариант ответа
        // предложенный вариант ответа нужно положить в первую свободную ячейку массива ( private Option[] options = new Option[10];)
        // потому создается цикл FOR
        for (int i = 0; i < options.length; i++) {
            if (options[i] == null) {      // ищем свобод ячейку.если своб яч равна нулл
                options[i] = option;       //тогда в свободную ячейку добавляется (option) - предложенный вариант ответа
                break; // прерывание цикла, чтобы предлож вариант не вложился во все ячейки
                // теперь переходим в МЕЙН
            }
        }
    }

    // 1:37:00 создаем более удобный метод, чтобы все варианты ответов писать через запятую
    public void addOption(Option... options) { // за счет многоточия появляется возможнолсть добавлять множенство перем-х входящих пар-ов
        // options -массив вход вариантов ответов, которые нужно добавить           1:38:00
        // this.options - массив вариантов, которые уже есть у теста
        for (int i = 0; i < options.length; i++) {
            this.addOption(options[i]); // (public void addOption(Option option)) добавили внутрь этого метода ??? 1:42:00

        }

    }
}
