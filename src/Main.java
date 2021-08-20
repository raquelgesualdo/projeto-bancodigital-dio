public class Main {

    public static void main(String[] args) {
        Cliente raquel = new Cliente();
        raquel.setNome("Raquel");

	    Conta cc = new ContaCorrente(raquel);
        Conta poupanca = new ContaPoupanca(raquel);

        cc.depositar(100);
	    cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
