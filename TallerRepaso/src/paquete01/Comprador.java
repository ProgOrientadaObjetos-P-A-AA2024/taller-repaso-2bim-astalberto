/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author utpl
 */
public class Comprador {

    private String nombres;
    private String cedula;

    public Comprador(String nomb, String ced) {
        nombres = nomb;
        cedula = ced;
    }

    public void establecerNombres(String nomb) {
        nombres = nomb;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Comprador\nNombre: %s\nCedula: %s",
                obtenerNombres(),
                obtenerCedula());
        return mensaje;
    }

}
