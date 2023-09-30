import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
       
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();
        leitorDeEntradas.close();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <=1100){
            valorImposto = 0.05F * valorSalario;
        }
        else if(valorSalario >= 10100.1 && valorSalario <=2500){
            valorImposto = 0.10F * valorSalario;
        }
        else{
            valorImposto = 0.15F * valorSalario;
        }


float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.printf("%.2f", saida);
    }
}
