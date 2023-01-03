// Crie um programa EM JAVA que leia um número real, calcule e exiba na tela os valores correspondentes a 5%, 50% e 150% do valor informado com 1, 2 e 3 casas decimais.

import java.util.Scanner;
import java.text.DecimalFormat;

public class question7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double num, percent5, percent50, percent150;

        System.out.print("Digite um número: ");
        num = teclado.nextDouble();

        percent5 = num * 0.05;
        percent50 = num * 0.5;
        percent150 = num * 1.5;

        System.out.println("5% com 1 casa decimal: " + new DecimalFormat("#,##0.0").format(percent5));
        System.out.println("5% com 2 casas decimal: " + new DecimalFormat("#,##0.00").format(percent5));
        System.out.println("5% com 3 casas decimal: " + new DecimalFormat("#,##0.000").format(percent5));

        System.out.println("50% com 1 casa decimal: " + new DecimalFormat("#,##0.0").format(percent50));
        System.out.println("50% com 2 casas decimal: " + new DecimalFormat("#,##0.00").format(percent50));
        System.out.println("50% com 3 casas decimal: " + new DecimalFormat("#,##0.000").format(percent50));

        System.out.println("150% com 1 casa decimal: " + new DecimalFormat("#,##0.0").format(percent150));
        System.out.println("150% com 2 casas decimal: " + new DecimalFormat("#,##0.00").format(percent150));
        System.out.println("150% com 3 casas decimal: " + new DecimalFormat("#,##0.000").format(percent150));
    }   
}
