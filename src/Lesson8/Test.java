package Lesson8;

public class Test {
    private String name; // имя теста

    // далее нужно сказать - из скольки вопросов состоит? вопрос с вариантами ответа - НЕ СТРИНГ! такого типа нет в джаве
    // ПОТОМУ ДЕЛАЕТСЯ НОВЫЙ ТИП!!! переходим в класс QUESTION

    //определяем, сколько вопросов может быть в тесте?
    private Question[] questions = new Question[50];

    //создаем пустой констр


    public Test() {
    }

    public Test(String name) { //только с именем, потому что неудобно передавать список вопросов??? 1:16:00(может уток другое время)
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
    // это были структурные методы, теперь создается MAIN

    // добавляем связку между тестом и первым вопросом
    public void addQuestion (Question question){ //далее проходимся циклом по всем (questions) вопросам
        for(int i = 0; i < questions.length; i++){
            if (questions[i] == null){
                questions[i] = question; //на свободную ячейку добавляется вопрос
                break;

    // переходим в МЕЙН для соединения теста и вопроса

            }
        }
    }
}
