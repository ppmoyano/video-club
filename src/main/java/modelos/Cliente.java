package modelos;

import java.util.ArrayList;

public class Cliente {
    String nombre;
    String apellido;
    String direccion;
    String fechaDeNacimiento;
    float deuda;
    ArrayList peliculasAlquiladas = new ArrayList();

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

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public ArrayList getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }

    public void setPeliculasAlquiladas(ArrayList peliculasAlquiladas) {
        this.peliculasAlquiladas = peliculasAlquiladas;
    }
}