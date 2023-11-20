/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
//AHORA
import java.util.Date;

/**
 *
 * @author gustavogongoraortiz
 */
public class Trabajo {
    
    private int id_trabajo;
    private String descripcion_tra;
    private int costo;
    private Venta id_venta;
    private Date fecha_recibo;

    public Trabajo() {
    }

    public Trabajo(int id_trabajo, String descripcion_tra, int costo, Venta id_venta, Date fecha_recibo) {
        this.id_trabajo = id_trabajo;
        this.descripcion_tra = descripcion_tra;
        this.costo = costo;
        this.id_venta = id_venta;
        this.fecha_recibo = fecha_recibo;
    }

    public int getId_trabajo() {
        return id_trabajo;
    }

    public void setId_trabajo(int id_trabajo) {
        this.id_trabajo = id_trabajo;
    }

    public String getDescripcion_tra() {
        return descripcion_tra;
    }

    public void setDescripcion_tra(String descripcion_tra) {
        this.descripcion_tra = descripcion_tra;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Venta getId_venta() {
        return id_venta;
    }

    public void setId_venta(Venta id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFecha_recibo() {
        return fecha_recibo;
    }

    public void setFecha_recibo(Date fecha_recibo) {
        this.fecha_recibo = fecha_recibo;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id_trabajo=" + id_trabajo + ", descripcion_tra=" + descripcion_tra + ", costo=" + costo + ", id_venta=" + id_venta + ", fecha_recibo=" + fecha_recibo + '}';
    }

    
    
}
