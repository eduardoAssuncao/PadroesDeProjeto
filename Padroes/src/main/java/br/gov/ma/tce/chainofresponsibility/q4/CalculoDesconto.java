package br.gov.ma.tce.chainofresponsibility.q4;

public class CalculoDesconto implements ProcessingChain{

    private ProcessingChain chain;

    @Override
    public void setNext(ProcessingChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void processing(Pedido pedido) {
        if(pedido.getDeconto() == true){
            pedido.setPreco(pedido.getPreco() * (1 - 0.3));
            System.out.println("Desconto aplicado");
            chain.processing(pedido);
        }else{
            System.out.println("Desconto nao aplicado");
            chain.processing(pedido);
        }
    }
    
}
