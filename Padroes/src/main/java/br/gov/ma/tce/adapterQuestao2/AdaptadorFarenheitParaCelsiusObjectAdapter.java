package br.gov.ma.tce.adapterQuestao2;

public class AdaptadorFarenheitParaCelsiusObjectAdapter implements MedidorCelsiusIF{

    private MedidorFarenheit medidorFarenheit;

    public AdaptadorFarenheitParaCelsiusObjectAdapter(MedidorFarenheit medidorFarenheit) {
        this.medidorFarenheit = medidorFarenheit;
    }

    @Override
    public double medirTemperatura() {
        double temperaturaFarencheit = medidorFarenheit.getTemperaturaFarenheit();
        return (temperaturaFarencheit - 32) / 1.8;
    }
}
