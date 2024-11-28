/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.examples.umlpoo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Steven
 */
public class Biblioteca {
    private List<Libro> catalogo;
    
    public Biblioteca(){
        this.catalogo = new ArrayList<>();
    }
    public void agregarLibro(Libro libro){
        System.out.println("Libro "+ libro.getTitulo());
        this.catalogo.add(libro);
    }
    public Libro buscarLibro(String titulo){
        for(Libro libro : this.catalogo){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        return null;
    }
    public List<Libro> getCatalogo(){return catalogo; }
    
}
