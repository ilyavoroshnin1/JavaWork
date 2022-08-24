package Lesson15;

public class MultiThread { //МНОГОПОТОЧНОСТЬ
    // СУЩЕСТВУЕТ 3 МЕТОДА СОЗДАНИЯ МНОГОПОТОЧНОСТИ
    public static void main(String[] args) {

//        MyThread myThread1 = new MyThread("Мыть посуду");
//        MyThread myThread2 = new MyThread("Чесать жопу");
//        MyThread myThread3 = new MyThread("Поправлять незаметно яйца");
//        myThread1.start(); // ".start()" - метод по одновременному(многопоточному) запуску нескольких задач
//        myThread2.start();
//        myThread3.start();                                 \ПРИМЕР 1-ГО МЕТОДА/


//        Thread thread1 = new Thread( new MyRunnableClass("Мыть посуду")); // создаем новую перем-ую от класса "Thread"
//        // конструктор класса потока "Thread" требует, чтобы мы вкладывали (в скобки) разные пар-ры, но мы выбрали "Runnable target - ОБЪЕКТ, КОТОРЫЙ РЕАЛИЗУЕТ "Runnable"!!!!!!
//        Thread thread2 = new Thread( new MyRunnableClass("Чесать жопу"));
//        Thread thread3 = new Thread( new MyRunnableClass("Поправлять незаметно яйца"));
//        thread1.start(); // ".start()" - метод по одновременному(многопоточному) запуску нескольких задач
//        thread2.start();
//        thread3.start();                                    \ПРИМЕР 2-ГО МЕТОДА/


        // Нужно выполнить конкретную операцию в многопоточном режиме, но не делать для этого целый класс и создавать перем-ые
        // потому 3-й метод создания многопот-ти использует АНОНИМНЫЕ КЛАССЫ
        Thread thread1 = new Thread(new Runnable() { // в скобках РЕАЛИЗУЕМ ИНТЕРФЕЙС
            @Override
            public void run() {             // если перед нами стоит просто одна задача, внутри функции её прописываем
                for (int i = 0; i < 100; i++) {
                    System.out.println("Задание \"Мыть посуду\" " + " выполнено на " + i + "%");
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Задание \"Чесать жопу\" " + " выполнено на " + i + "%");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Задание \"Поправлять незаметно яйца\" " + " выполнено на " + i + "%");
                }
            }
        });

        thread1.start(); // запускаем многопоточность также через метод "start()"
        thread2.start();
        thread3.start();
    }
}






// 2) ИСПОЛЬЗУЕМ ИНТЕРФЕЙСЫ ДЛЯ НАСЛЕДОВАНИЯ ОТ РАЗНЫХ КЛАССОВ - имплементирование интерфейса "Runnable"
// имплементирование интерфейса "Runnable" нужно для какого нибудь класса, который уже наследовался от другого родительского, но ему
// также НУЖНА МНОГОПОТОЧНОСТЬ, которая создается за счет "RUN"
class MyRunnableClass implements Runnable {
    String task; // создаем доп поле

    public MyRunnableClass(String task) { // создаем конструктор
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Задание " + task + " выполнено на " + i + "%");
        }
    }
}







// 1) ПЕРЕОПРЕДЕЛЕНИЕ метода "run" или при "СОЗДАНИИ КЛАССА" - наследование от "Thread"
class MyThread extends Thread {
    String task; // дополнительно поле создаем сами, это НАЗВАНИЕ ЗАДАЧИ, которую даем компьютеру

    public MyThread(String task) { // создали конкструктор        "(String task)" - во вход пар-ры передается САМА задача (выше)
        this.task = task; // теперь эта задача из вх. пар. ПРИСВАИВАЕТСЯ конструктору
    }

    @Override
    public void run() { // переопределяем метод "run"
        for (int i = 0; i < 100; i++) {
            System.out.println("Задание " + task + " выполнено на " + i + "%");
        }
    }
}
