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
    public void buscarClienteByDNI_return_clienteVacioSiElDNINoSeEncuentra() {
        Cliente cliente = UtilsCliente.buscarClientePorDni(listaDeClientes, "2");
        String message = "Error de busqueda: Se busco por apellido inexistente y no devolvio un cliente vacio ";
        assertEquals(null, cliente.getApellido(), message);
    }
    @Test
    public void buscarClienteSegunIngresoDni_return_clienteEncontrado() {
        Cliente cliente = UtilsCliente.buscarSegunIngreso(listaDeClientes, "1");
        String message = "Error de busqueda: Se busco por apellido inexistente y no devolvio un cliente vacio ";
        assertEquals("Lopez", cliente.getApellido(), message);
    }

    @Test
    public void modficiarCliente_return_clienteModificado() {
        Cliente cliente = UtilsCliente.modificarCliente(listaDeClientes, "1", "Lopez", "Matias", "", "");
        String message = "El cliente no ha sido modificado correctamente";
        assertEquals("Matias", cliente.getNombre(), message);
        assertEquals(null, cliente.getDireccion(), message);
    }

    @Test
    public void buscarClienteSegunIngresoApellido_return_clienteEncontrado() {
        Cliente cliente = UtilsCliente.buscarSegunIngreso(listaDeClientes, "Lopez");
        String message = "Error de busqueda: Se busco por apellido inexistente y no devolvio un cliente vacio ";
        assertEquals("Lopez", cliente.getApellido(), message);
    }

}