1. Os princípios SOLID reúnem cinco boas práticas para projetos Orientados a Objetos-OO. Considere a classe UrnaEleitora:

public class UrnaEleitoral {
  public void AdicionarCandidato (String nome, int numero, int partido) { }
  public decimal CalcularTotalVotosCandidatos() { }
  public void CadastrarPartido() { }
  public void CadastrarEleitores() { }
  public void CadastrarMesarios() { }
}

Com base no principio SOLID e nas boas práticas para projetos OO quais são os problemas dessa classe. Sugirá melhoria no código.

- O Código apresentado não segue o principio de responsabilidade única (S - Single-Responsability Principle). Desta forma, segundo o princípio, a nossa classe deve ter um, e somente um, motivo para mudar e, como é visto no código, a classe UrnaEleitoral tem a responsabilidade de realizar várias tarefas.
- Seguindo essa lógica supracitada, a classe também acaba infrigindo a principio aberto-fechado (O - Open-Closed Principle), já que ele está aberto para possíveis futuras modificações/incrementos na lógica da urna.
- Portanto, seria interessante a criação de uma interface que irá conter o contrato dessa classe. Além disso, é importante a criação de outras classes responsáveis, segundo o princípio de responsabilidade, para realizar tarefas específicas.

2. Para reaproveitarmos comportamento com composição, precisamos escrever métodos que queremos reaproveitar, criando os métodos e chamando os correspondentes na instância. Esses métodos que só delegam o trabalho para a instância no atributo são conhecidos como delegate methods. Quais vantagens e desvantagens essa abordagem apresenta sobre herança?

- A utilização do delegate methods vibializa o cumprimeto do princípio de princípios do SOLID que acabariam sendo quebrados ao utilizar a Herança (L - Liskov Substitution Principle). Portanto, podemos usar métodos de outras classes sem ser obrigados a seguir o seu contrato estabelecido por uma interface (o que ocorreria na herança). Além disso, a sua utilização acaba permitindo um baixo acoplamento entre os objetos, maior flexibilidade e a possibilidade de realizar callbacks functions.
- Apesar desses possíveis benefícios, pode ocorrer de, ao utilizar muito isso, acabarmos em um código espaguete onde tudo está interligando e, portanto, uma única modificação em um "método-pai" pode acabar ocasionando inúmeros erros.

3. Por que acoplamento é tão indesejado em projetos orientados a objeto?

- Como apresentado na aula, somos capazes de criar projetos (softwares) funcionais, mas também somos capazes de criar softwares díficeis de amnter e evoluir. Portando, para que a rigidez não seja um dos nossos design smells, precisamos evitar o alto acoplamento do nosso software, já que esse sintoma evita o reaproveitamento de códigos. Desta forma, é importânte que o acoplamento seja utilizado em classes estáveis que tendem a mudar menos e uma boa forma de garantir isso é programar voltado para a interface.

4. Como o princípio do OCP nos ajuda a escrever classes mais flexíveis?

- O Open-Closed Principle nos permite programar voltado a interface, portando nossa classe não estará aberta para modificações, mas sim para extensões. Isso "garante" que, ao surgir nossas funcionalidades/métodos, seja criado uma nossa classe que extenda uma interface e não seja necessário modificar uma classe já existente.

5. O que é o DIP? E qual a vantagem de sempre depender de classes estáveis?

- O DIP (Dependency Inversion Principle) consiste na criação de abstrações para que as implementações concretas não sejam trabalhadas dentro de uma classe. Desta forma, nossas classes de alto nível serão independentes dos detalhes de implementação de classes de baixo nível.
- Utilizando esse peincípio, estaremos, mais uma vez, trabalhando com a extensão de interfaces (programação voltada a interface) e, portanto, estamos trabalhando com "informações" coesas, ou melhor, interfaces coesas que irão diminuir o risco de acoplamento e a propagação de problemas. O mesmo vale para as classes. A dependência de classes estáveis (que não estão suscetíveis a mudanças) evita a progamação de problemas recorrente em classes que estão em constante modificação.

6. Como o OCP e o princípio de Liskov se relacionam?

- Esse dois princípios podem ser generalizados em um princípio chamado Dependency Inversion Principle.
- Portando, seu relacionamento está no fato de dependemos de abstrações necessárias para nossa classse. No caso do OCP (Open-Closed Principle), fazemos a criação de interfaces que possibilite trabalhar com extesões e não modificações para cada nova regras estabelecida dentro do nosso código. O mesmo vale para a herança. Nossa classe mãe deve funcionar como uma interface para nossa classe filha e, caso nossa classe filha não execute algum método da nossa classe mãe, é necessário a criação de uma classe mais específica que haja a dupla satisfação de modo que, ao ter seu parentesco invertido, o programa funcionara perfeitamente. O mesmo vale para a criação das interfaces. Não faz sentido criar métodos na minha interface que são serão utilizados por alguma das minhas classes.

