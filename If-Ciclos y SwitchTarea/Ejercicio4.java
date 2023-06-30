import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una categoría (a, b o c): ");
        String categoria = scanner.nextLine();
        
        switch (categoria.toLowerCase()) {
            case "a":
                System.out.println("Hijo");
                break;
            case "b":
                System.out.println("Padres");
                break;
            case "c":
                System.out.println("Abuelos");
                break;
            default:
                System.out.println("Categoría inválida");
        }
    }
}
