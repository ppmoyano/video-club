package utils;

import modelos.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsClienteTest {

    List<Cliente> listaDeClientes;


    @BeforeEach
    public void setup() {
        Cliente cliente = new Cliente();
        cliente.setApellido("Lopez");
        cliente.setDni("1");
        listaDeClientes = List.of(cliente);
    }

    @Test
    public void buscarClienteByApellido_return_clienteEsperado() {
        Cliente cliente = UtilsCliente.buscarCliente(listaDeClientes, "Lopeza".substring(0, 5));
        String message = "Error de busqueda: Se busco por apellido Lopez y no encontro el cliente de apellido " + cliente.getApellido();
        assertEquals("Lopez", cliente.getApellido(), message);
    }

    @Test
    public void buscarClienteByApellido_return_clienteVacioSiElApellidoEsNull() {
        Cliente cliente = UtilsCliente.buscarCliente(listaDeClientes, null);
        String message = "Error de busqueda: Se busco por apellido null y no devolvio un cliente vacio ";
        assertEquals(null, cliente.getApellido(), message);
    }

    @Test
    public void buscarClienteByApellido_return_clienteVacioSiElApellidoNoSeEncuentra() {
        Cliente cliente = UtilsCliente.buscarCliente(listaDeClientes, "FENSJCJEJKC");
        String message = "Error de busqueda: Se busco por apellido inexistente y no devolvio un cliente vacio ";
        assertEquals(null, cliente.getApellido(), message);
    }

    @Test
    public void buscarClienteByDNI_return_clienteEsperado() {
        Cliente cliente = UtilsCliente.buscarClientePorDni(listaDeClientes, "12".substring(0, 1));
        String message = "Error de busqueda: se busco DNI 1 y no lo encontro";
        assertEquals("1", cliente.getDni(), message);
    }

    @Test
    public void buscarClienteByDNI_return_clienteVacioSiElDNIesNull() {
        Cliente cliente = UtilsCliente.buscarClientePorDni(listaDeClientes, null);
        String message = "Error de busqueda: Se busco por dni= null y no devolvio un cliente vacio ";
        assertEquals(null, cliente.getApellido(), message);
    }

    @Test
    public void buscarClienteByDNI_return_clienteVacioSiElDNINoSeEncuentra() {
        Cliente cliente = UtilsCliente.buscarClientePorDni(listaDeClientes, "2");
        String message = "Error de busqueda: Se busco por apellido inexistente y no devolvio un cliente vacio ";
        assertEquals(null, cliente.getApellido(), message);
    }

}
