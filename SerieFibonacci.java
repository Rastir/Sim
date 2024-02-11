import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numCont, aux = 0;
        int num1 = 0;
        int num2 = 1;

        System.out.println("Ingrese el numero de fibonacci a calcular");
        numCont = s.nextInt();

        for(int i =0 ; i < numCont ; i++) {
            if (i == 0) {
                System.out.println("0");
            } else if (i == 1) {
                System.out.println("1");
            } else {
                System.out.println("La suma de " + num1 + " más " + num2 + " es de : ");
                System.out.println(num1 + num2);
                aux = num1 + num2;
                num1 = num2;
                num2 = aux;

            }
        }
    }
}