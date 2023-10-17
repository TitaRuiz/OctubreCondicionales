import java.util.Scanner;



public class Ejercicio6 {

	public static void main(String[] args) {
		// Solicitar por consola un n�mero m�ximo de dos cifras
		// y escribir como resultado el n�mero en letra

		// 1. Declarar las variables
		int num, unidades, decenas;
		String numLetra = "";
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
				numLetra = "";
				break;
			case 1:
				numLetra = "diez";
				break;
			case 2:
				numLetra = "veinte";
				break;
			case 3:
				numLetra = "treinta";
				break;
			case 4:
				numLetra = "cuarenta";
				break;
			case 5:
				numLetra = "cincuenta";
				break;
			case 6:
				numLetra = "sesenta";
				break;
			case 7:
				numLetra = "setenta";
				break;
			case 8:
				numLetra = "ochenta";
				break;
			case 9:
				numLetra = "noventa";
				break;
			}
			if (decenas != 0 && unidades != 0) {
				numLetra += " y ";
			}
			switch (unidades) {
			case 0:
				if(decenas==0) {
					numLetra = "Cero";
				}
				break;
			case 1:
				if (decenas == 1) {
					numLetra = "once";
				} else {
					numLetra += "uno";
				}
				break;
			case 2:
				if (decenas == 1) {
					numLetra = "doce";
				} else {
					numLetra += "dos";
				}
				break;
			case 3:
				if (decenas == 1) {
					numLetra = "trece";
				} else {
					numLetra += "tres";
				}
				break;
			case 4:
				if (decenas == 1) {
					numLetra = "catorce";
				} else {
					numLetra += "cuatro";
				}
				break;
			case 5:
				if (decenas == 1) {
					numLetra = "quince";
				} else {
					numLetra += "cinco";
				}
				break;
			case 6:
				numLetra += "seis";
				break;
			case 7:
				numLetra += "siete";
				break;
			case 8:
				numLetra += "ocho";
				break;
			case 9:
				numLetra += "nueve";
				break;
			}
		}

		System.out.println("El numero en letra es -> " + numLetra);
		consola.close();
	}

}
