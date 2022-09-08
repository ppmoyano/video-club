package utils;

import modelos.Cliente;

import java.util.List;
import java.util.Scanner;

public class UtilsCliente {


    public static Cliente buscarSegunIngreso(List<Cliente> listaDeClientes, String ingreso) {
        String numeros = "1234567890";
        for (int i = 0; i < ingreso.length(); i++) {
            for (int n = 0; n <= 9; n++)
                if (ingreso.charAt(i) == numeros.charAt(n)) {
                    return buscarClientePorDni(listaDeClientes, ingreso);
                }

        }
        return buscarCliente(listaDeClientes, ingreso);
    }


    public static Cliente buscarCliente(List<Cliente> listaDeClientes, String apellido) {
        Cliente clienteEncontrado = new Cliente();
        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (apellido.equals(listaDeClientes.get(i).getApellido())) {
                clienteEncontrado = listaDeClientes.get(i);
            }
        }

        return clienteEncontrado;
    }

    public static Cliente buscarClientePorDni(List<Cliente> listaDeClientes, String dni) {

        Cliente clienteEncontrado = new Cliente();
        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (dni.equals(listaDeClientes.get(i).getDni())) {
                clienteEncontrado = listaDeClientes.get(i);
            }

        }
        return clienteEncontrado;
    }
}