package br.gov.ma.tce.abstractFactory.modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DataEUA extends Data{

    @Override
    public String toString() {
        SimpleDateFormat usDateTimeFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date now = new Date();
        return usDateTimeFormat.format(now);
    }
}
