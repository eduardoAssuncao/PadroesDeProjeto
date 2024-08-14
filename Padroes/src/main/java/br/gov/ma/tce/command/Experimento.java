package br.gov.ma.tce.command;

import java.util.ArrayList;
import java.util.List;

public class Experimento {

    private List<RoboAction> actions = new ArrayList<>();

    public void addAction(RoboAction action){
        actions.add(action);
    }

    public void execute(){
        for(RoboAction action : actions){
            action.execute();
        }
    }
}
