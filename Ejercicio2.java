import  java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num1 = input.nextInt();
        while (num1 <=0){
            System.out.println("Ingrese un numero entero");
        }
        System.out.println("Ingrese otro numero");
        int num2 = input.nextInt();
        while (num2 <=0){
            System.out.println("Ingrese un numero entero");
        }
        float resultado = num1 / num2; 
      if (resultado >0);{
        System.out.println("Los numeros son multiplos" + resultado);
      }
      else {
        System.out.println("Los numeros no son multiplos");
      }
    }
}
