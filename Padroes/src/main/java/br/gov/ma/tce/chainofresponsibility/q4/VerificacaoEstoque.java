package br.gov.ma.tce.chainofresponsibility.q4;

public class VerificacaoEstoque implements ProcessingChain{

    private ProcessingChain chain;

    @Override
    public void setNext(ProcessingChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void processing(Pedido pedido) {
        if(pedido.getEstoque() > 0){
            chain.processing(pedido);
        }else{
            System.out.println("Não tem estoque");
        }
    }
    
}
