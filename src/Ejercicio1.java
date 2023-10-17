import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Solicitar una nota por la consola
		// Mostrar un literal con lo siguiente
		// 0 - 4 -> insuficiente
		// 5 -> suficiente
		// 6 -> bien
		// 7-8  -> notable
		// 9-10 -> sobresaliente
		int nota;
		Scanner consola = new Scanner(System.in);
		System.out.println("Escriba una nota ");
		nota = consola.nextInt();
		//2. Utilizar la estructura
		switch (nota) {
		case 0,1,2,3,4:
			System.out.println("insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("No valido");
			break;
		}
		

	}

	}


