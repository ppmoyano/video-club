//PRIMERO ESTOY TRATANDO VER SI ESTO ESTÁ BIEN

import java.util.Scanner;

public class main {
    public static void main (String [] ars) {
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
        String opcion = teclado.nextLine();
        System.out.println("Lo siento no se encontre el Cliente desado.");  // Queda así hardocodeado solamente para el ejemplo, una vez que tengamos más info lo modifico bien.
    }
    private static void buscarPelicula() { //Acá se buscan las películas, con los géneros
        Scanner teclado = new Scanner(System.in);
        System.out.println("Desea buscar la película por:");
        System.out.println("1 - Titulo 2 - Genero - 3 - Reparto 0 - Volver");
        int opcion = teclado.nextInt();
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

    private static void buscarPorReparto() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el reparto:");
        String opcionReparto = teclado.nextLine();
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
    }

    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenidos al Video Club Clark, que accion desea hacer?");
        System.out.println("1 - Buscar Pelicula 2 - Buscar Cliente   0 - Salir");
        int opcion = teclado.nextInt();
        return opcion;
    }
}