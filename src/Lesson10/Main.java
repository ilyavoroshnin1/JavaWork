package Lesson10;

public class Main { //сценарий, как все происходит
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack(); // сперва создаем партию игры, создаем ОБЪЕКТ
        Dealer dealer = new Dealer(); // создаем ОБЪЕКТ крупье, который раздаст карты

        Player player1 = new Player(); // создаем 1 игрока
        Player player2 = new Player(); // создаем 2 игрока
        player1.setName("Вася"); //создаем имена
        player2.setName("Петя");
        dealer.setName("Крупье");

        // далее 2 игрока и дилер садятся играть
        blackJack.addPlayerToGame(player1); // сел за стол 1 игрок
        blackJack.addPlayerToGame(player2);  // сел за стол 2 игрок
        blackJack.addPlayerToGame(dealer);  // ДИЛЕР НЕ МОЖЕТ СЕСТЬ ЗА СТОЛ! потому класс DEALER делается наследником PLAYER, а не на оборот. здесь дилер является игроком, а не игрок является дилером!

        // после нужно раздавать карты и начинать играть
        blackJack.dealTwoCardsToAllPlayers(); // раздали по 2 карты
        blackJack.dealRestCardsToAllPlayers(); // раздали все оставшиеся
        blackJack.printWinner();
    }
}
