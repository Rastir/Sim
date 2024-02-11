import java.util.Scanner;

public class Maraton {
    public static void main(String[] args) {

        String nombre, dni;
        int edad, contador;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el DNI de la persona: ");
        dni = s.nextLine();
        System.out.println("Ingrese el nombre de la persona : ");
        nombre = s.nextLine();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona: ");
        edad = s2.nextInt();

        while (!dni.equalsIgnoreCase("0") && !nombre.equalsIgnoreCase("fin")){

            if(edad >= 6 && edad <= 10){
                System.out.println("Categoria menores a");
            } else if (edad >= 11 && edad <= 17){
                System.out.println("Categoria menores b");
            } else if (edad >= 18 && edad <= 30){
                System.out.println("Categoria juveniles");
            }else if (edad >= 31 && edad <= 50){
                System.out.println("Categoria adultos ");
            }else if (edad >= 51){
                System.out.println("Categoria adultos mayores");
            }else {
                System.out.println("tas chavo o muy viejo");
            }

            System.out.println("Ingrese el DNI de la persona: ");
            dni = s.nextLine();
            System.out.println("Ingrese el nombre de la persona : ");
            nombre = s.nextLine();
            System.out.println("Ingrese la edad de la persona: ");
            edad = s2.nextInt();
        } {
            System.out.println("amonos");
        }

    }
}
