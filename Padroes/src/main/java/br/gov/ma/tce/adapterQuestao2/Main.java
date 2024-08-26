package br.gov.ma.tce.adapterQuestao2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
        MedidorCelsiusIF adaptadorObject = new AdaptadorFarenheitParaCelsiusObjectAdapter(medidorFarenheit);

        double temperaturaCelsiusObject = adaptadorObject.medirTemperatura();
        System.out.println("Temperatura medida (Object Adapter): " + temperaturaCelsiusObject + "°C");

        MedidorCelsiusIF adaptadorClass = new AdaptadorFarenheitParaCelsiusClassAdapter();

        double temperaturaCelsiusClass = adaptadorClass.medirTemperatura();
        System.out.println("Temperatura medida (Class Adapter): " + temperaturaCelsiusClass + "°C");

        List<Experimento> experimentos = new ArrayList<>();
        experimentos.add(new Experimento(experimentos, "Experimento 1"));
        experimentos.add(new Experimento(experimentos, "Experimento 2"));

        Experimento experimentoOriginal = new Experimento(experimentos, "Experimento 1");
        Experimento experimentoClonado = experimentoOriginal.clone();

        System.out.println("Experimento Original: " + experimentoOriginal);
        System.out.println("Experimento Clonado: " + experimentoClonado);
    }
}
