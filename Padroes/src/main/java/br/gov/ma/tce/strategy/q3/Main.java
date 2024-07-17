package br.gov.ma.tce.strategy.q3;

public class Main {
    public static void main(String[] args) {
        JogoDigital jogo1 = new JogoDigital("Elden Ring", 200);
        JogoFisico jogo2 = new JogoFisico("Death Stranding", 80);

        LivroDigital livro1 = new LivroDigital("Além do tempo", 30);
        LivroImpresso livro2 = new LivroImpresso("O chamado", 70);

        RevistaDigital revista1 = new RevistaDigital("Veja", 25);
        RevistaImpressa revista2 = new RevistaImpressa("Super interessante", 15);

        JogoTabuleiro jogoTabuleiro = new JogoTabuleiro("Gwent", 150);

        Carrinho carrinho1 = new Carrinho();

        carrinho1.adicionarProduto(jogo1);
        carrinho1.adicionarProduto(livro1);
        carrinho1.adicionarProduto(revista1);
        carrinho1.adicionarProduto(jogoTabuleiro);

        double total = carrinho1.calcularTotal();
        System.out.println("O valor total da compra é : R$" + total);
    }
}
