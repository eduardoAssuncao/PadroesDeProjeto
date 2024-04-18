package com.templatemethod.Questao3;

public abstract class Produtos {
 
    public final void gerenciar(){
        validar();
        calcularCusto();
        notificarEnvio();
    }

    abstract void validar();

    abstract void calcularCusto();

    abstract void notificarEnvio();
}
