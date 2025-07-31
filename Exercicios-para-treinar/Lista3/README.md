# Classes e encapsulamento

A lista 3 tem como objetivo treinar o uso de diferentes classes e métodos para delegar as funções do programa, além de reforçar a técnica de encapsulamento, fundamental para a programação orientada a objetos. Assim, foi possível aprender sobre:

- O uso de `getters` e `setters`
- A criação de `construtores` e seus tipos (compact e construtor secundário)
- A diferença entre `classes` e `records`

Ela foi desenvolvida visando solucionar os seguintes desafios:

## 1 - ContaBanco

Escreva em código onde temos uma conta bancária que possa realizar as seguintes operações:
 * Consultar saldo
 * Consultar cheque especial
 * Depositar dinheiro
 * Sacar dinheiro
 * Pagar boleto
 * Verificar se a conta está usando cheque especial.

Siga as seguintes regras para implementar:
 * A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
 * O valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
 * Se o valor depositado na criação da conta for de R500,00 ou menos o cheque especial deve ser de R50,00
 * Para valores acima de R$500,00 o cheque especial deve ser de 20% do valor depositado
 * Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.


 ## 2 - Automovel
Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
 * Ligar o carro;
 * Desligar o carro;
 * Acelerar;
 * Diminuir velocidade;
 * virar para esquerda/direita;
 * verificar velocidade;
 * trocar a marcha.

Siga as seguintes regras na implementação:
 * Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
 * O carro desligado não pode realizar nenhuma função.
 * Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
 * Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no mínimo a 0km);
 * O carro deve ter até 6 marchas, não deve ser permitido pular uma marcha no carro;
 * A velocidade do carro deve respeitar as seguintes limites para cada velocidade:
   * se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
   * se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
   * se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
   * se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
   * se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
   * se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
   * se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
 * O carro poderá ser desligado se estiver em ponto morto (marcha 0) e com a velocidade em 0 km
 * O carro só pode virar para esquerda/direita se sua velocidade for de no mínimo 1km e no máximo 40km;

 ## 3 - PetShop
Escreva um código onde temos o controle de banho de um petshop, a máquina de banhos dos pets deve ter as seguintes operações:
 * Dar banho no pet;
 * Abastecer com água;
 * Abastecer com shampoo;
 * verificar nível de água;
 * verificar nível de shampoo;
 * verificar se tem pet no banho;
 * Colocar pet no banho;
 * retirar pet da máquina;
 * limpar máquina;

Siga as seguintes regras para implementação:
 * A máquina de banho deve permitir somente 1 pet por vez;
 * Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
 * A máquina tem capacidade máxima de 100 litros de água e 20 litros de shampoo;
 * Se o pet for retirado da máquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
 * Para ter o pet limpo é necessário 3 ciclos de banho para o pet ser considerado limpo;
 * O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;