7. O que é a Lei de Demeter? O que o desenvolvedor ganha quado a segue?

- A lei de Demeter determina que devemos evitar o encadeamento ao realizar a chamada de métodos. Portanto, devemos eviar a redução do encapsulamento ao "mostrar" a nossa robustez para as outras classes. Ao seguir essa Lei, o desenvolver irá ser capaz de miniminar o código ao relaizar chamadas de métodos e, ainda, não deixar visível todo o caminho feito para que uma informação seja concebida.

8. Qual a alternativa para se reaproveitar comportamento, sem fazer uso de herança?

- Como já visto anteriormente nas outras questões, podemos utilizar a associação de composição (Todo na parte e a parte só existe com o todo) e agregação (parte no todo), assim como o uso de interfaces.

9. Para cada um dos seguintes princípios de design GRASP, pesquise e dê exemplos usando trechos de código, de como seria (1) ANTES e (2) APÓS a aplicação de cada um desses princípios.

Princípios de Design OO a serem considerados:

GRASP - General Responsibility Assignment Software Patterns

● Criador - Define o responsável pela criação de objetos através do relacionamento entre as classes.    Para isso, deve-se cumprir pelo menos um dos seguintes requisitos:
  B agrega objetos da classe A.
  B contém objetos da classe A.
  B registra instâncias da classe A.
  B usa muitos objetos da classe A.
  B possui os dados usados para inicializar A.

(ANTES):
public class Pessoa {
  private String nome;
  private int idade;
  
  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  public Endereco criarEndereco(String rua, int numero, String cidade){
    return new Endereco(rua, numero, cidade, this);
  }
}

public class Endereco {
  private String rua;
  private int numero;
  private String cidade;
  private Pessoa pessoa;

  public Endereco(String rua, int numero, String cidade, Pessoa pessoa){
    this.rua = rua;
    this.numero = numero;
    this.cidade = cidade;
    this.pessoa = pessoa;
  }
}

(APÓS):
public class Pessoa {
  private String nome;
  private int idade;
  
  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
}

public class Endereco {
  private String rua;
  private int numero;
  private String cidade;

  public Endereco(String rua, int numero, String cidade){
    this.rua = rua;
    this.numero = numero;
    this.cidade = cidade;
  }
} 

public class CriacaoDeEnderecos {
  public static Endereco criarEndereco(Pessoa pessoa, String rua, int numero, String cidade){
    return new Endereco(rua, numero, cidade, pessoa);
  }
}

-Antes, a classe Pessoa era responsável por criar objetos da classe Endereco, mas passamos essa responsabilidade de criar endereços para uma nova classe chamada CriacaoDeEnderecos.
  

● Especialista na Informação - É responsável por atribuir responsabilidade de uma determinada operação a uma classe que possui informações necessárias para realizar esta. Através deste GRASP é possível determinar quais métodos serão implementados em cada classe.

(ANTES):
public class Venda{
  private LocalDate data;
  private LocalTime hora;
  private LinhaDetalheVenda detalheVenda;

  public Venda(LocalDate data, LocalTime hora, LinhaDetalheVenda detalheVenda){
    this.data = data;
    this.hora = hora;
    this.detalheVenda = detalheVenda;
  }
}

public LinhaDetalheVenda {
  private int quantidade;
  private EspecificacaoProduto especificacaoProduto;

  public LinhaDetalheVenda (int quantidade, EspecificacaoProduto especificacaoProduto){
    this.quantidade = quantidade;
    this.especificacaoProduto = especificacaoProduto;
  }
}

public class EspecificacaoDeProduto {
  private String descricao;
  private double preco;

  public EspecificacaoDeProduto(String descricao, double preco){
    this.descricao = descricao;
    this.preco = preco;
  }
}

(APÓS):
public class Venda{
  private LocalDate data;
  private LocalTime hora;
  private LinhaDetalheVenda detalheVenda;

  public Venda(LocalDate data, LocalTime hora, LinhaDetalheVenda detalheVenda){
    this.data = data;
    this.hora = hora;
    this.detalheVenda = detalheVenda;
  }

  public double calcularTotal(){
    //Especialista em calcular total
  }
}

