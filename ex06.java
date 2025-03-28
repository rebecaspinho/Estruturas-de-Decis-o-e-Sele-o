import java.util.Scanner;

public class ex06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int maiorIdade = 18;
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= maiorIdade) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        
        String resultado = (idade >= maiorIdade) ? "Você é maior de idade." : "Você é menor de idade.";
        System.out.println("Usando operador ternário" + resultado);
        
        scanner.close();
    }
}
