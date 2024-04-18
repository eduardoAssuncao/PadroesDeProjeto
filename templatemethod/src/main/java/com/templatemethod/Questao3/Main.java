package com.templatemethod.Questao3;

public class Main {
    public static void main(String[] args) {
        Produtos tabuleiro = new ProdutoFisico("Tabuleiro1", 200, 2, 25, 5);
        Produtos digital = new ProdutoDigital("Elden Ring", 190);
        Produtos assinatura = new ProdutoDeAssinatura("Flixnet", 45);

        System.out.println("---Produto Físico---");
        tabuleiro.gerenciar();
        System.out.println("---Produto Digital---");
        digital.gerenciar();
        System.out.println("---Produto de Assinatura---");
        assinatura.gerenciar();
    }
}