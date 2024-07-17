package br.gov.ma.tce.strategy.q3;

import java.util.HashMap;
import java.util.Map;

// classe que poderar ser utilizada para implementar uma nova estratégia de promoção
public class DescontoPromocao implements DescontoStrategy{

    private final Map<Class<? extends Produto>, Double> descontoPromocao;

    public DescontoPromocao(){
        descontoPromocao = new HashMap<>();
        descontoPromocao.put(null, null);
        descontoPromocao.put(null, null);
        descontoPromocao.put(null, null);
        descontoPromocao.put(null, null);
    }

    @Override
    public double desconto(Produto produto) {
        return descontoPromocao.getOrDefault(produto.getClass(), 0.0);
    }
    
}
