import java.util.Scanner;

public class PruebaTecnica1 {

    public static void main(String[] args) {

        //declarar variables
        char[][] asientos = new char[10][10];
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        int fila = 0, asiento = 0;
        String respuesta;
        String verMapa;

        //cargamos la matriz
        for (char f = 0; f < 10 ; f++){
            for (char c = 0; c <10; c++){
                asientos[f][c] = 'l';
            }
        }

        // Bienvenida al sistema
        System.out.println("----------------------Bienvenido al sistema de reservas---------------------- ");


        //Reserva de asientos
        while (bandera != true){

            //Visualización de mapa
            System.out.println("Desea observar los asientos disponibles ? (S = si, cualquier otra letra No.)");
            verMapa = teclado.next();
            if(verMapa.equalsIgnoreCase("s")){
                dibujarMapa(asientos);
            }

            // reserva
            boolean taBien = false;
            while (taBien!=true) {
                System.out.println("Ingrese fila y asiento a reservar");
                System.out.print("Fila (entre 0 - 9) ");
                fila = teclado.nextInt();

                System.out.print("asiento (entre 0 - 9) ");
                asiento = teclado.nextInt();

                if (fila <= 9 && fila>= 0){
                    if (asiento<=9 && asiento>=0){
                        taBien = true;
                    }
                    else {
                        System.out.println("El numero de asiento no es valido");
                    }
                }
                else {
                    System.out.println("El numero de fila no es valido");
                }
            }

            if(asientos[fila][asiento] == 'l'){
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado !");


            }
            else {

                System.out.println("El asiento esta ocupado, favor de escoger otro");
            }

            System.out.println("Quieres finalizar la reserva? (S = Si, cualquier tecla No)");
            respuesta = teclado.next();

            if(respuesta.equalsIgnoreCase("s")){
                bandera=true;
            }
            System.out.println("Gracias por usar nuestro programa");
        }
    }

    public static void dibujarMapa(char asientos[][]){

        for (char f = 0; f < 10 ; f++){
            System.out.print(f+" ");
            for (char c = 0; c <10; c++){

                System.out.print("[" + asientos[f][c] +"]");
            }
            System.out.println("");
        }

    }
}

