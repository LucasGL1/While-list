public class ex2 {

    /*2) Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
    metro e cresce 3 centímetros por ano. Construa um programa que calcule e exiba
    quantos anos serão necessários para que Zé seja maior que Chico.*/

    public static void main(String[] args) {
        int cont = 0;
        double chico = 1.5, ze = 1.10;

        while(chico>=ze) {
            chico += 0.02;
            ze += 0.03;
            cont++;
        }
    System.out.println("Serão necessários " + cont + (" anos para zé alcançar chico"));
    }
}
