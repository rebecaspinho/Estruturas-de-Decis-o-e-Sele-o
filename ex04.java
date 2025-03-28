import java.util.Scanner;

public class ex04{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a dureza do aço: ");
        double dureza = scanner.nextDouble();
        
        System.out.print("Informe o teor do carvão: ");
        double teor = scanner.nextDouble();
        
        System.out.print("Informe a resistência de tração do aço: ");
        double tracao = scanner.nextDouble();
        
        boolean cond1 = dureza > 50;
        boolean cond2 = teor < 0.7;
        boolean cond3 = tracao > 5600;
        
        int pontuacao;
        if (cond1 && cond2 && cond3) {
            pontuacao = 10;
        } else if (cond1 && cond2) {
            pontuacao = 9;
        } else if (cond2 && cond3) {
            pontuacao = 8;
        } else if (cond1 && cond3) {
            pontuacao = 7;
        } else if (cond1 || cond2 || cond3) {
            pontuacao = 6;
        } else {
            pontuacao = 5;
        }
        
        // Exibe a pontuação do aço
        System.out.println("Pontuação do aço: " + pontuacao);
        
        scanner.close();
    }
}