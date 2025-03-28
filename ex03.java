import java.util.Scanner; 

public class ex03{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        
        System.out.print("Informe o débito da conta: ");
        double debito = scanner.nextDouble();
        
        System.out.print("Informe o crédito da conta: ");
        double credito = scanner.nextDouble();
        
        double saldoAtual = saldo - debito + credito;
        
        if (saldoAtual >=0 ){
            System.out.println("Saldo positivo");
        } else {
            System.out.println("Saldo negativo");
        }
        
        // Operador Ternário para a verificação
        String mensagemSaldo = (saldoAtual >= 0) ? "Saldo Positivo" : "Saldo negativo";
        System.out.println("Mensagem:" + mensagemSaldo);
        
        scanner.close();
    }
}