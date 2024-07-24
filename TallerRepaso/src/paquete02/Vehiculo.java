/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.Comprador;

/**
 *
 * @author utpl
 */
public abstract class Vehiculo {

    private Comprador propietario;
    private String marca;
    private double precioBase;
    private double precioFinal;

    public Vehiculo(Comprador prop, String mar, double pBase) {
        propietario = prop;
        marca = mar;
        precioBase = pBase;
        //precioFinal = calcularPrecioFinal();
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Comprador prop) {
        propietario = prop;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String marc) {
        marca = marc;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public void establecerPrecioBase(double precioB) {
        precioBase = precioB;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public void establecerPrecioFinal(double precioF) {
        precioFinal = precioF;
    }

    public abstract void calcularPrecioFinal();

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Vehiculo
                                       %s
                                       Marca: %s
                                       Precio Base: %.2f
                                       Precio Final %.2f
                                       """, obtenerPropietario(), obtenerMarca(), obtenerPrecioBase(), obtenerPrecioFinal());
        return mensaje;
    }

}
