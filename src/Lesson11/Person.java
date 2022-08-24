package Lesson11;

public class Person {
    private String name;
    private int age;

    public Person() { // создали пустой конструктор
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public boolean equals (Person person){ // переопределяем метод equals, поскольку он сравнивает ссылки, а нам нужно сравнивать содержимое
//        return this.name.equals(person.name); // (return this.name) - возвращаем сравнение данного имени с текущим объектом, который вызывает сравнение
//        // (person.name) - имя того, что нам приходит в параметрах.
//        // ДАННЫЙ МЕТОД ТЕПЕРЬ СРАНИВАЕТ ИМЕНА!
//    } 1:22:00 влад удалил эти строки, чтобы вызвать метод через Дженерейт


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() { // никаких пар-ов не принимает, возвращает только ИНТ
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result; // его задача - СОБРАТЬ (ВЫДАТЬ) УНИКАЛЬНОЕ ЦЕЛОЧИСЛЕННОЕ (?) ЗНАЧЕНИЕ!!!
    }
    // вызвали через Дженерейт, но вникать особо не нужно, потому что ничего настраивать не нужно, система сама настроила



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String test(){
        return "OK";
    }
}
