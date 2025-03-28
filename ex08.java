import java.util.Scanner;

public class ex08{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        
        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("Resultado: " + (n1 / n2));
                    } else {
                        System.out.println("Erro: divisão por zero não é permitida."); //divisões  sem 0
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
        
        scanner.close();
    }
}
