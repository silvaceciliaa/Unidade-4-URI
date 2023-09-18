import java.io.IOException;
import java.util.Scanner;

public class GameDuration {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        int duracao;
        
        System.out.println("Horário em que o jogo iniciou");
        int horarioInicio = scanner.nextInt();

        System.out.println("Horário em que o jogo acabou");
        int horarioFim = scanner.nextInt();

        if (horarioInicio < horarioFim) {
            duracao = horarioFim - horarioInicio;
        }
        else {
            duracao = 24 - horarioInicio + horarioFim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scanner.close();
    }
 
} 
