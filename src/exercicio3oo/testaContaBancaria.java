package exercicio3oo;



class testaContaBancaria {
    public static void main(String[] args) {
        exercicio3oo.ContaBancaria conta = new ContaBancaria("123456", 1000.0);

        System.out.println("Saldo inicial: R$" + conta.consultarSaldo());

        conta.depositar(500.0);  // Realizando um depósito
        System.out.println("Saldo após depósito: R$" + conta.consultarSaldo());

        conta.sacar(200.0);  // Realizando um saque
        System.out.println("Saldo após saque: R$" + conta.consultarSaldo());

        conta.sacar(1500.0);  // Tentando sacar mais do que o saldo
    }
}

