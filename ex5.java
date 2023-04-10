public class ex5 {
    public static void main(String[] args) {

        /*Faça um programa que gere os números de 1000 a 1999 e escreva aqueles que
divididos por 11 dão resto igual a 5*/

        int num = 1000;

        while(num<=1999) {
            if (num % 11 == 5) {
                System.out.println(num);
            }
            num++;
        }
    }
}
