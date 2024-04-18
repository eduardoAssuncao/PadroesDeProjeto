package com.templatemethod.Questao7;

public interface Builder {
    void comNome(String nome);
    void comEmail(String email);
    void comTelefone(String telefone);
    void comEndereco(Endereco endereco);
    Contato getResult();
}
