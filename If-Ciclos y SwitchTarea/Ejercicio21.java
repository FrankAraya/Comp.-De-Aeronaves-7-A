import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la categoría del empleado (A, B o C): ");
        String categoria = scanner.nextLine().toUpperCase();
        
        System.out.print("Ingrese la antigüedad del empleado (en años): ");
        int antiguedad = scanner.nextInt();
        
        System.out.print("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = scanner.nextDouble();
        
        double sueldoNeto = sueldoBruto;
        
        switch (categoria) {
            case "A":
                sueldoNeto += 1000;
                break;
            case "B":
                sueldoNeto += 2000;
                break;
            case "C":
                sueldoNeto += 3000;
                break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }
        
        if (antiguedad >= 1 && antiguedad <= 5) {
            sueldoNeto *= 1.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            sueldoNeto *= 1.10;
        } else if (antiguedad > 10) {
            sueldoNeto *= 1.30;
        }
        
        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);
    }
}
