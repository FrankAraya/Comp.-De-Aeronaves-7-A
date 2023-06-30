import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);
        
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("El carácter es una vocal.");
        } else {
            System.out.println("El carácter no es una vocal.");
        }
    }
}
