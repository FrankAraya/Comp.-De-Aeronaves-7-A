import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingresa la primera nota");
        int Nota1 = scanner.nextInt();

        System.out.println("Ingresa la segunda nota");
        int Nota2 = scanner.nextInt();

        System.out.println("Ingresa la tercera nota");
        int Nota3 = scanner.nextInt();

        int sumaPares = 0;

        if (Nota1 % 2 == 0) {
            sumaPares += Nota1;
        }
        if (Nota2 % 2 == 0) {
            sumaPares += Nota2;
        }
        if (Nota3 % 2 == 0) {
            sumaPares += Nota3;
        }

        System.out.println("Suma de los valores pares (con if): " + sumaPares);

        sumaPares = (Nota1 % 2 == 0 ? Nota1 : 0) +
                        (Nota2 % 2 == 0 ? Nota2 : 0) +
                        (Nota3 % 2 == 0 ? Nota3 : 0);

        System.out.println("Suma de los valores pares (algortimica): " + sumaPares);
    }
}
