import  java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num;
        int cuadrado;
        do{
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es " + cuadrado);
        }while (num >= 0);
        System.out.println("Ha ingresado un numero fuera de nuestro rango. Fin del programa");
    }
}