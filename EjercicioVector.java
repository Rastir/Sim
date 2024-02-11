import java.util.Scanner;

public class EjercicioVector {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] vector = new int[15];
        int contador =0;

        for (int i = 0; i< vector.length; i++){
            System.out.println("Ingresar un numero : ");
            vector[i] = s.nextInt();
        }

        for (int i = 0; i< vector.length; i++){
            if (vector[i] == 3){
                contador++;
            }
        }
        System.out.println("la cantidad de numeros '3' encontrados fueron : " + contador);
    }
}
