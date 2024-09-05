import java.util.Scanner;

public class CalculoIR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu salário bruto: ");
        double salario = scanner.nextDouble();

        double impostoRenda = 0;

        if (salario <= 1903.98) {
            impostoRenda = 0;
        } else if (salario <= 2826.65) {
            impostoRenda = salario * 0.075 - 142.80;
        } else if (salario <= 3751.05) {
            impostoRenda = salario * 0.15 - 354.80;
        } else if (salario <= 4664.68) {
            impostoRenda = salario * 0.225 - 636.13;
        } else {
            impostoRenda = salario * 0.275 - 869.36;
        }

        System.out.printf("Valor do imposto de renda: %.2f\n", impostoRenda);
    }
}
