//PRIMERO ESTOY TRATANDO VER SI ESTO ESTÁ BIEN

import dataBase.DataBase;
import modelos.Cliente;

import java.sql.SQLOutput;
import java.util.Scanner;

import static utils.UtilsCliente.buscarSegunIngreso;

public class main {
    static DataBase dataBase = new DataBase();
    public static void main(String[] ars) {
        int opcion = 7;


        do {
            opcion = menu(); //acá queda la opción que elegis en el primer menú
            switch (opcion) {
                case 1:
                    buscarPelicula();
                    break;
                case 2:
                    buscarCliente();
                    break;
            }
        }
        while (opcion != 0);
    }


    private static void buscarCliente() { //Acá se buscan los clientes, con el apellido o el DNI
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el Apellido o el DNI: ");
        String apellidoODni;
        apellidoODni = teclado.nextLine();
        Cliente cliente = buscarSegunIngreso(dataBase.getClientesBaseDeDatos(), apellidoODni);
        System.out.println("cliente encontrado; " + cliente.getApellido());
    }

    private static void buscarPelicula() { //Acá se buscan las películas, con los géneros
        Scanner teclado = new Scanner(System.in);
        int opcion = 7;
        do {

            System.out.println("Desea buscar la película por:");
            System.out.println("1 - Titulo 2 - Genero - 3 - Reparto 0 - Volver");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    buscarPorTitulo();
                    break;
                case 2:
                    buscarPorGenero();
                    break;
                case 3:
                    buscarPorReparto();
                    break;
            }
        }
        while (opcion != 0);


    }

    private static void buscarPorReparto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el reparto:");
        String opcionReparto = teclado.nextLine();
        System.out.println("Lo siento, no tenemos ninguna pelicula disponible con ese reparto"); // Queda así hardocodeado solamente para el ejemplo, una vez que tengamos más info lo modifico bien.

    }

    private static void buscarPorGenero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el genero:");
        String opcionGenero = teclado.nextLine();
        System.out.println("Lo siento, no tenemos ninguna pelicula disponible en ese genero"); // Queda así hardocodeado solamente para el ejemplo, una vez que tengamos más info lo modifico bien.
    }

    private static void buscarPorTitulo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el título:");
        String opcionTitulo = teclado.nextLine();
        System.out.println("Lo siento, no tenemos ninguna pelicula disponible con ese titulo"); // Queda así hardocodeado solamente para el ejemplo, una vez que tengamos más info lo modifico bien.

    }

    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenidos al Video Club Clark, que accion desea hacer?");
        System.out.println("1 - Buscar Pelicula 2 - Buscar Cliente   0 - Salir");
        int opcion = teclado.nextInt();
        return opcion;
    }
}