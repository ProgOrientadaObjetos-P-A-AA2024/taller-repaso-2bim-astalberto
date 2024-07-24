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
public class TipoSuv extends Vehiculo {

    private double porcentajeSeguro;

    public TipoSuv(Comprador propietario, String marca, double precioBase, double porcenS) {
        super(propietario, marca, precioBase);
        porcentajeSeguro = porcenS;
    }

    @Override
    public double calcularPrecioFinal() {
        double seguroPersonas = (obtenerPrecioBase() * obtenerPorcentajeSeguro()) / 100;
        return obtenerPrecioBase() + seguroPersonas;
    }

    public void establecerPorcentajeSeguro(double porcenS) {
        porcentajeSeguro = porcenS;
    }

    public double obtenerPorcentajeSeguro() {
        return porcentajeSeguro;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Vehiculo Sub
                                       %s
                                       Marca: %s
                                       Precio Base: %.2f
                                       Porcentaje Seguro: %.2f
                                       Precio Final %.2f
                                       """, obtenerPropietario(), obtenerMarca(), obtenerPrecioBase(),
                porcentajeSeguro, obtenerPrecioFinal());
        return mensaje;
    }

}
