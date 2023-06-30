import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Jugador 1: ");
        int jugador1 = scanner.nextInt();
        System.out.print("Jugador 2: ");
        int jugador2 = scanner.nextInt();
        
        if ((jugador1 == 0 && jugador2 == 2) || 
            (jugador1 == 1 && jugador2 == 0) || 
            (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("El jugador 1 gana");
        } else if ((jugador2 == 0 && jugador1 == 2) || 
                   (jugador2 == 1 && jugador1 == 0) || 
                   (jugador2 == 2 && jugador1 == 1)) {
            System.out.println("El jugador 2 gana");
        } else {
            System.out.println("Empate");
        }
    }
}
