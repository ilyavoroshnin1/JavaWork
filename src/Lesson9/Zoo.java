package Lesson9;

public class Zoo {
    public static void main(String[] args) {

        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        //поместить всех животных в один массив
        // помещаем в массив для того, чтобы пройтись по любому кол-ву животных и вызвать у всех метод "voice / голос",
        // когда нет единой ссылки у разных переменных, их можно объединить в "OBJECT", но при этом методы будут обрезаны! 1:22:00

        Animal[] animals = new Animal[4];
        animals[0] = tiger1;
        animals[1] = tiger2;
        animals[2] = monkey1;
        animals[3] = monkey2;

        for (Animal animal : animals) { //сокращенным циклом
            animal.run(); // полиморфизм - свойство Java работать с разными типами как с одним и тем же (1^32^00)
            // при этом выполнение прогр-мы будет разное, как будто с разными типами

        }
    }
}
