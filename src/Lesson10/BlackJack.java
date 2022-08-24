package Lesson10;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {

    private Koloda koloda = new Koloda(); // добавляем колоду при создании игры, обязательно private
    // при этом колода не добавляется в игру. нужен доп метод по добавлению колоды

    private ArrayList<Player> players = new ArrayList<>(); // создаем коллекцию по добавлению игроков, чтобы они тут хранились!
    // это нужно для конструктора "public void addPlayerToGame(Player player)"

    @Override
    public void addPlayerToGame(Player player) { // реализация макс-го кол-ва мест
        if (players.size() < 9) { // создаем ограничения по добавлению игроков за стол
            players.add(player); // players - коллекция, где хранятся игроки; ".add"-метод по добавлению; (player)-добавление игрока
        } else {
            System.out.println("Нет свободных мест");
        }
    }

    @Override
    public void dealTwoCardsToAllPlayers() { //раздать 2 карты
        for (Player p : players) { // раздать карты нужно всем, потому происходит проход циклом FOR EACH по всем игрокам
            // "players" - коллекция, по которой проходимся; "Player" - тип, который хранится внутри; "p"-просто название текущему игроку внутри метода
            p.addCardToHand(koloda.getRandomCard()); // "addCardToHand"-метод по добавлению одной карты, созданный ранее в классе PLAYER
            // "koloda" - у нас есть колода, созданная выше, из неё будет браться карта; "getRandomCard()" - берется рандомная карта

            p.addCardToHand(koloda.getRandomCard()); // наталья просто сделала метод по добавлению 1 карты и добавила его два раза
        }
    }

    @Override
    public void dealRestCardsToAllPlayers() { // дораздаем всем игрокам карты
        for (Player p : players) { // вновь цикл FOR EACH, потому что будем проходиться циклом по всем игрокам (Player p: players)!
            while (p.needsCard()) { // используется метод "while", потому что "игроку предлагается карта, ПОКА он не скажет ДОСТАТОЧНО"
                // "p.needsCard()" - пока игроку "р" нужна еще одна карта (needsCard - буленовский метод, расписан ранее)
                p.addCardToHand(koloda.getRandomCard()); // игроку будет добавляться по одной карте!!!
            }
        }
    }

    @Override
    public void printWinner() {
        // какие могут быть расклады
        // 12   17   21   15   19
        // 25   27   28   30   32 - у всех перебор (ВЫЙГРАЛ КРУПЬЕ)
        // 21   23   21   18   19 - выйграло двое
        // 20   20   19   18   19 - максимально близко к победе несколько игроков
        // сверва лучше вычеркивать перебравших карты

        // 12 УРОК. НАЧАЛО.
        // переходим в класс "Player" для того, чтобы создать доп поле внутри класса на тему - может он еще выйграть?

        // проходимся фор по всем игрока
        for (Player p : players) {
            if (p.valuesHand() > 21) {
                p.setCanWin(false); // если на руках больше 21, игрок не может участвовать на победу
            }
        }

        // далее пишем метод, по которому если перебор у всех игроков, нужно найти крупье и пишем, что он победитель 0:17:00
        if (countPlayersWhoCanWin() == 0){ // у всех игроков перебор
            for (Player p : players) {
                if (p instanceof Dealer){
                    System.out.println("Победил крупье!");
                    p.openHand();
                    return;
                }
            }
        }
        // находим балл победителя . МЕТОД ПОДБОРА ПО НАХОЖДЕНИЮ МАКСИМАЛЬНОГО ЗНАЧЕНИЯ
        // 12   17   21   15   19
        int valueWinner = 0; //21
        for (Player p : players) {
            if (p.isCanWin() && p.valuesHand() > valueWinner){ //p.isCanWin() - проверка в игре ли текущий игрок   //p.valuesHand() > valueWinner - у текущего игрока очки больше, чем сохранено в valueWinner
                valueWinner = p.valuesHand();
            }
        }

        // ПОСЛЕ НАХОЖДЕНИЯ МАКСИМАЛЬНГОГО БАЛЛА, НАХОДИМ ИГРОКОВ, У КОТОРЫХ СТОЛЬКО ОЧКОВ НА РУКАХ!!! 23:50:00
        for (Player p : players) {
            if (p.valuesHand() == valueWinner){ // если у текущего игрока кол-во очков (p.valuesHand()) совпало с valueWinner (макс кол-во очков, ПОБЕДИТЕЛЬ)
                System.out.println("ПОБЕДИТЕЛЬ!!! - " + p.getName());
                p.openHand();
            }
        }

    }

    // сколько игроков осталось в игре, пишем отдельный метод
    public int countPlayersWhoCanWin() {
        int count = 0;
            for (Player p : players) {
                if (p.isCanWin()) {
                    count++;
            }
        }
        return count;
    }
}

