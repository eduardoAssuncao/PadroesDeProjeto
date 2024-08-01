package br.gov.ma.tce.observerQuestao2;

public class Main {
    public static void main(String[] args) {
        BingoSystem bingoSystem = BingoSystem.getInstance();

        int numberOfSlots = 6;
        int maxNumber = 50;

        BingoCard card1 = new BingoCard(bingoSystem, 1, numberOfSlots, maxNumber);
        BingoCard card2 = new BingoCard(bingoSystem, 2, numberOfSlots, maxNumber);
        BingoCard card3 = new BingoCard(bingoSystem, 3, numberOfSlots, maxNumber);
        BingoCard card4 = new BingoCard(bingoSystem, 4, numberOfSlots, maxNumber);
        BingoCard card5 = new BingoCard(bingoSystem, 5, numberOfSlots, maxNumber);

        bingoSystem.subscribe(card1);
        bingoSystem.subscribe(card2);
        bingoSystem.subscribe(card3);
        bingoSystem.subscribe(card4);
        bingoSystem.subscribe(card5);

        bingoSystem.startBingo(maxNumber);
    }
}
