/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gustavogongoraortiz
 */
public class Cliente {
    private int id_cliente;
    private String nombre_cli;
    private String apellpaterno_cli;
    private String apellmaterno_cli;
    private String direccion;
    private int telefono;
    private String email_cli;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre_cli, String apellpaterno_cli, String apellmaterno_cli, String direccion, int telefono, String email_cli) {
        this.id_cliente = id_cliente;
        this.nombre_cli = nombre_cli;
        this.apellpaterno_cli = apellpaterno_cli;
        this.apellmaterno_cli = apellmaterno_cli;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email_cli = email_cli;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getApellpaterno_cli() {
        return apellpaterno_cli;
    }

    public void setApellpaterno_cli(String apellpaterno_cli) {
        this.apellpaterno_cli = apellpaterno_cli;
    }

    public String getApellmaterno_cli() {
        return apellmaterno_cli;
    }

    public void setApellmaterno_cli(String apellmaterno_cli) {
        this.apellmaterno_cli = apellmaterno_cli;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", nombre_cli=" + nombre_cli + ", apellpaterno_cli=" + apellpaterno_cli + ", apellmaterno_cli=" + apellmaterno_cli + ", direccion=" + direccion + ", telefono=" + telefono + ", email_cli=" + email_cli + '}';
    }
    
    //Metodo Customer
    public void imprimirDetalles(){
            System.out.println("ID: " + this.id_cliente + "\n"
                    + "Nombre Cliente: " + this.nombre_cli + "\n"
                    + "Apellido Paterno: " + this.apellpaterno_cli + "\n"
                    + "Apellido Materno: " + this.apellmaterno_cli + "\n"
                    + "Direccion: " + this.direccion + "\n"
                    + "Telefono: " + this.telefono + "\n"
                    + "Email: " + this.email_cli + "\n"
            );
    }
    
    
    
}
