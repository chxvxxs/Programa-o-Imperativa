//Aluno: Matheus Chaves Leôncio de Lira
//Atividade:  
import java.util.Scanner;

public class VetorBusca {
    public static int QTD_VALORES = 10;
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] valores = new int[QTD_VALORES];

        // Solicitar os valores ao usuário
        for (int i = 0; i < QTD_VALORES; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
            valores[i] = ler.nextInt();
        }

        // Verificar se o vetor está ordenado (crescente ou decrescente)
        boolean ordenado = estaOrdenado(valores);
        if (ordenado) {
            System.out.println("O vetor está ordenado.");
        } else {
            System.out.println("O vetor não está ordenado.");
        }

        // Loop para realizar buscas no vetor enquanto o usuário desejar
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite o valor a ser buscado:");
            int valorBuscado = ler.nextInt();

            int posicao;
            if (ordenado) {
                posicao = buscamelhorada(valores, valorBuscado);
            } else {
                posicao = busca(valores, valorBuscado);
            }

            if (posicao != -1) {
                System.out.printf("Valor encontrado na posição %d.\n", posicao);
            } else {
                System.out.println("Valor não encontrado.");
            }

            // Perguntar ao usuário se ele deseja continuar
            System.out.println("Deseja realizar outra busca? (s/n)");
            char resposta = ler.next().charAt(0);
            continuar = (resposta == 's' || resposta == 'S');
        }

        System.out.println("Encerrando o programa...");
        System.out.println("Programa encerrado!");
    }

    // Função de busca simples (linear)
    public static int busca(int[] v, int x) {
        for (int i = 0; i < v.length; ++i) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Função de busca melhorada para vetor ordenado (crescente ou decrescente)
    public static int buscamelhorada(int[] v, int x) {
        boolean crescente = v[0] < v[v.length - 1]; // Verifica se está em ordem crescente

        if (crescente) {
            for (int i = 0; i < v.length; ++i) {
                if (v[i] == x) {
                    return i;
                } else if (v[i] > x) {
                    return -1; // Como está ordenado, se o valor é maior, não precisa continuar
                }
            }
        } else { // Ordem decrescente
            for (int i = 0; i < v.length; ++i) {
                if (v[i] == x) {
                    return i;
                } else if (v[i] < x) {
                    return -1; // Como está ordenado decrescente, se o valor é menor, pare
                }
            }
        }

        return -1; // Se não encontrar o valor
    }

    // Função para verificar se o vetor está ordenado (crescente ou decrescente)
    public static boolean estaOrdenado(int[] v) {
        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 1; i < v.length; ++i) {
            if (v[i] < v[i - 1]) {
                crescente = false; // Não está em ordem crescente
            }
            if (v[i] > v[i - 1]) {
                decrescente = false; // Não está em ordem decrescente
            }
        }

        return crescente || decrescente; // Retorna true se for crescente ou decrescente
    }
}
