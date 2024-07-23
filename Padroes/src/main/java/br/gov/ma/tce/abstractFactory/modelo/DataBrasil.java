package br.gov.ma.tce.abstractFactory.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataBrasil extends Data{

    @Override
    public String toString() {
        SimpleDateFormat brDateTimeFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date now = new Date();
        return brDateTimeFormat.format(now);
    }
}
