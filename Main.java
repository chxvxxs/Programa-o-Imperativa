public class Main {
    public static void main(String[] args) {
        numUmACemVirgula();
        somaImparDezACem();
        multiplosTresNaoTerminamTres();
    }

    public static void numUmACemVirgula() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            result.append(i);
            if (i < 100) {
                result.append(", ");
            }
        }
        System.out.println("Todos os números de um até cem : " + result);
    }

    public static void somaImparDezACem() {
        int sum = 0;
        for (int i = 11; i < 1000; i += 2) { //Começando com o 11, pois 11 é o primeiro ímpar acima de dez
            sum += i;
        }
        System.out.println("Soma de todos ímpares entre 10 e 1000: " + sum);
    }

    public static void multiplosTresNaoTerminamTres() {
        StringBuilder result = new StringBuilder();
        for (int i = 3; i <= 100; i += 3) {
            if (i % 10 != 3) {
                result.append(i);
                if (i < 100) {
                    result.append(", ");
                }
            }
        }
        System.out.println("Exibindo todos os múltiplos de 3 que não terminam em 3: " + result);
    }
}
