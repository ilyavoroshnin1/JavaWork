package Lesson14;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C://Java//ip.txt");
            int i;
            String result = "";
            while ((i = fin.read()) != -1) {    // (i = fin.read()) - на переменную "i" сохраняется "fin.read()" - то, что приходит
//                System.out.println(i);  // "int i" кастовали/преобразовали в ((char) i). были цифры, стали буквы
                if (i == 13) continue;
                 else if (i == 10) {
                    String ip = result.split(":")[0];
                    int port = Integer.parseInt(result.split(":")[1]); // а это ПРЕОБРАЗОВАНИЕ

                    Thread thread = new Thread(new Runnable() { // создаем многопоточность за счет создания АНОНИМНОГО КЛАССА
                        @Override
                        public void run() {
                            checkProxy(ip, port);
                        }
                    });
                    thread.start();
                    result = "";
                }
                else if (i == 9) {
                    result += ":";
                }else {
                    result += (char) i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkProxy(String ip, int port) {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php"); // создаем объект "URL" и через конструктор подключаемся к сайту
            URLConnection connection = url.openConnection(proxy); // через объект " URLConnection" у переменной "url" вызываем метод ".openConnection()", который создаст соединение с сайтоми и положит данные в перем-ю "connection"
            // получили информацию из инета, теперь её нужно ПРОЧИТАТЬ!
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            // "connection.getInputStream()" - получаем поток информации из сайта в "сыром" виде, как при написании scanner в скобках был "system.in"
            //  далее инфа идет в "new InputStreamReader" и "new BufferedReader"
            System.out.println("ip: " + ip + " port: " + port + " - РАБОТАЕТ! ");
            in.close();
        } catch (Exception e) {
            System.out.println("ip: " + ip + " port: " + port + " - НЕ РАБОТАЕТ!!! ");
        }
    }


//    public static void main(String[] args) {
//        String text = "Hello Pupka";
//        try {
//            FileOutputStream fos = new FileOutputStream("C://Java//test.txt", true);
//            byte[] buffer = text.getBytes();
//            fos.write(buffer, 0, buffer.length);
//            System.out.println("Файл записан ");
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}
