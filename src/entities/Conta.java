package entities;

public abstract class Conta {
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
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

    public void sacar(double valor){

    }

    public void depositar(double valor){

    }

    public void transferir(Conta conta, double valor) {

    }
}
