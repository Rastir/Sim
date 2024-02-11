import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {

        int[] vector = new int[5];
        Scanner s = new Scanner(System.in);

        for (int i =0; i < vector.length; i++){
            System.out.println("ingrese un numero");
            vector[i] = s.nextInt();
        }

        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }

    }
}
