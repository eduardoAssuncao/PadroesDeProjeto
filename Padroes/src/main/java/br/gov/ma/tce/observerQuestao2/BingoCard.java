package br.gov.ma.tce.observerQuestao2;

import java.util.Arrays;
import java.util.Random;

public class BingoCard implements Observer {

    private final int cardId;
    private final int [] numbers;
    private BingoSystem Subject;

    public BingoCard(BingoSystem subject, int cardId, int numberOfSlots, int maxNumber) {
        this.Subject = subject;
        this.cardId = cardId;
        this.numbers = new int[numberOfSlots];
        generateNumbers(numberOfSlots, maxNumber);
    }

    public void generateNumbers(int numberOfSlots, int maxNumber) {
        Random random = new Random();
        for (int i = 0; i < numberOfSlots; i++) {
            numbers[i] = random.nextInt(maxNumber);
        }
    }

    @Override
    public void update(int numeroSorteado) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numeroSorteado) {
                numbers[i] = -1;
            }
        }
    }

    public boolean didIWin(){
        for (int number : numbers) {
            if (number != -1) {
                return false;
            }
        }
        return true;
    }

    public int getCardId() {
        return cardId;
    }

    @Override
    public String toString() {
        return "BingoCard{" +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
