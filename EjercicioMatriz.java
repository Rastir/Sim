import java.util.Scanner;

public class EjercicioMatriz {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double[][] matriz = new double[4][4];
        double suma = 0.0;


        for(int f = 0; f < matriz.length; f++){
            for (int c = 0; c < 3; c++ ){
                System.out.println("Ingrese el alumno n° " + f);
                matriz[f][c] = s.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }
        for(int f = 0; f < matriz.length; f++) {
            System.out.println("Las notas del alumno n° : " + f + " son : ");
            for (int c = 0; c < 3; c++) {
                System.out.println("nota n° " + c + " " +  matriz[f][c]);
            }
            System.out.println("El promedio de las notas es : " + matriz[f][3]);
        }
    }
}
