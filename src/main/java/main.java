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
        // NO ENTENDÍ LO DEL DNI STRING
        //NO SE COMO JUNTAR ESTO CON LA INFO DE LOS CLIENTES PARA SABER SI EXISTEN O NO.
    }
    private static void buscarPelicula() { //Acá se buscan las películas, con los géneros
        Scanner teclado = new Scanner(System.in);
        System.out.println("Desea buscar la película por:");
        System.out.println("1 - Titulo 2 - Genero - 3 - Reparto 0 - Volver");
        // NO ENTENDÍ CÓMO SEGUIR ESTA PARTE
    }

    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenidos al Video Club Clark, que accion desea hacer?");
        System.out.println("1 - Buscar Pelicula 2 - Buscar Cliente   0 - Salir");
        int opcion = teclado.nextInt();
        return opcion;
    }
}