package br.gov.ma.tce.templatemethod.Questao9;

public class Car {
    
    private String chassis;
    private String engine;
    private String features;

    public String getChassis() {
        return chassis;
    }
    public void setChassis(String chassis) {
        this.chassis = chassis;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getFeatures() {
        return features;
    }
    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Chassi='" + chassis + '\'' +
                ", Engine=" + engine +
                ", Feature=" + features +
                '}';
    }
}
