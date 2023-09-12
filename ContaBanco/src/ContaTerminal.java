
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Digite seu nome");
            String nomeCliente = scanner.next();

            System.out.println("Digite sua conta");
            int numero = scanner.nextInt();

            System.out.println("Digite sua agencia");
            int agencia = scanner.nextInt();

            System.out.println("Deposito inicial");
            double depositar = scanner.nextDouble();

            double saldo = depositar;

            System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        }

    }
}