import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        /*Faça um carrinho de compras para um cliente. Enquanto o cliente desejar inserir
produtos, solicite o nome do produto, a quantidade e o valor unitário. O
programa deve mostrar ao final, o valor a ser pago pelo cliente*/

        Scanner scanner = new Scanner(System.in);

        double totalCompra = 0.0;

        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o nome do produto (ou 'sair' para encerrar a compra): ");
            String produto = scanner.nextLine();

            if (produto.equalsIgnoreCase("sair")) {
                continuar = false;
                continue;
            }

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            System.out.print("Digite o valor unitário: ");
            double valorUnitario = scanner.nextDouble();

            scanner.nextLine(); // consumir a quebra de linha deixada pelo nextDouble()

            double valorTotal = quantidade * valorUnitario;
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor unitário: R$ " + valorUnitario);
            System.out.println("Valor total: R$ " + valorTotal);

            totalCompra += valorTotal;
        }

        System.out.println("Total da compra: R$ " + totalCompra);
    }
}
