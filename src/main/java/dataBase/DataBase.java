package dataBase;

import modelos.Cliente;
import modelos.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    List<Cliente> clientesBaseDeDatos = inicializarClientes();
    List<Pelicula> peliculasBaseDeDatos = inicializarPeliculas();

    private List<Pelicula> inicializarPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>();

        peliculas.add(crearPelicula(0,"Titanic","Drama","Leonardo Di Caprio", 330, "DVD", false));
        peliculas.add(crearPelicula(1,"Casper","Fantastico","Christina Ricci", 100, "DVD", false));
        peliculas.add(crearPelicula(2,"Jumanji","Fantastico","Robin Williams", 104, "DVD", true));
        peliculas.add(crearPelicula(3,"Parch Adams","Biografico","Robin Williams", 118, "VHS", false));
        return peliculas;
    }

    private Pelicula crearPelicula(int id, String nombre, String genero, String reparto, int duracion, String formato, boolean alquilado) {
        Pelicula p = new Pelicula();
        ArrayList<String> listaReparto = new ArrayList();
        listaReparto.add(reparto);

        p.setId(id);
        p.setNombre(nombre);
        p.setGenero(genero);
        p.setReparto(listaReparto);
        p.setDuracion(duracion);
        p.setFormato(formato);
        p.setAlquilado(alquilado);
        return p;
    }

    private List<Cliente> inicializarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(crearCliente("Pepe","Moyano","Roque Saenz P. 1131","18/03/1987", 3.5));
        clientes.add(crearCliente("Karen","Tello","La Paz 380","16/12/1992", 0));
        clientes.add(crearCliente("Marcos","Sanchez","Avenida Diagonal 12","06/10/1975", 0));
        clientes.add(crearCliente("Ana","Lopez","San MArtin 716","22/07/1945", 10));
        clientes.add(crearCliente("Pia","Dominguez","Rivadavia 222","01/01/2001", 0));
        return clientes;
    }

    private Cliente crearCliente(String nombre, String apellido, String direccion, String fechaDeNacimiento, double deuda) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDeuda(deuda);
        cliente.setDireccion(direccion);
        cliente.setFechaDeNacimiento(fechaDeNacimiento);
        return cliente;
    }

    public List<Cliente> getClientesBaseDeDatos() {
        return clientesBaseDeDatos;
    }

    public List<Pelicula> getPeliculasBaseDeDatos() {
        return peliculasBaseDeDatos;
    }


}
