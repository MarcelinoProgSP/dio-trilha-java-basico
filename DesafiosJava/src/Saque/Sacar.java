package Saque;

import java.util.Scanner;

public class Sacar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        calcularSaldo(saldoTotal, valorSaque);
        scanner.close();
        
    }

    static void calcularSaldo(int saldoTotal, int valorSaque) {
        int saldoDisponivel;
        if (saldoTotal > valorSaque) {
            saldoDisponivel = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoDisponivel);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }
}