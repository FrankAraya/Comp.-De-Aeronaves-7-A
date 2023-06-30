import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de un mes: ");
        String mes = scanner.nextLine();
        
        switch (mes.toLowerCase()) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println(mes + " tiene 31 días");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println(mes + " tiene 30 días");
                break;
            case "febrero":
                System.out.println(mes + " tiene 28 o 29 días");
                break;
            default:
                System.out.println("Mes inválido");
        }
    }
}
