import  java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    System.out.println("Igrese el dia ");
    int dia = input.nextInt();

    System.out.println("Igrese el mes ");
    int mes = input.nextInt();

    System.out.println("Igrese el año");
    int año = input.nextInt();

    boolean fechacorrecta = true;
        if (dia < 1 || dia > 30 || mes < 1 || mes > 12 || año < 1 || año > 9999 ){
         fechacorrecta = true;
        }
        
    }
}
