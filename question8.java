/* Faça um programa, usando SWITCH, que receba dois números e execute as operações listadas a seguir, de acordo com a escolha.
Operações com SWITCH:
a) Operação 1: A soma de dois números
b) Operação 2: A subtração de dois números
c) Operação 3: A multiplicação de dois números
d) Operação 4: A divisão de dois números
Se a opção digitada for inválida, mostre uma mensagem de erro e termine a execução do programa. */

import java.util.Scanner;

public class question8 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double num1, num2, sum, sub, multi, div;
        int opera = 0;

        System.out.println("-----------------------------------------");
        System.out.println("| Bem-vindo a calculadora de operações! |");
        System.out.println("-----------------------------------------");

        while (opera != 5) {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            opera = teclado.nextInt();

            if (opera == 5){
                System.out.println("Programa finalizado!");
            } else {
                System.out.print("Digite o primeiro número: ");
                num1 = teclado.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = teclado.nextDouble();

                switch (opera) {
                    case 1:
                    sum = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + sum);
                    break;

                    case 2:
                    sub = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + sub);
                    break;

                    case 3:
                    multi = num1 * num2;
                    System.out.println(num1 + " x " + num2 + " = " + multi);
                    break;

                    case 4:
                    div = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + div);
                    break;

                    default:
                    System.out.println("Operação inválida!");
                    opera = 5;
                }
            }
        }
    }
}