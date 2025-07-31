# Herança e poliformismo
A lista 4 tem como objetivo treinar a herança entre classes em java e técnicas de poliformismo. Além desses aspectos, foram estudados:

- Os tipos de classes (`abstract` e `sealed`)
- Sobrecarga e sobreescrita de métodos
- Métodos abstratos

Ela foi desenvolvida visando solucionar os seguintes desafios:

## 1 - Ingressos
Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema. O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado. A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família. Cada ingresso deve ter um método que retorna o seu valor real (baseado no valor informado na criação do ingresso) para os de meia entrada o seu valor deve ser de metade do valor, para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.

## 2 - Loja
Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:
 * *Classe Gerente* que terá os atributos: Nome, Email, Senha e um atributo que informa se ele é administrador, esse último deve ser sempre verdadeiro.
 * *Classe Vendedor* que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas e um atributo que informa se ele é administrador, esse último deve ser sempre falso.
 * *Classe Atendente* que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa e um atributo que informa se ele é administrador, esse último deve ser sempre falso.

Cada classe deve ter seus respectivos getters e setters (para atributos que façam sentido ter) e as classes devem ter os seguintes métodos:
 * A classe *Gerente* deve ter os métodos Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha.
 * A classe *Vendedor* deve ter os métodos Realizar venda ( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha.
 * A classe *Atendente* deve ter os métodos Realizar recebimentos (onde o método recebe um valor que deve ser incrementado no valor em caixa), Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha;

## 3 - Horarios
Escreva uma hierarquia de classes para criação de relógios para diferentes lugares do mundo, defina uma classe pai que tenha as propriedades Hora, minuto e segundo com seus respectivos getters e setters (atendendo as regras do funcionamento de um relógio) e um método que deverá retornar a hora no formato HH:MM:SS, a partir dessa classe crie 2 implementações, uma chamada relógio Americano e outra relógio Brasileiro, lembrando que para o relógio americano não existem as horas 13 até 24. Defina também na superclasse um método que ficará por responsabilidade da classe que extendê-la definir seu funcionamento, esse método deve receber um relógio (independente da implementação) e deve-se extrair as informações dele e usá-la no objeto que recebeu para setar as novas informações do relógio.