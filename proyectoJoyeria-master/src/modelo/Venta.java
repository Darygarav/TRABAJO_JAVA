/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author gustavogongoraortiz
 */
public class Venta {
    
    private int id_venta;
    private Date fecha_venta;
    private Cliente id_cliente;
    private Producto id_producto;
    private int cantidad;
    private int precio_total;

    public Venta() {
    }

    public Venta(int id_venta, Date fecha_venta, Cliente id_cliente, Producto id_producto, int cantidad, int precio_total) {
        this.id_venta = id_venta;
        this.fecha_venta = fecha_venta;
        this.id_cliente = id_cliente;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio_total = precio_total;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", fecha_venta=" + fecha_venta + ", id_cliente=" + id_cliente + ", id_producto=" + id_producto + ", cantidad=" + cantidad + ", precio_total=" + precio_total + '}';
    }
    
    
    
}
