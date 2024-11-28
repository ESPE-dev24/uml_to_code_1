/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.examples.umlpoo;
import java.util.Date;
/**
 *
 * @author Steven
 */
public class Transaccion {
    private int idTransaccion;
    private Usuario usuario;
    private Libro libro;
    private Date fecha;
    private String tipo;
    
    public Transaccion(int idTransaccion,Usuario usuario,Libro libro,String tipo){
        this.idTransaccion = idTransaccion;
        this.usuario = usuario;
        this.libro = libro;
        this.fecha = new Date();
        this.tipo = tipo;
    }
//    Getters and Setters 
    public int getIdTransaccion(){return this.idTransaccion;}
    public Usuario getUsuario(){return this.usuario;}
    public Libro getLibro(){return this.libro;}
    public Date getFecha(){return this.fecha;}
    public String getTipo(){return this.tipo;}
}
