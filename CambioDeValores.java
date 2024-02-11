import java.util.Scanner;

public class CambioDeValores {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 1;
        int auxiliar;


        System.out.println("--------------antes---------------");
        System.out.println("Numeros ingresados: " + num1 + " y " + num2);

        System.out.println("--------------despues---------------");

        auxiliar = num2;
        num2 = num1;
        num1 = auxiliar;

        System.out.println("Numeros ingresados: " + num1 + " y " + num2);

    }
}
