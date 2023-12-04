package lesson7.blackJack;

public class Dealer extends Player {
    public boolean doYouNeedMoreCards() {
        if (countValuesInHand() < 17) {
            return true;
        }
        return false;
    }
}
