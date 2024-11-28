/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.examples.umlpoo;

/**
 *
 * @author Steven
 */
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }
    
    public boolean prestar(){
        if(disponible){
            disponible = false;
            return true;
        }
        return false;
    }
    public void devolver(){
        disponible = true;
    }
//    Getters and Setters
    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    public String getIsbn(){return isbn;}
    public boolean isDisponible(){return disponible;}
    
}
