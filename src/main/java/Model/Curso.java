/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Curso {
    private String nombre;
    private String codigo;

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public Curso(String pNombre, String pCodigo) {
        this.nombre = pNombre;
        this.codigo = pCodigo;
    }

    @Override
    public String toString() {
        return "Curso " + "Nombre: " + nombre + ", Codigo: " + codigo;
    }   
}