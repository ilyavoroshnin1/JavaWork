package Lesson11;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("Иван", 25);
        Person person1 = new Person("Елена", 25);
        System.out.println(person.equals(person1));
        System.out.println(person1);

        System.out.println();

        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());

    }
    private void Primer (){ // Я ВЫНЕС ОТДЕЛЬНО, Т.К. ВЛАД УДАЛИЛ
        String s = "Hello"; // стринг единственный объект, который можно создать без оператора NEW, а сразу присвоить ему строку
        String s1 = "Hello"; // s=s1 по содержимому! в джаве созд ячейка с данным содержимым, потому s=s1
        String s2 = new String("Hello"); // создается НОВЫЙ ОБЪЕКТ, потому сравнивать его с другими будет фолс
        System.out.println(s1 == s); // когда мы сравнивали "person.equals(person1)" в станд режиме, было фолс равенство, а s == s1 показало тру.
        // s!=s2 и s1!=s2 потому, что при создании s2 создается новый объект(ссылка), потому они не равны!
    }
}
