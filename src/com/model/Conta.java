package com.model;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public String sacar(double valor) {
        if(valor > this.saldo){
            return "Saldo indisponivel";
        }else{
            saldo -= valor;
            return "Levantou com sucesso o valor de "+ valor + "$";
        }
    }

    @Override
    public String depositar(double valor) {
        saldo += valor;
        return "Depositou com sucesso o valor de "+ valor + "$";
    }

    @Override
    public String transferir(double valor, IConta contaDestino) {
        if(valor > this.saldo){
            return "Saldo indisponivel";
        }else{
            this.sacar(valor);
            contaDestino.depositar(valor);
            return "Transferiou com sucesso o valor de "+ valor + "para a Conta numero " +this.getNumero();
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Email: %s", this.cliente.getEmail()));
        System.out.println(String.format("Contacto: %s", this.cliente.getContacto()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
