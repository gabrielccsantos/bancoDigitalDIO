import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta cp = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.imprimirExtrato();
        cc.transferir(cp, 100);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}