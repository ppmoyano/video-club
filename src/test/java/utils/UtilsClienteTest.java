package utils;

import dataBase.DataBase;
import modelos.Cliente;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsClienteTest {

    List<Cliente> listaDeClientes = new DataBase().getClientesBaseDeDatos();

    @Test
    public void buscarCliente_return_clienteEsperado() {
        Cliente cliente = UtilsCliente.buscarCliente(listaDeClientes, "Lopez");
        String message = "Error de busqueda: Se busco por apellido Lopez y se encontro el cliente de apellido " + cliente.getApellido();
        assertEquals("Lopez", cliente.getApellido(), message);
    }

    @Test
    public void buscarCliente_return_clienteVacioSiElApellidoEsNull() {
        Cliente cliente = UtilsCliente.buscarCliente(listaDeClientes, null);
        String message = "Error de busqueda: Se busco por apellido null y no devolvio un cliente vacio ";
        assertEquals( null, cliente.getApellido(), message);
    }

    @Test
    public void buscarCliente_return_clienteVacioSiElApellidoNoSeEncuentra() {
        Cliente cliente = UtilsCliente.buscarCliente(listaDeClientes, "FENSJCJEJKC");
        String message = "Error de busqueda: Se busco por apellido inexistente y no devolvio un cliente vacio ";
        assertEquals(null, cliente.getApellido(), message);
    }
}
