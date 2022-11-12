/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Libro {
    private int codigo_libro;
    private String nombre;
    private String fecha_lanzamiento;
    private String autor;
   

    
    public Libro(int codigo_libro, String nombre, String fecha_lanzamiento, String autor){
        this.codigo_libro=codigo_libro;
        this.nombre=nombre;
        this.fecha_lanzamiento=fecha_lanzamiento;
        this.autor=autor;     
        
    }

    public int getCodigo_libro() {
        return codigo_libro;
    }

    public void setCodigo_libro(int codigo_libro) {
        this.codigo_libro = codigo_libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
    
