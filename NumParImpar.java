import java.util.Scanner;

public class NumParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Números pares:");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Números ímpares:");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}