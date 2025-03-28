import java.util.Scanner;

public class ex01{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();
        
        double preco;
        if(quantidade >= 12){
            preco = 1.00;
        } else {
            preco = 1.30;
        }
        
        double PrecoTotal = quantidade * preco;
        
        System.out.printf("O custo total da compra é: R$ %.2f\n", PrecoTotal);
        
        scanner.close();
    }
}