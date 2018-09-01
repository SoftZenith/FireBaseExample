package mx.edu.ittepic.firebaseexample;

public class Vendedor {

    private String nombre;
    private String contrasena;
    private String zona;

    public Vendedor(String nombre, String contrasena, String zona) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.zona = zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
