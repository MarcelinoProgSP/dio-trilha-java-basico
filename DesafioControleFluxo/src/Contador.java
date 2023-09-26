import java.util.Scanner;

public class Contador{

    public static void main(String[] args){

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro");

        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parametro");

        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println(" O segundo parametro deve ser maior que o primeiro ");

        }
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();

        } else {
            System.out.println("Iniciando contagem regressiva");
        }

        for (int contagem = parametroDois - parametroUm; contagem > 0; contagem--) {

            System.out.println(contagem);

        }

        System.out.println("A contagem terminou");
        

    }

}