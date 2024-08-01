package br.gov.ma.tce.observerQuestao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoSystem implements Subject {

    private static BingoSystem uniqueInstance;
    private final List<Observer> bingoCards;
    private int numberDrawn;
    private boolean gameEnded;

    private BingoSystem() {
        bingoCards = new ArrayList<>();
        gameEnded = false;
    }

    public static BingoSystem getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BingoSystem();
        }
        return uniqueInstance;
    }


    @Override
    public void subscribe(Observer observer) {
        bingoCards.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : bingoCards) {
            observer.update(numberDrawn);
        }
    }

    public void startBingo(int maxNumber){
        Random random = new Random();
        while (!gameEnded) {
            numberDrawn = random.nextInt(maxNumber);
            notifyObservers();
            checkWinners();
        }
    }

    private void checkWinners() {
        for(Observer observer : bingoCards){
            if(((BingoCard) observer).didIWin()){
                gameEnded = true;
                var win = ((BingoCard) observer).getCardId();
                bingo(String.valueOf(win));
                break;
            }
        }
    }

    public void bingo(String message){
        int cardId = Integer.parseInt(message);
        for (Observer observer : bingoCards) {
            if(((BingoCard) observer).getCardId() == cardId
                    && ((BingoCard) observer).didIWin()){
                gameEnded = true;
                System.out.println("O vencedor é: " + cardId);
                break;
            }
        }
    }
}
