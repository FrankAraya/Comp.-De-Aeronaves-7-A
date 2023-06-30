import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tipo de auto (a, b o c): ");
        char tipo = scanner.next().charAt(0);
        
        String caracteristicas;
        
        switch (tipo) {
            case 'a':
                caracteristicas = "4 ruedas y un motor";
                break;
            case 'b':
                caracteristicas = "4 ruedas, un motor, cierre centralizado y aire";
                break;
            case 'c':
                caracteristicas = "4 ruedas, un motor, cierre centralizado, aire y airbag";
                break;
            default:
                caracteristicas = "características no disponibles";
                break;
        }
        
        System.out.println("El auto de tipo " + tipo + " tiene las siguientes características: " + caracteristicas);
    }
}
