import java.util.Scanner;

public class ex09{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número entre 1 e 12 para ver o mês: ");
        int numeroMes = scanner.nextInt();
        
        String mes;
        switch (numeroMes){
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Número inválido! Não existe mês correspondente.";
        }
        
        System.out.println(mes);
        
        scanner.close();
    }
}
