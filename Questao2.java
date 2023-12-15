import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura a ser transformada");
        double temperaturaDigitada = Double.parseDouble(sc.nextLine());
        System.out.println(" Qual a unidade de origem dessa temperatura? [C, K, F]");

        String unidadeEntrada = sc.nextLine();
       
        if (!unidadeEntrada.equals( "C") && !unidadeEntrada.equals("F")  && !unidadeEntrada.equals("K") ) {
            System.out.println("entrada especificada não é válida.");
             System.exit(0); 
        }
        System.out.println(" Qual a unidade de destino dessa temperatura? [C, K, F]");
        String unidadeSaida = sc.nextLine();
        if (!unidadeSaida.equals( "C") && !unidadeSaida.equals("F")  && !unidadeSaida.equals("K")) {
            System.out.println("entrada especificada não é válida." );
            System.exit(0); 
            
        }
        double resultadoConversao = 0.0;
        if (unidadeEntrada.equals("C")) {
            switch (unidadeSaida) {
                case "K":
                    resultadoConversao = 273.15 + temperaturaDigitada;
                    System.out.printf("%.2f C = %.2f K", temperaturaDigitada, resultadoConversao);
                    break;
                case "F":
                    resultadoConversao = (temperaturaDigitada * 9 / 5) + 32;
                    System.out.printf("%.2f C = %.2f F", temperaturaDigitada, resultadoConversao);
                    break;
                default:
                    break;
            }

        } else if (unidadeEntrada.equals("K")) {
            switch (unidadeSaida) {
                case "C":
                    resultadoConversao = temperaturaDigitada - 273.15;
                    System.out.printf("%.2f K = %.2f C", temperaturaDigitada, resultadoConversao);
                    break;
                case "F":
                    resultadoConversao = ((temperaturaDigitada - 273.15) * 9 / 5) + 32;
                    System.out.printf("%.2f K = %.2f F", temperaturaDigitada, resultadoConversao);
                    break;
                default:
                    break;
            }

        } else if (unidadeEntrada.equals("F")) {
            switch (unidadeSaida) {
                case "C":
                    resultadoConversao = (temperaturaDigitada - 32) * 5 / 9;
                    System.out.printf("%.2f F = %.2f C", temperaturaDigitada, resultadoConversao);
                    break;
                case "K":
                    resultadoConversao = 273.15 + (temperaturaDigitada - 32) * 5 / 9;
                    System.out.printf("%.2f F = %.2f K", temperaturaDigitada, resultadoConversao);
                    break;
                default:
                    break;
            }

        }

    }

}
