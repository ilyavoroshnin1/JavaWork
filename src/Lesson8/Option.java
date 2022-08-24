package Lesson8;

public class Option { // описываем поля класса, что относится к одному варианта ответа!!
    private String option; // текст ответа
    private boolean isCorrect = false; // проверка на правдив ли ответ. изначально делаем ответы неправильным
    private double point = 0;  // считываем, сколько баллов принес этот вариант ответа. пока по умолчанию 0

    // возвращаемся в question


    //1:10:00 - когда стали определены все типы, нужно для каждого создавать конструктор и методы GET и SET
    // начинаем с самого простого и начинаем писать конструктор.
    // правой конпкой мыши - generate - constructor - Lesson8...
    public Option() { // СПЕРВА СОЗДАЕТСЯ ПУСТОЙ КОНСТРУКТОР!!!
    }

    public Option(String option, double point) { // создаем конструктор, при котором указывается вариант и бал, при том, что по умолчанию стоит "false"
        this.option = option;  // генерируем с двумя входящими пар-ми
        this.point = point;
    }

    // создаем SET и GET: прав.кн.мш - generate - Getter and Setter - выбираем все поля и ОК!
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public boolean isCorrect() { // когда boolean, то вместо (GET) пишется (IS)!!!
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    // теперь класс готов. переходим в QUESTION
}
