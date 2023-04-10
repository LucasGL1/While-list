import java.util.Scanner;
public class ex1 {

//1) Leia 4 valores, faça a soma e o produto desses valores lidos. Mostre na tela.
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cont = 1;
            double soma = 0;
            double produto = 1;

    while (cont <= 4) {
        System.out.println("Digite o " + cont + "° valor");
        double valor = sc.nextDouble();
        soma += valor;
        produto *= valor;
        cont++;
        }
    System.out.println("A soma dos valores é: " + soma);
    System.out.println("O produto dos valores é: " + produto);
    }

}