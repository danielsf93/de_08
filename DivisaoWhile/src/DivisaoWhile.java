import java.util.Scanner;

public class DivisaoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2;

        // INÍCIO
        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor (ou 0 para encerrar): ");
        valor2 = scanner.nextDouble();

        // ENQUANTO o segundo valor não for igual a 0:
        while (valor2 != 0) {
            // Dividir o primeiro valor pelo segundo valor
            System.out.println("Resultado: " + (valor1 / valor2));

            // Ler o primeiro valor
            System.out.println("Digite o primeiro valor: ");
            valor1 = scanner.nextDouble();

            // Ler o segundo valor (ou 0 para encerrar)
            System.out.println("Digite o segundo valor (ou 0 para encerrar): ");
            valor2 = scanner.nextDouble();
        }
        // Mostrar "Programa encerrado"
        System.out.println("Programa encerrado.");
        scanner.close();
        // FIM
    }
}
