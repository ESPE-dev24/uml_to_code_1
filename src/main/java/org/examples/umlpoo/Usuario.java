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
public class Usuario {
    private String nombresCompletos;
    private int idUsuario;
    private List<Libro> librosPrestados;
    
    public Usuario ( String  nombresCompletos,int idUsuario){
        this.nombresCompletos = nombresCompletos;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }
    
    public boolean solicitarLibro(Libro libro){
        if(libro.prestar()){
            librosPrestados.add(libro);
            return true;
        }
        return false;
    }
    public boolean devolverLibro(Libro libro){
        if(librosPrestados.contains(libro)){
            libro.devolver();
            librosPrestados.remove(libro);
            return true;
        }
        return false;
    }
//    Getters and Setters
    public String getNombresCompletos(){return nombresCompletos;}
    public int getUsuarioId(){return idUsuario;}
    public List<Libro> getLibrosPrestados(){return librosPrestados;}
    
}
