import java.util.Scanner;

public class Desafiro {

    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        double retiro = 0;
        double ingreso = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$");
        System.out.println("\n***********************");

        String menu = """
                *** Escriba el número de la opción deseada ***
                1 - Consultar saldo.
                2 - Retirar.
                3 - Depositar.
                9 - Salir.
                """;


        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actualizado es de: " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    retiro = teclado.nextDouble();
                    if(retiro > saldo){
                        System.out.println("Saldo insuficiente");
                    }else {
                        System.out.printf(String.format("Se retiraron %.2f con exitó!", retiro));
                        saldo -= retiro;
                        System.out.println("\nSu saldo disponible es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    ingreso = teclado.nextDouble();
                    saldo += ingreso;
                    System.out.println("Su saldo disponible es: " + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios, saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
