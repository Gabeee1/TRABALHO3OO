package exercicio1oo;

    public class TestaContaBancaria {
        public static void main(String[] args) {

            ContaBancaria conta = new ContaBancaria("123456789", 1000.0);

            System.out.println("Saldo inicial: R$" + conta.consultarSaldo());

            conta.depositar(500.0);
            System.out.println("Saldo após depósito: R$" + conta.consultarSaldo());

            conta.sacar(2000.0);
            System.out.println("Saldo após tentativa de saque: R$" + conta.consultarSaldo());

            conta.sacar(300.0);
            System.out.println("Saldo após saque: R$" + conta.consultarSaldo());
        }
    }
