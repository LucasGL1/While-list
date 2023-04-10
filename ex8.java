import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int fatorial = 1;
        int i = 1;
        while (i <= num) {
            fatorial *= i;
            i++;
        }

        System.out.println(num + "! = " + fatorial);
    }
}