public LinhaDetalheVenda {
  private int quantidade;
  private EspecificacaoProduto especificacaoProduto;

  public LinhaDetalheVenda (int quantidade, EspecificacaoProduto especificacaoProduto){
    this.quantidade = quantidade;
    this.especificacaoProduto = especificacaoProduto;
  }

  public double calcularSubTotal(){
    //Especialista em calcular subTotal
  }
}

public class EspecificacaoDeProduto {
  private String descricao;
  private double preco;

  public EspecificacaoDeProduto(String descricao, double preco){
    this.descricao = descricao;
    this.preco = preco;
  }

  public double calculoDePreco(){
    //Especialista em calcular o preço do produto
  }
}

● Acoplamento Baixo - O baixo acomplamento visa manter a independência de elementos no código, assegurando que não estejam fortemente conectados. Por conseguinte, obtêm-se maior manutenibilidade do sistema e reutilização de código.

(ANTES):
public class Lampada{
  public static final ON = 0;

  public void setLampada(int valor){
    if(valor == ON){
      // ligar lampada;
    } else if(valor == 1){
      // desligar lampada;
    } else if(valor == 2){
      // piscar
    }
  }
}

public class Main{
  ...
  Lampada. lampada = new Lampada();
  lampada.setLampada(Lampada.ON);
  lampada.setLampada(2);
}

(APÓS):
public interface Lampadas {
  public void on();
  public void off();
  public void piscar();
}

public class Lampada implements Lampadas {

  public void on(){
    // ligar
  }

  public void off(){
    // desligar
  }

  public void piscar(){
    // piscar
  }
}

public class Main{
  ...
  Lampada lampada = new Lampada();
  lampada.on();
  lampada.piscar();
}

● Controlador - Atribui a responsabilidade de manipular eventos do sistema para uma classe externa ao usuário, funcionando como uma interface para a interação com o sistema.

Um exemplo de controllador é o próprio controller de uma aplicação REST, onde temos co controller para realizar as requisições feitas por um clientes e o mesmo realiza o direcionamento para as tratativas a serem realizadas.

(ANTES):
public class ShoppingCart {
    private List<Order> orders;

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public double getTotal() {
        double totalCost = 0;
        for (Order order : orders) {
            totalCost += order.getCost();
        }
        return totalCost;
    }
}

(APÓS):
public class OrderController {
    private ShoppingCart shoppingCart;

    public OrderController() {
        this.shoppingCart = new ShoppingCart();
    }

    public void addOrder(Order order) {
        shoppingCart.addOrder(order);
    }

    public double getTotal() {
        return shoppingCart.getTotal();
    }
}


● Coesão Alta - Coesão é um conceito que indica quão relacionadas estão as responsibilidades de determinado elemento do projeto, isto é, o nível de pertencimento das partes de algum elemento àquele escopo específico.

(ANTES):
public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        // Lógica para depositar dinheiro
    }

    public void sacar(double valor) {
        // Lógica para sacar dinheiro
    }

    public void enviarEmail() {
        // Lógica para enviar e-mails
    }

    public void imprimirExtrato() {
        // Lógica para imprimir extrato
    }
}

(APÓS):
public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        // Lógica para depositar dinheiro
    }

    public void sacar(double valor) {
        // Lógica para sacar dinheiro
    }
}

public class Extrato {
    public void enviarEmail() {
        // Lógica para enviar e-mails
    }

    public void imprimirExtrato() {
        // Lógica para imprimir extrato
    }
}

10. Imagine que, no sistema financeiro de uma empresa, o código que gera o pagamento dos funcionários é o seguinte:
(ANTES):
public class PagadorDeFuncionario {

  public void pagaChefe(Chefe chefe) {
    chefe.depositaNaConta(chefe.getSalarioBase() + chefe.getBonificacaoes());
  }

  public void pagaFuncionario(Funcionario funcionario) {
    funcionario.depositaNaConta(funcionario.getSalario() + funcionario.getBonus());
  }

  public void pagaEstagiario(Estagiario estagiario) {
    estagiario.paga(estagiario.getBolsa() + estagiario.getAuxilios());
  }
}

(REFATORADO):
public class Chefe {
  ...

  public double pagamento(){
    return this.salarioBase + this.bonificacao;
  }
}

public class Funcionario {
  ...

  public double pagamento(){
    return this.salario + this.bonus;
  }
}

public class Estagiario {
  ...

  public double pagamento(){
    return this.bolsa + this.auxilios;
  }
}

public interface Pagamentos {
  public void pagaChefe(Chefe chefe);
  public void pagaFuncionario(Funcionario funcionario);
  public void pagaEstagiario(Estagiario estagiario);
}

