import java.util.Scanner;

public class ex10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o salário do funcionário: ");
        double salario = scanner.nextDouble();
        
        final double maxSalario = 1000.00;
        final double porcentAumento = 0.30;
        
        if (salario < maxSalario){
            double novoSalario = salario + (salario * porcentAumento);
            System.out.printf("O salário reajustado é: R$ %.2f\n", novoSalario);
        } else {
            System.out.println("O funcionário não tem direito ao aumento.");
        }
        scanner.close();
    }
}
