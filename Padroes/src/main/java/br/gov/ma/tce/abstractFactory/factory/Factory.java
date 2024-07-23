package br.gov.ma.tce.abstractFactory.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {

    private static final String CONFIG_PROPERTIES = "config.properties";
    private static Properties properties = new Properties();

    static {
        try (InputStream input = Factory.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTIES)) {
            if (input == null) {
                throw new IOException("Config file not found");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static LocalidadeAbstractFactory newLocalidade() {
        String localidade = properties.getProperty("localidade");
        if ("EUA".equalsIgnoreCase(localidade)) {
            return new LocalidadeEUA();
        } else if ("Brasil".equalsIgnoreCase(localidade)) {
            return new LocalidadeBrasil();
        } else {
            throw new RuntimeException("Localidade não encontrada");
        }
    }

}
