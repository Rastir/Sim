import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int num1, num2, total;

        Scanner s = new Scanner(System.in);

        System.out.println("ingrese un numero:");
        num1 = s.nextInt();

        System.out.println("Ingrese un segundo numero:");
        num2 = s.nextInt();

        total = num1 / num2;

        System.out.println("La suma de los numeros " +  num1 + ", y " + num2 + " es: " + total);
    }
}