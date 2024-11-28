/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.examples.umlpoo;

/**
 *
 * @author Steven
 */
public class Empleados {
    private String nombre;
    private int idEmpleado;
    
    public Empleados (String nombre,int idEmpleado){
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }
    
    public void registrarUsuario(Usuario usuario){
        System.out.println("Usuario "+ usuario.getNombresCompletos() + " registrado.");
    }
    public void gestionarLibro(Libro libro,String accion){
        if("agregar".equalsIgnoreCase(accion)){
            System.out.println("Libro "+ libro.getTitulo() + " agregado al catalogo.");
        }
        if("remover".equalsIgnoreCase(accion)){
            System.out.println("Libro "+ libro.getTitulo() + " removido del catalogo.");
        }
    }
    
//    Getters and Setters 
    public String getNombre(){return this.nombre;}
    public int getIdEmpleado(){return this.idEmpleado;}
}
