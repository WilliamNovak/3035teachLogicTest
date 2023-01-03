// Escreva um programa EM JAVA que lê três números reais, calcule e apresente a soma e a média dos números informados com 2 casas depois da vírgula.

import java.util.Scanner;
import java.text.DecimalFormat;

public class question6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float num1, num2, num3, sum, med;

        System.out.print("Digite o primeiro número: ");
        num1 = teclado.nextFloat();
        System.out.print("Digite o segundo número: ");
        num2 = teclado.nextFloat();
        System.out.print("Digite o terceiro número: ");
        num3 = teclado.nextFloat();

        sum = num1 + num2 + num3;
        med = sum / 3;

        System.out.println("Soma: " + new DecimalFormat("#,##0.00").format(sum));
        System.out.println("Média: " + new DecimalFormat("#,##0.00").format(med));
    }
}