public class PagadorDeFuncionario implements Pagamentos {
  public void pagaChefe(Chefe chefe){
    chefe.depositaNaConta(chefe.pagamento());
  }

  public void pagaFuncionario(Funcionario funcionario) {
    funcionario.depositaNaConta(funcionario.pagamento());
  }

  public void pagaEstagiario(Estagiario estagiario) {
    estagiario.depositaNaConta(estagiario.pagamento());
  }
}

11. Muitas pessoas optam por investir o dinheiro das suas contas bancárias. Existem diversos tipos de investimentos, desde investimentos conservadores até mais arrojados. Independente do investimento escolhido, o titular da conta recebe apenas 75% do lucro do investimento, pois 25% é imposto.

Implemente um mecanismo que invista o valor do saldo dela em um dos vários tipos de investimento e, dado o retorno desse investimento, 75% do valor é acidioado no saldo da conta.

Crie a classe RealizadorDeInvestimentos que recebe uma estratégi de investimento, a exevutar sobre uma conta bancária, e adiciona o resultado seguindo a regra acima no saldo da conta.

Os possíveis tipos de investimento são: 
  - CONESRVADOR, que sempre retorna 0.8% do valor investido;
  - MODERADO, que tem 50% de chaces de retornar 2.5%, e 50% de chaces de retornar 0.7%;
  - ARROJADO, que tem 20% de chaces de retornar 5%, 30% de chaces de retornar 3% e 50% de chaces de retornar 0.6%.

public interface tiposInvestimento{
  public void conservador(Conta conta, double valorInvestido);
  public void moderado(Conta conta, double valorInvestido);
  public void arrojado(Conta conta, double valorInvestido);
}

public class RealizadorDeInvestimentos implements tiposInvestimento {

  Random random = new Random();

  public void conservador(Conta conta, double valorInvestido){
    conta.depositaNaConta(conta.getSaldo() + ((valorInvestido * 0.08) + valorInvestido));
  }

  public void moderado(Conta conta, double valorInvestido){
    if(random.nextDouble() <= 0.5){
      conta.depositaNaConta(conta.getSaldo() + ((valorInvestido * 0.25) + valorInvestido));
    } else {
      conta.depositaNaConta(conta.getSaldo() + ((valorInvestido * 0.07) + valorInvestido));
    }
  }

  public void arrojado(Conta conta, double valorInvestido){
    if(random.nextDouble() <= 0.2){
      conta.depositaNaConta(conta.getSaldo() + ((valorInvestido * 0.5) + valorInvestido));
    } else if(random.nextDouble() <= 0.3){
      conta.depositaNaConta(conta.getSaldo() + ((valorInvestido * 0.3) + valorInvestido));
    } else if(random.nextDouble() <= 0.5){
      conta.depositaNaConta(conta.getSaldo() + ((valorInvestido * 0.06) + valorInvestido));
    }
  }
}
//Não sei se a lógica está correta.

12. Seja o código abaixo, que mostra uma possível modelagem de um sistema financeiro. Temos uma classe Movimentacao que tem alguns métodos para calcular impostos. A classe Pagamento estende a classe Movimentacao, customizando parte do comportamento. A classe Deposito também estende a classe Movimentacao.

public class Movimentacao {
  private double valor;
  private Conta conta;
  private Calendar data;

  public double getEncargo() {
    return valor * 0.01;
  }
  // getters e setters
}

public class Pagamento extends Movimentacao {
  private String favorecido;
  private String formaDePagamento;
  // getters e setters
}

public class Deposito extends Movimentacao {
  private String numeroEnvelope;

  public double getEncargos(){
    throw 
        new RuntimeException("Depositos não sofrem encargos");
  }
  // getters e setters
}

Você vê algum problema com essa abordagem? Comente e apresente uma solução que usa composição em vez de herança para resolver esse problema.
  - Sim, a abordagem feita usa a herança de forma a infringir o princípio de Liskov já que a classe Deposito é incapaz de assumir o papel de mãe.

public class Movimentacao {
  private double valor;
  private Conta conta;
  private Calendar data;

  public double getEncargo() {
    return valor * 0.01;
  }
  // getters e setters
}

public class Pagamento {
  private String favorecido;
  private String formaDePagamento;
  private Movimentacao movimentacao;

  // getters e setters
}

public class Deposito {
  private String numeroEnvelope;
  private Movimentacao movimentacao;

  // getters e setters
}
  - tendo um objeto do tipo Movimentacao é possível acessar seus métodos sem ser necessário implementar os que não são necessários para a nossa classe. 


