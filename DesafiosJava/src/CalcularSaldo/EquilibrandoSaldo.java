package CalcularSaldo;

import java.util.Scanner;

public class EquilibrandoSaldo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor do seu saldo");
    double saldoAtual = scanner.nextDouble();
    System.out.println("Digite o valor que deseja depositar");
    double valorDeposito = scanner.nextDouble();
    System.out.println("Digite o valor que deseja retirar");
    double valorRetirada = scanner.nextDouble();
    calcularSaldo(saldoAtual, valorDeposito, valorRetirada);
    scanner.close();
  }

  static void calcularSaldo(double saldoAtual, double valorDeposito, double valorRetirada) {

    if (saldoAtual + valorDeposito < valorRetirada) {
      saldoAtual = saldoAtual + valorDeposito;
      System.out.println("O saldo atual e insufuciente" + saldoAtual);
    } else {
      saldoAtual = saldoAtual + valorDeposito - valorRetirada;
      System.out.printf("Seu saldo atual é : %.1f ", saldoAtual);
    }

  }
}
