package entities;

public abstract class Conta {
    private static final int AGENCIA = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(double saldo) {
        this.agencia = Conta.AGENCIA;
        this.numero = ++SEQUENCIAL;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return AGENCIA;
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
