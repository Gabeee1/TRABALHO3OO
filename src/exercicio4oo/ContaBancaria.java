package exercicio4oo;

public class ContaBancaria {
    public String numeroConta;
    public float saldo;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public boolean sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public float obterSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6");
        conta.depositar(100);
        conta.sacar(30);

        System.out.println("Saldo atual: " + conta.obterSaldo());
    }
}


