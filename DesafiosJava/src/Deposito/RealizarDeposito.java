package Deposito;

import java.util.Locale;
import java.util.Scanner;

public class RealizarDeposito {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valor = scanner.nextDouble();
        scanner.close();
        if (valor > 400) {
            System.out.println("Deposito realizado com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f ", valor);
        } else if (valor != 0) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
            System.out.println("Encerrando o programa...");
        }
    }

}