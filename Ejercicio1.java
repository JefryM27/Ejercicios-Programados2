import java.util.Scanner;

public class Ejercicio7 {

    public static void public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
System.out.println ("Ingrese un numero");
int  num = entrada.nextInt();
while (num==0){ 
System.out.println ("Ingrese un numero diferente a cero");
num = entrada.nextInt();
} 
If (num >=0);{
    System.out.println ("El numero es positivo:" + num);
}
else {
    System.out.println ("El numero es negativo:" + num);
}
    }
}