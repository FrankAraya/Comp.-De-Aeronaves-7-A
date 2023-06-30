import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la posición obtenida: ");
        int posicion = scanner.nextInt();
        
        String medalla;
        
        switch (posicion) {
            case 1:
                medalla = "medalla de oro";
                break;
            case 2:
                medalla = "medalla de plata";
                break;
            case 3:
                medalla = "medalla de bronce";
                break;
            default:
                medalla = "sigue participando";
                break;
        }
        
        System.out.println("Usted ha obtenido la " + medalla + ".");
    }
}
