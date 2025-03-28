import java.util.Scanner;

public class ex05{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        final double salarioMinimo = 1518.00; 
        
        System.out.print("Informe o seu salário: ");
        double salario = scanner.nextDouble();
    
        if (salario >= salarioMinimo) {
            System.out.println("Você está ganhando pelo menos o salário mínimo.");
        } else {
            System.out.println("Você está ganhando menos que o salário mínimo.");
        }
        scanner.close();
    }
}
