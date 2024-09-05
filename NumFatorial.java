import java.util.Scanner;

public class NumFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número deve ser positivo.");
            return;
        }

        int fatorial = 1;
        int i = numero;

        while (i > 0) {
            fatorial *= i;
            i--;
        }

        System.out.println("Fatorial de " + numero + " é " + fatorial);
    }
}
