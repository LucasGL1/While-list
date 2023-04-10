import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {

        /*3) Faça um programa que leia 6 valores inteiros e, ao final, escreva o maior e o
menor valor informado.*/

        Scanner sc = new Scanner(System.in);
        int cont = 1;
        double valor = 0;
        double menor = 999;
        double maior = -999;

    while(cont<=6) {
        System.out.println("Digite o " + cont + "° valor");
        valor = sc.nextDouble();
        if(valor>maior) maior=valor;
        if(valor<menor) menor=valor;
        cont++;
        }
    System.out.println("O maior valor foi: " + maior);
    System.out.println("E o menor valor foi: " + menor);
    }
}
