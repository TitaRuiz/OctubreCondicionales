import java.util.Scanner;



public class Ejercicio6 {

	public static void main(String[] args) {
		// Solicitar por consola un n�mero m�ximo de dos cifras
		// y escribir como resultado el n�mero en letra

		// 1. Declarar las variables
		int num, unidades, decenas;
		Scanner consola = new Scanner(System.in);

		// 2. Solicitar el dato por la consola
		System.out.println("Escriba un numero maximo de dos cifras");
		num = consola.nextInt();

		// 3. Validar que sea de dos cifras

		if (num < 0 || num > 99) {
			System.out.println("El numero no es valido");
		} else {
			unidades = num % 10;
			decenas = num / 10;
			switch (decenas) {
			case 0:

				break;
			case 1:
				System.out.println("Diez ");
				break;
			case 2:
				System.out.println("Veinte ");
				break;
			case 3:
				System.out.println("Treinta ");
				break;
			case 4:
				System.out.println("Cuarenta");
				break;
			case 5:
				System.out.println("Cincuenta");
				break;
			case 6:
				System.out.println("Sesenta");
				break;
			case 7:
				System.out.println("Setenta ");
				break;
			case 8:
				System.out.println("Ochenta");
				break;
			case 9:
				System.out.println("Noventa ");
				break;
			}
			if (decenas != 0 && unidades != 0) {
				System.out.println(" y ");
			}
			switch (unidades) {
			case 0:
				if(decenas==0) {
					System.out.println("Cero");;
				}
				break;
			case 1:

				System.out.println("uno");

				break;
			case 2:


				System.out.println("dos");

				break;
			case 3:
				System.out.println("tres");
				break;
			case 4:
				System.out.println("cuatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;
			case 6:
				System.out.println("Seis");
				break;
			case 7:
				System.out.println( "siete");
				break;
			case 8:
				System.out.println("Ocho");
				break;
			case 9:
				System.out.println("Nueve");
				break;
			}
		}


		consola.close();
	}

}
