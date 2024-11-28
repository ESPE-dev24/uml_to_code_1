/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.examples.umlpoo;

/**
 *
 * @author Steven
 */
public class UmlPOO {

    public static void main(String[] args) {
        // Crear Biblioteca y libros
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("El hombre en busca de Sentido","Frankl","1234");
        biblioteca.agregarLibro(libro1);
        
        // Crear Usuario 
        Usuario usuario = new Usuario("Jose Luis Zapata",1);
        
        if(usuario.solicitarLibro(libro1)){
            System.out.println("Libro prestado: "+ libro1.getTitulo());
        }else{
            System.out.println("No se pudo prestar el libro.");
        }
        // Devolucion del libro
        if(usuario.devolverLibro(libro1)){
            System.out.println("Libro devuelto: "+libro1.getTitulo());
        }else{
            System.out.println("No se pudo devolver el libro");
        }
        
        // Registrar transaccion
        Transaccion transaccion = new Transaccion(1,usuario,libro1,"prestamo");
        System.out.println("Transaccion registrada: "+transaccion.getTipo() + " del libro "+ transaccion.getLibro().getTitulo());
    }
}
