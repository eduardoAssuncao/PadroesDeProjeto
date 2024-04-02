package com.strategy.q3;

import java.util.HashMap;
import java.util.Map;

// Estamos implementando a interface DescontoStrategy na classe Desconto e, caso surja uma nova lógica de desconto
// podemos apenas alterar nosso HashMap ou criar uma outra classe que implemente a interface e tenha sua lógica de 
// desconto, podendo ser uma promoção.
public class Desconto implements DescontoStrategy{
    // O código cria um Map final (não permitindo alteração em tempo de execução)
    // que faz associação de um Produto a um desconto.
    private final Map<Class<? extends Produto>, Double> descontos;

    public Desconto(){
        descontos = new HashMap<>();
        descontos.put(LivroDigital.class, 0.15);
        descontos.put(RevistaDigital.class, 0.15);
        descontos.put(LivroImpresso.class, 0.3);
        descontos.put(RevistaImpressa.class, 0.3);
        descontos.put(JogoTabuleiro.class, 0.3);
    }


    @Override
    public double desconto(Produto produto) {
        // O seguinte código faz a associação de um produto a um desconto,
        // se não existir a associaçãom será usado o valor default.
        return descontos.getOrDefault(produto.getClass(), 0.0);
    }
    
}
