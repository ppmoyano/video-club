package modelos;

import java.util.ArrayList;

public class Cliente {
    String nombre;
    String apellido;
    String direccion;
    String fechaDeNacimiento;
    double deuda;
    String dni;
    ArrayList<Pelicula> peliculasAlquiladas = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public ArrayList<Pelicula> getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }

    public void setPeliculasAlquiladas(ArrayList<Pelicula> peliculasAlquiladas) {
        this.peliculasAlquiladas = peliculasAlquiladas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
