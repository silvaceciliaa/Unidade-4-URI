import java.io.IOException;
import java.util.Scanner;

public class SelectionTest1 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite A: ");
        int A = scanner.nextInt();

        System.out.println("Digite B: ");
        int B = scanner.nextInt();

        System.out.println("Digite C: ");
        int C = scanner.nextInt();

        System.out.println("Digite D: ");
        int D = scanner.nextInt();

        int cPlusD = C + D;

        int aplusB = A + B;

        if(B > C && D > A && cPlusD > aplusB && C >= 0 && D >= 0 && (A % 2 == 0)) {
            System.out.println("Valores Aceitos");
        }
        else{
            System.out.println("Valores não aceitos");
        }
        scanner.close();
 
    }
 
}