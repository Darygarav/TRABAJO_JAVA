/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gustavogongoraortiz
 */
public class Material {
    private int id_material;
    private String tipo;

    public Material() {
    }

    public Material(int id_material, String tipo) {
        this.id_material = id_material;
        this.tipo = tipo;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Material{" + "id_material=" + id_material + ", tipo=" + tipo + '}';
    }
    
    
}
