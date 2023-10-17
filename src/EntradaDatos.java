import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        //1. Declaración de variables - primitivas o instancia
        int numero;
        Scanner tecladoEntrada = new Scanner(System.in);
        System.out.println("Escriba un numero ->");
        numero = tecladoEntrada.nextInt();
        System.out.println("El numero que se leyó fue -> " + numero);
        //Recibiendo por consola el sueldo
        double sueldo;
        System.out.println("Escriba un sueldo");
        sueldo = tecladoEntrada.nextDouble();
        System.out.println("El numero que se leyó fue -> " + sueldo);

    }
}
