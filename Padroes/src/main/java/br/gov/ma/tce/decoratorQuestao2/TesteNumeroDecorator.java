package br.gov.ma.tce.decoratorQuestao2;

public class TesteNumeroDecorator {
    public static void main(String[] args) {
        String numero = "1";

        Numero numeroParenteses = new NumeroDecoratorComParenteses(new NumeroBasico());
        numeroParenteses.imprimir(numero);

        Numero numeroColchetes = new NumeroDecoratorComColchetes(new NumeroBasico());
        numeroColchetes.imprimir(numero);

        Numero numeroChaves = new NumeroDecoratorComChaves(new NumeroBasico());
        numeroChaves.imprimir(numero);

        Numero numeroPCC = new NumeroDecoratorComParenteses(new NumeroDecoratorComColchetes(
                new NumeroDecoratorComChaves(new NumeroBasico())));
        numeroPCC.imprimir(numero);

    }
}
