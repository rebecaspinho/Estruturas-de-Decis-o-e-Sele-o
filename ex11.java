import java.util.Scanner;

public class ex11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do lado X: ");
        double x = scanner.nextDouble();
        
        System.out.print("Digite o valor do lado Y: ");
        double y = scanner.nextDouble();
        
        System.out.print("Digite o valor do lado Z: ");
        double z = scanner.nextDouble();
        
        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                System.out.println("O triângulo é Equilátero.");
            } else if (x == y || y == z || x == z) {
                System.out.println("O triângulo é Isósceles.");
            } else {
                System.out.println("O triângulo é Escaleno.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
        scanner.close();
    }
}
