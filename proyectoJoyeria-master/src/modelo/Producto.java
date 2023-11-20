/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gustavogongoraortiz
 */
public class Producto {
    
    private int id_producto;
    private String nombre_pro;
    private String descripcion_pro;
    private int precio_pro;
    private Material id_material;

    public Producto() {
    }

    public Producto(int id_producto, String nombre_pro, String descripcion_pro, int precio_pro, Material id_material) {
        this.id_producto = id_producto;
        this.nombre_pro = nombre_pro;
        this.descripcion_pro = descripcion_pro;
        this.precio_pro = precio_pro;
        this.id_material = id_material;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public String getDescripcion_pro() {
        return descripcion_pro;
    }

    public void setDescripcion_pro(String descripcion_pro) {
        this.descripcion_pro = descripcion_pro;
    }

    public int getPrecio_pro() {
        return precio_pro;
    }

    public void setPrecio_pro(int precio_pro) {
        this.precio_pro = precio_pro;
    }

    public Material getId_material() {
        return id_material;
    }

    public void setId_material(Material id_material) {
        this.id_material = id_material;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nombre_pro=" + nombre_pro + ", descripcion_pro=" + descripcion_pro + ", precio_pro=" + precio_pro + ", id_material=" + id_material + '}';
    }
    
    
   
}
