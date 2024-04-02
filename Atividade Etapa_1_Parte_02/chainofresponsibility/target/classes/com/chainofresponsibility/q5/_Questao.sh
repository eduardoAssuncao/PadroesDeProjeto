Um servidor de aplicação bancária que se comunica com outros deve responder de várias
formas diferentes, de acordo com a solicitação da aplicação cliente.

Se a aplicação solicitar uma Conta, cujos atributos formatados em JSON, por exemplo, o
servidor deverá responder nesse formato; se a aplicação solicitar XML, o servidor deverá
responder XML; se ela pedir no formato CSV, separado por % (por cento), a aplicação deverá
devolver dessa forma.

Implemente um Chain of Responsibility onde, dada uma requisição e uma conta
bancária, ela passeia por toda a corrente até encontrar a classe que deve processar a
requisição de acordo com o formato solicitado, e imprime na tela a conta bancária no formato
correto.

Imagine que a classe Requisição possui um getter getFormato(), que responde "XML",
"CSV", ou "PORCENTO", indicando qual tratamento adequado. Uma Conta possui apenas
saldo e nome do titular:

enum Formato {
JSON,
XML,
CSV
}

INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO MARANHÃO

CAMPUS SÃO LUÍS – MONTE CASTELO
DIRETORIA DE ENSINO SUPERIOR
DEPARTAMENTO DE COMPUTAÇÃO

class Requisicao {
private Formato formato;
public Requisicao(Formato formato) {
this.formato = formato;
}
// getter para o Formato
}

{ numero: 1234, saldo:2300 }
<conta > <numero>1234</numero> <saldo> 2300</saldo></conta>
1234%2300