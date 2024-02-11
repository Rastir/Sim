import java.util.Scanner;

public class PalabrasCentinela {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese palabra: ");
        String centinela = s.next();

        while (!centinela.equalsIgnoreCase("Salir")) {
            System.out.println("La palabra es : " + centinela);
            centinela =s.next();
        }
    }
}
