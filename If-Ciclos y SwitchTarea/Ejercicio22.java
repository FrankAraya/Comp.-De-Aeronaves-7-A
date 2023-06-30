import java.util.Random;

public class Ejercicio22 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int contador = 0;
        while (contador < 10) {
            String categoria;
            double sueldoBruto;
            
            // Generar categoría aleatoria
            int categoriaAleatoria = random.nextInt(3); // Genera un número aleatorio entre 0 y 2
            switch (categoriaAleatoria) {
                case 0:
                    categoria = "A";
                    break;
                case 1:
                    categoria = "B";
                    break;
                case 2:
                    categoria = "C";
                    break;
                default:
                    categoria = "";
                    break;
            }
            
            // Generar sueldo bruto aleatorio entre 1000 y 5000
            sueldoBruto = 1000 + random.nextDouble() * (5000 - 1000);
            
            int antiguedad = random.nextInt(15) + 1; // Genera un número aleatorio entre 1 y 15
            
            System.out.println("Empleado " + (contador + 1));
            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.println("Sueldo bruto: " + sueldoBruto);
            
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
            
            System.out.println("Sueldo neto: " + sueldoNeto);
            System.out.println();
            
            contador++;
        }
    }
}
