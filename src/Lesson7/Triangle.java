package Lesson7;

public class Triangle {
    private int a;
    private int b;
    private int c;

    // КОНСТРУКТОР! - создается только после слова NEW и только при создании объекта! (больше нигде), чтобы быстро и удонбо создавать объекты
    //формула создания конструктора

    /**
     * 1 - модификатор доступа; всегда почти PUBLIC, чтобы пользоваться в других типах(классах)
     * 2 - название класса (это и есть название конструктора);
     * 3 - входящие параметры
     * возвращаемого типа нет!
     * внутри одного типа конструктр создается по одному типу, отличаются только входящими пар-ми!
     */
    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        // a - 7
        // this.a - программисты любят писать принимаемую во входящих пар-ах название такое же, как и в методе! т.е. наверху уже создан (private int a),
        // и во вход пар-ах тоже (int a). Потому, чтобы система не зациклилась, (private int a) дается название (this.a)! ТОгда система работает
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int perimetr() {
        return a + b + c; // nе обязательно писать this
    }
}