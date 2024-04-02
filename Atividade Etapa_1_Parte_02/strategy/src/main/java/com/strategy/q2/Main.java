package com.strategy.q2;

public class Main {
    public static void main(String[] args) {
        RendererStrategy tvRenderer = new TVRenderer();
        RendererStrategy laptopRenderer = new LaptopRenderer();
        RendererStrategy smartphoneRenderer = new SmatphoneRederer();

        ImageManager imageManager = new ImageManager();

        imageManager.setStrategy(tvRenderer);
        imageManager.show();

        imageManager.setStrategy(laptopRenderer);
        imageManager.show();

        imageManager.setStrategy(smartphoneRenderer);
        imageManager.show();
    }
}