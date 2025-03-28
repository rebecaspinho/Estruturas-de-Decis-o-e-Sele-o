import java.util.Scanner;

public class ex12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cardápio");
        System.out.println("1 - Macarrão");
        System.out.println("2 - Pizza");
        System.out.println("3 - Hambúrguer");
        System.out.println("4 - Salada");
        System.out.print("Escolha uma opção (1 a 4): ");
        
        int opcao = scanner.nextInt();
        
        String prato;
        switch (opcao) {
            case 1:
                prato = "Macarrão";
                break;
            case 2:
                prato = "Pizza";
                break;
            case 3:
                prato = "Hambúrguer";
                break;
            case 4:
                prato = "Salada";
                break;
            default:
                prato = "Opção inválida! Escolha um número de 1 a 4.";
        }
        
        System.out.println("O seu prato de escolha é: " + prato);
        
        scanner.close();
    }
}
