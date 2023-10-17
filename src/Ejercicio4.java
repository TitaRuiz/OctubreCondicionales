import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Pedir el día, mes, año y decir si es correcta
        Scanner tecladoEntrada = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Escriba el día");
        dia = tecladoEntrada.nextInt();
        System.out.println("Escriba el mes");
        mes = tecladoEntrada.nextInt();
        System.out.println("Escriba el año");
        anio = tecladoEntrada.nextInt();
        //Evaluar
        switch (mes){
            case 1,2,3,4,5,6,7,8,9,10,11,12:
                if (dia >= 1 && dia <= 30) {
                    ++dia;
                    if(dia<=30){
                        System.out.println("Fecha del siguiente dia " + dia + "/" + mes +"/" + anio);
                    }else{
                        dia=1;
                        System.out.println("Fecha del siguiente dia " + dia + "/" + ++mes +"/" + anio);
                    }
                }else {
                    System.out.println("El día no está dentro del rango");
                }
                break;
            default:
                System.out.println("El mes no está dentro del rango de 1 a 12");
        }



    }
}
