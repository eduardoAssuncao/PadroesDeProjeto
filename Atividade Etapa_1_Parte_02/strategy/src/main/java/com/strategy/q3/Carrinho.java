package com.strategy.q3;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;
    private DescontoStrategy descontoStrategy;

    public Carrinho(){
        produtos = new ArrayList<>();
        descontoStrategy = new Desconto();
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    // Método para receber a estratégia de desconto utilizada
    // Nesse caso, poderíamos criar uma strategy para novos descontos ao longo do ano.
    public void setDesconto(Desconto desconto){
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularTotal(){
        double total = 0.0;
        for(Produto produto : produtos){
            total += produto.calcularPrecoFinal(descontoStrategy);
        }
        return total;
    }
}
