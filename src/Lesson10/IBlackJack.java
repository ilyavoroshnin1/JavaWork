package Lesson10;

public interface IBlackJack {

    void addPlayerToGame(Player player);// нужен метод присоединения игрока
    // входящие пар-мы есть, потому что есть конкретный игрок, которого нужно добавить!

    void dealTwoCardsToAllPlayers(); // далее игра раздает по 2 карты игрокам и дилеру

    void dealRestCardsToAllPlayers(); // дораздать игрокам карты

    void printWinner(); // после раздачи карт определяется победитель

}
