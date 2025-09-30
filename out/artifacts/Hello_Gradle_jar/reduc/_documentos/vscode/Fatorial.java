import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número não negativo menor que 100: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero >= 100) {
            System.out.println("Número inválido.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }

        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}