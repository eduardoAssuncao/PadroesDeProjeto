package br.gov.ma.tce.adapterQuestao2;

public class AdaptadorFarenheitParaCelsiusClassAdapter extends MedidorFarenheit implements MedidorCelsiusIF {

    @Override
    public double medirTemperatura() {
        double temperaturaFarencheit = getTemperaturaFarenheit();
        return (temperaturaFarencheit - 32) / 1.8;
    }
}
