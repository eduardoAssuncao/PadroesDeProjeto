package br.gov.ma.tce.templatemethod.Questao3;

public class ProdutoFisico extends Produtos{

    private String nome;
    private double preco;
    private int estoque;

    private double frete;
    private double embalagem;

    public ProdutoFisico() {
    }

    public ProdutoFisico(String nome, double preco, int estoque, double frete, double embalagem) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.frete = frete;
        this.embalagem = embalagem;
    }

    @Override
    void validar() {
        System.out.println("verificar estoque");
        System.out.println("Validar compra");
    }

    @Override
    void calcularCusto() {
        double precoCalculado = this.preco + this.frete + this.embalagem;
        System.out.println("Preço com calculo: " + precoCalculado);
    }

    @Override
    void notificarEnvio() {
        System.out.println("O seu pedido está sendo encainhado para envio");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(double embalagem) {
        this.embalagem = embalagem;
    }
}
