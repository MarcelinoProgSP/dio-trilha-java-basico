package CalculandoInvestimento;

import java.util.Scanner;
import java.util.Locale;
public class CalcularInvestimento {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial * Math.pow((1 + taxaJuros), periodo);
        
        System.out.printf("Valor final do investimento: R$ %.2f ", valorFinal);
        
        scanner.close();
    }
  }