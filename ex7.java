import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {

        /*Faça um programa que leia um número e conte quantos divisores tem esse
número. Imprimir na tela a quantidade final de divisores*/

        double numero;
        int divisor = 1, cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor para saberes quantos divisores têm:");
        numero = sc.nextDouble();
    while(divisor<=numero) {
        if (numero % divisor == 0) {
            cont++;
            }
        divisor++;
        }
    System.out.println("O número " + numero + " tem " + cont + " divisores");
    }
}

