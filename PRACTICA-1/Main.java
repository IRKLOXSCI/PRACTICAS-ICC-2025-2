import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mostrar el mensaje CALCULADORA
        System.out.println("_____________________________________");
        System.out.println("|            CALCULADORA            |");

        //Crear un objeto de la clase Scanner
        Scanner verificar = new Scanner(System.in);

        //Mostrar el mensaje "Menu de opciones"
        System.out.println("|___________________________________|");
        System.out.println("|          Lista de opciones        |");
        System.out.println("|___________________________________|");
        System.out.println("| Pulse 1 para sumar a y b          |");
        System.out.println("| Pulse 2 para restar a y b         |");
        System.out.println("| Pulse 3 para multiplicar a y b    |");
        System.out.println("| Pulse 4 para saber si p implica q |");
        System.out.println("| Pulse otra tecla para salir       |");

        //Leer la opcion ingresada
        System.err.println("|                                   |");
        System.out.println("| Ingrese una opcion para continuar |");
        int opcion = verificar.nextInt();

        //Suma de a y b
        if (opcion == 1){
            System.out.println("Ingrese el valor de a");
            double a = verificar.nextDouble();
            System.out.println("Ingrese el valor de b");
            double b = verificar.nextDouble();
            System.out.println("La suma de " + a + " + " + b + " es: " + (a + b));

        //Resta de a y b
        } else if (opcion == 2){
            System.out.println("Ingrese el valor de a");
            double a = verificar.nextDouble();
            System.out.println("Ingrese el valor de b");
            double b = verificar.nextDouble();
            System.out.println("La resta de " + a + " - " + b + " es: " + (a - b));
            
        //Multiplicacion de a y b    
        } else if (opcion == 3){
            System.out.println("Ingrese el valor de a");
            double a = verificar.nextDouble();
            System.out.println("Ingrese el valor de b");
            double b = verificar.nextDouble();
            System.out.println("La multiplicacion de " + a + " x " + b + " es: " + (a * b));
            
        //Implicacion de p y q    
        } else if (opcion == 4){
            System.out.println("Ingrese el valor de verdad de p");
            boolean p = verificar.nextBoolean();
            System.out.println("Ingrese el valor de verdad de q");
            boolean q = verificar.nextBoolean();

            System.out.println("La implicacion " + p + " implica " + q + " es: " + (!p || q));
           
        } else {
            System.out.println("Opción no valida");

        }
    }
}