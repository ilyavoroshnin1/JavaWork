package Lesson10;

public class Dealer extends Player { // чтобы дилер сел за стол И КАК ИГРОК!

    @Override
    public boolean needsCard() { // пишем отдельный метод для крупье
        if (valuesHand() < 17){ // valuesHand - метод по подсчету веса карт в руке. если вес < 17, возвращается правда
            return true;
        }
        return false;
    }
}
