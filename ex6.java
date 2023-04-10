import java.util.Scanner;
public class ex6 {
    public static void main(String[] agrs){

        /* Faça um programa que leia a altura de 6 alunos e ao final, escreva a maior altura.*/

        double altura, maior = 0;
        int cont = 1;
        Scanner sc = new Scanner(System.in);

        while(cont<=6) {
            System.out.println("Dê a altura do " + cont + "° aluno");
            altura = sc.nextDouble();
            if (altura>maior) maior = altura;
            cont++;
        }
    System.out.println("A altura do maior aluno é: " + maior);
    }
}
