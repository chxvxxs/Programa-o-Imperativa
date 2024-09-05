import java.util.Scanner;

public class CalculoINSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o Valor do seu salário bruto: ");
        double salario = scanner.nextDouble();

        double valInss = 0;

        if (salario <= 1399.12) {
            valInss = salario * 0.075;
        } else if (salario <= 2331.88) {
            valInss = salario * 0.09;
        } else if (salario <= 4663.75) {
            valInss = salario * 0.12;
        } else {
            valInss = salario * 0.14;
        }

        double salarioLiquido = salario - valInss;

        System.out.printf("Valor da contribuição ao INSS: %.2f\n", valInss);
        System.out.printf("Salário líquido: %.2f\n", salarioLiquido);
    }
}
