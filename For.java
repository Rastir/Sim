import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese numero a iterar: ");
        int num= s.nextInt();

        for(int i = 1; i <= num; i++){

           System.out.println("estoy dando vueltas  con for, numero de vuelta : " + i);
       }


    }
}
