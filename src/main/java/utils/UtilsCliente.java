package utils;

import modelos.Cliente;

import java.util.List;
import java.util.Scanner;

public class UtilsCliente {

    public static Cliente buscarCliente(List<Cliente> listaDeClientes, String apellido) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el APELLIDO del Cliente");
        String apellidoABuscar = teclado.next();
        Cliente clienteEncontrado = new Cliente();
        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (apellidoABuscar == listaDeClientes.get(i).getApellido()) {
                clienteEncontrado=listaDeClientes.get(i);
            }
        }

        return clienteEncontrado;
    }
}