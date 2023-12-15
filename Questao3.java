import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número impar para determinar o tamanho do triângulo:");
        int tamanhoTriangulo = scanner.nextInt();
        if(tamanhoTriangulo%2!=1){
            System.out.println("Isso não é um numero impar ");
            System.exit(0);
        }

        desenharTrianguloSuperior(tamanhoTriangulo);

System.out.println("");

         desenharTrianguloSuperior(tamanhoTriangulo);
        desenharTrianguloInferior(tamanhoTriangulo - 1);
    }

    private static void desenharTrianguloSuperior(int tamanho) {
        for (int linha = 0; linha < tamanho / 2 + 1; linha++) {
            for (int espaco = 0; espaco < tamanho / 2 - linha; espaco++) {
                System.out.print(" ");
            }
            for (int asterisco = 0; asterisco < 2 * linha + 1; asterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void desenharTrianguloInferior(int tamanho) {
        for (int linha = tamanho / 2; linha > 0; linha--) {
            for (int espaco = 0; espaco < tamanho / 2 - linha + 1; espaco++) {
                System.out.print(" ");
            }
            for (int asterisco = 0; asterisco < 2 * linha - 1; asterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
