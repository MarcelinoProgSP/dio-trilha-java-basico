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
            System.out.println("Iniciando contagem ");
        }

        for ( int contar = 0, contagem = parametroDois - parametroUm;  contagem  != contar;) {
            contar++;
         
            System.out.println(contar);

        }

        System.out.println("A contagem terminou");
        

    }

}