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
public class TipoCamioneta extends Vehiculo {

    private double porcentajeAdicionalImportacion;
    private double adicionalImportacion;
    private double seguroMantenimiento;

    public TipoCamioneta(Comprador propietario, String marca, double precioBase, double porcenAI) {
        super(propietario, marca, precioBase);
        porcentajeAdicionalImportacion = porcenAI;
    }

    public void establecerPorcentajeAdicionalImportacion(double porcenAI) {
        porcentajeAdicionalImportacion = porcenAI;
    }

    public void calcularAdicionalImportacion() {
        adicionalImportacion = ((obtenerPrecioBase() * obtenerPorcentajeAdicionalImportacion()) / 100);
    }

    public void calcularSeguroMantenimiento() {
        seguroMantenimiento = (obtenerAdicionalImportacion() * 1.5);
    }

    public double obtenerPorcentajeAdicionalImportacion() {
        return porcentajeAdicionalImportacion;
    }

    public double obtenerAdicionalImportacion() {
        return adicionalImportacion;
    }

    public double obtenerSeguroMantenimiento() {
        return seguroMantenimiento;
    }

    @Override
    public double calcularPrecioFinal() {
        calcularAdicionalImportacion();
        calcularSeguroMantenimiento();
        return obtenerPrecioBase() + obtenerAdicionalImportacion() + obtenerSeguroMantenimiento();
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Vehiculo Sub
                                       %s
                                       Marca: %s
                                       Precio Base: %.2f
                                       Porcentaje Adicional fijo por importacion: %.2f
                                       Valor Adicional fijo de importacion: %.2f
                                       Porcentaje Seguro: %.2f
                                       Precio Final %.2f
                                       """, obtenerPropietario(), obtenerMarca(), obtenerPrecioBase(),
                obtenerPorcentajeAdicionalImportacion(),
                obtenerAdicionalImportacion(), obtenerPrecioFinal());
        return mensaje;
    }

}
