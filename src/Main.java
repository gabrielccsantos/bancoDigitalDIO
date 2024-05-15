import entities.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta cp = new ContaPoupanca(venilton);

        Banco banco = new Banco();

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(100);
        cc.imprimirExtrato();
        System.out.println();
        cc.transferir(cp, 100);
        cc.imprimirExtrato();
        System.out.println();
        cp.imprimirExtrato();


        System.out.println();
        banco.getContas();
    }
}