package lesson7.blackJack;

import java.util.ArrayList;

public class BlackJack {
    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();

    public BlackJack() {
        koloda.prepared();
    }

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers() {
        for (Player player : players) {//прошлись по всем игрокам и крупье
            player.addCardToHand(koloda.randomCard());//дали первую карту
            player.addCardToHand(koloda.randomCard());//дали вторую карту
        }
    }

    public void dealRestCardsToAllPlayers() {
        for (Player player : players) {//прошлись по всем игрокам и крупье
            while (player.doYouNeedMoreCards()) {//проявление полиморфизма
                player.addCardToHand(koloda.randomCard());//дали первую карту
            }
        }
    }

    public void printWinner() {
        /** 13 13 22 12 10
         *
         */

        //ставим флажок false всем у кого перебор
        for (Player player : players) {
            if (player.countValuesInHand() > 21) {
                player.setCanWin(false);
            }
        }
        if (countPlayersWhoCanWins() == 0) {//если у всех перебор - находим крупье и печатаем его карты
            for (Player player : players) {
                if (player instanceof Dealer) {//является ли обьект экземпляром класса дилер
                    System.out.println("Выиграл: " + player.getName());
                    player.openHand();
                    return;//выходим из метода, дальше проверки безсмысленны, нашли победителя
                }
            }
        }

        int winerValue = 1;
        for (Player player : players) {//ищем максимальный бал к 21 и игрок в игре
            if (player.isCanWin() && player.countValuesInHand() > winerValue) {
                winerValue = player.countValuesInHand();
            }
        }

        for (Player player : players) {
            if (player.countValuesInHand() == winerValue) {
                System.out.println("Выиграл: " + player.getName());
                player.openHand();
            }
        }
    }

    public int countPlayersWhoCanWins() {
        int count = 0;
        for (Player player : players) {
            if (player.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}

