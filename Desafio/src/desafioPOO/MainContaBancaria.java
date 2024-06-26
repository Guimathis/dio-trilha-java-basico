package desafioPOO;

import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();
        ContaBancariaSimples conta = new ContaBancariaSimples(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancariaSimples {
    private double saldo;

    public ContaBancariaSimples(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        // Se sim, atualizar o saldo e imprimir "Saque feito."
        // Se não, imprimir "Saldo insuficiente. Saque não realizado."
        if(saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque feito.");
        } else
            System.out.println("Saldo insuficiente. Saque não realizado.");
        imprimirSaldo();
    }
    
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}