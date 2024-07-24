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
public class TipoSedan extends Vehiculo {

    private double porcentajeDescuento;
    private double descuento;
    private double seguroMecanico;

    public TipoSedan(Comprador propietario, String marca, double precioBase, double porcenDes) {
        super(propietario, marca, precioBase);
        porcentajeDescuento = porcenDes;
    }

    public void establecerPorcentajeDescuento(double porcenDes) {
        porcentajeDescuento = porcenDes;
    }

    public void establecerDescuento() {
        descuento = (obtenerPrecioBase() * obtenerPorcentajeDescuento()) / 100;;
    }

    public void establecerSeguroMecanico() {
        seguroMecanico = obtenerPrecioBase() * 0.01;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    public double obtenerSeguroMecanico() {
        return seguroMecanico;
    }

    @Override
    public void calcularPrecioFinal() {
        establecerDescuento();
        establecerSeguroMecanico();
        establecerPrecioFinal(obtenerPrecioBase() - obtenerDescuento() + obtenerSeguroMecanico());
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Vehiculo Sedan
                                       %s
                                       Marca: %s
                                       Precio Base: %.2f
                                       Porcentaje descuento: %.2f
                                       Descuento: %.2f
                                       Seguro Mecanico: %.2f
                                       Precio Final %.2f
                                       """, obtenerPropietario(), obtenerMarca(), obtenerPrecioBase(),
                porcentajeDescuento,
                descuento,
                seguroMecanico, obtenerPrecioFinal());
        return mensaje;
    }

}
