package Lesson7.Tours;

public class Tour {
    private int id;
    private String[] countries = new String[15]; // стран может быть несколько в туре, потому нужен массив стран 1:40:00!!! объявляем массив!
    private int days; // кол-во дней лучше написать в инте
    private String typeOfTransport;
    private int stars; // кол-во звезд тоже лучше в инте
    private int price; // как и цена
    private String service;

    // когда мы хотим написать конструктор с вход. пар-ми, нужно сперва написать пустой! это для того, чтобы он автоматически перестал генерироваться!!!
    public Tour() {
    }
    // если не будет пустого, тогда невозможно будет создать дочерние (которые с параметрами)

    // далее создаем уже с входящими параметрами!
    public Tour(int id, int days, String typeOfTransport, int stars, int price, String service) {
        this.id = id;
        this.days = days;
        this.typeOfTransport = typeOfTransport;
        this.stars = stars;
        this.price = price;
        this.service = service;
    }

    // добавление страны расписали отдельно, потому что добавлять массив в конструктор неудобно!
    public void addCountry(String country) {
        // цель - добавить в массив по странам в ПЕРВУЮ СВОБОДНУЮ ЯЧЕЙКУ

        for (int i = 0; i < countries.length; i++) { // цикл нужен для того, чтобы добавленная страна в tour1.addCountry("Италия"); пошла на свободную ячейку!
            if (countries[i] == null) { // если в текущей ячейке пусто!
                countries[i] = country; // тогда в неё добавляется страна!
                break; // нужно прерывать цикл, иначе на все свободные ячейки тоже будет добавляться "Италия"
                // взяли именно (break) потому, что он останавливает только цикл (for). return остановил бы весь метод
            }
        }
    }
    /**
     * на все поля сделать методы SET - устанавливает значение поля
     * на все поля сделать методы GET - вернуть значение поля
     */


}