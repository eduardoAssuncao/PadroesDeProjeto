package br.gov.ma.tce.strategy.q2;

public class ImageManager {
    
    private RendererStrategy strategy;

    public void setStrategy (RendererStrategy strategy){
        this.strategy = strategy;
    }

    public void show(){
        strategy.mostrarImagem();
    }
}
