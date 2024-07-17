Imagine que você está desenvolvendo um sistema de processamento de pedidos online para uma loja de produtos eletrônicos. Neste sistema, os pedidos passam por diferentes etapas de processamento, incluindo verificação de disponibilidade de estoque, cálculo de preço final com descontos,processamento de pagamento e envio do pedido.

    Seu objetivo é esboçar uma solução com uso do padrão Chain of Responsibility para lidar com essas diferentes etatas de processamento de pedidos. Aqui estão os passos que você deve seguir:

    Passo 1: Identifique as diferentes etapas do processamento de pedidos. Por exemplo: Verificação de estoque, Cálculo de descontos, Processamento de pagamento e Envio do pedido.

    Passo 2: Crie uma interface chamada "Handler" que defina um método para processar um pedido.

    Passo 3: Implemente classes concretas para cada uma das etapas do processamento de pedidos, todas implementando a interface "Handler". Cada classe deve conter lógica para processar sua etapa específica e decidir se pode ou não lidar com o pedido.

    Passo 4: Encadeie as classes concretas em uma ordem específica, de modo que o pedido seja passado de uma etapa para outra até que todas as etapas sejam concluídas.

    Passo 5: Teste o sistema criando alguns pedidos de teste e verifique se eles são processados corretamente, passando por todas as etapas do processamento.

Para isto, crie manipuladores para contar a quantidade de cada tipo de nota. Ao terminar sua contagem, cada manipulador deve passar ao próximo o cálcuulo da quantidade de notas relativas ao montante restante.

Cada manipulador deve exibir a sua contagem.


- O resultado apresentado conta com uma classe pedido criada somente para fins de teste, não representando uma situação real de todas as verificações.
