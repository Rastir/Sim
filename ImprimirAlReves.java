import java.util.Scanner;

public class ImprimirAlReves {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("introduce un un numero ");
        long numero = s.nextLong();

        long aux =0;

        while (numero != 0){
            aux = (aux*10) + (numero%10);

            numero/=10;

        }
        System.out.println("El numero al reves es : " + aux );
    }
}
