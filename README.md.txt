## Banco Digital com Java e Orientação a Objetos :coffee:

### Desafio da DIO

- Neste repositorio, estao implementados os principios da orientacao a objectos

  ​

### Classes

- Neste projectos temos 6 classes, 5 no pacote model e uma no pacote app, sendo no ultimo pacote onde esta a classe principal(main);

  #### Classes do pacote model

  - Aqui temos as Cliente, Conta, ContaCorrente e ContaPoupanca;

  - Temos tambem a interface Iconta.

  - As Classes ContaCorrente e ContaPoupanca sao filhas da classe abstrata Conta, que por sua vez implementa os metodos da interface (metodos, levantar, depositar, transferir e imprimir);

  - As classes ContaCorrente e ContaPoupanca foram defenidas um saldo inicial de 500 e 300$ inicialmente, para poder realizar as operacoes possiveis.

    #### Classe do pacote app

    - Neste pacote, temos a classe Application que contem o metodo main.
    - Nesta classe, temos alguns metodos responsaveis por chamar os metodos da filhas da Conta;
    - Temos tambem um Menu, que permite escolher as operacoes que desejamos.

    ​