import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        int [][] matriz = new int[3][3];
        Scanner s = new Scanner(System.in);

        for(int f=0; f < 3; f++){
            for (int c=0; c<3; c++){
                System.out.println("ingrese un numero");
                matriz[f][c] = s.nextInt();
            }
        }

        for(int f=0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("posicionado en la fila : " + f + ", y la columna  " + c);
                System.out.println("Valor : " + matriz[f][c]);
            }
        }
    }
}
