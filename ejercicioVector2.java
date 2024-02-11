import java.util.Scanner;

public class ejercicioVector2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] vector = new String[4];

        for (int f = 0; f < 4; f++) {
            System.out.println("Ingrese un nombre : ");
            vector[f] = s.nextLine();
        }

        for (int f = 0; f < 4; f++) {
            System.out.println("Los nombre ingresado en la fila : " + f + " es : " + vector[f]);
        }
    }
}
