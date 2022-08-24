package Lesson9;

public class Tiger extends Animal {

    public void run() {
        System.out.println("Тигр бегает");
    }

    public void jump() {
        System.out.println("Тигр прыгает");
    }

    // переопределение метода - когда в родит классе метод работает не очень
    // в дочернем классе делается такой же метод, только с другим телом
    public void voice() {
        System.out.println("РРРРРРРРррррррррр");
    }
}
