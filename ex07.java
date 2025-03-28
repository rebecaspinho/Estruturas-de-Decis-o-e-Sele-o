import java.util.Scanner;

public class ex07{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a idade do nadador: ");
        int idade = scanner.nextInt();
        
        String categoria;
        if (idade <= 7) {
            categoria = "INFANTIL";
        } else if (idade <= 10) {
            categoria = "JUVENIL";
        } else if (idade <= 15) {
            categoria = "ADOLESCENTE";
        } else if (idade <= 30) {
            categoria = "ADULTO";
        } else {
            categoria = "SENIOR";
        }
        
        System.out.println("A categoria do nadador é: " + categoria);
        
        scanner.close();
    }
}
