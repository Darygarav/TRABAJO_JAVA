/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gustavogongoraortiz
 */
public class Vendedor {
    
    private int id_vendedor;
    private String nombre_ven;
    private String apellpaterno_ven;
    private String apellmaterno_ven;
    private String direccion_ven;
    private int telefono_ven;
    private String email_ven;
    private String usuario;
    private String contrasena;

    public Vendedor() {
    }

    public Vendedor(int id_vendedor, String nombre_ven, String apellpaterno_ven, String apellmaterno_ven, String direccion_ven, int telefono_ven, String email_ven, String usuario, String contrasena) {
        this.id_vendedor = id_vendedor;
        this.nombre_ven = nombre_ven;
        this.apellpaterno_ven = apellpaterno_ven;
        this.apellmaterno_ven = apellmaterno_ven;
        this.direccion_ven = direccion_ven;
        this.telefono_ven = telefono_ven;
        this.email_ven = email_ven;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNombre_ven() {
        return nombre_ven;
    }

    public void setNombre_ven(String nombre_ven) {
        this.nombre_ven = nombre_ven;
    }

    public String getApellpaterno_ven() {
        return apellpaterno_ven;
    }

    public void setApellpaterno_ven(String apellpaterno_ven) {
        this.apellpaterno_ven = apellpaterno_ven;
    }

    public String getApellmaterno_ven() {
        return apellmaterno_ven;
    }

    public void setApellmaterno_ven(String apellmaterno_ven) {
        this.apellmaterno_ven = apellmaterno_ven;
    }

    public String getDireccion_ven() {
        return direccion_ven;
    }

    public void setDireccion_ven(String direccion_ven) {
        this.direccion_ven = direccion_ven;
    }

    public int getTelefono_ven() {
        return telefono_ven;
    }

    public void setTelefono_ven(int telefono_ven) {
        this.telefono_ven = telefono_ven;
    }

    public String getEmail_ven() {
        return email_ven;
    }

    public void setEmail_ven(String email_ven) {
        this.email_ven = email_ven;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id_vendedor=" + id_vendedor + ", nombre_ven=" + nombre_ven + ", apellpaterno_ven=" + apellpaterno_ven + ", apellmaterno_ven=" + apellmaterno_ven + ", direccion_ven=" + direccion_ven + ", telefono_ven=" + telefono_ven + ", email_ven=" + email_ven + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
    
    
    
    
}
