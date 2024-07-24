/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Vehiculo;

/**
 *
 * @author utpl
 */
public class Concesionaria {

    private ArrayList<Vehiculo> listadoVehiculos;
    private String nombre;
    private double ventasTotales;
    private double costoVehiculoMasCaro;
    private double costoVehiculoMasBarato;

    public Concesionaria(String nomb) {
        nombre = nomb;
        listadoVehiculos = new ArrayList<>();
        ventasTotales = 0;
        costoVehiculoMasCaro = 0;
        costoVehiculoMasBarato = 0;
    }

    public void establecerListadoVehiculos(ArrayList<Vehiculo> listadoVehi) {
        listadoVehiculos = listadoVehi;
    }

    public void establecerNombre(String nomb) {
        nombre = nomb;
    }

    public void establecerVentasTotales(double ventasT) {
        ventasTotales = ventasT;
    }

    public void establecerCostoVehiculoMasCaro(double costoVehiCaro) {
        costoVehiculoMasCaro = costoVehiCaro;
    }

    public void establecerCostoVehiculoMasBarato(double costoVehiBarato) {
        costoVehiculoMasBarato = costoVehiBarato;
    }

    public ArrayList<Vehiculo> obtenerListadoVehiculos() {
        return listadoVehiculos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public double obtenerCostoVehiculoMasCaro() {
        return costoVehiculoMasCaro;
    }

    public double obtenerCostoVehiculoMasBarato() {
        return costoVehiculoMasBarato;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculo.calcularPrecioFinal();
        obtenerListadoVehiculos().add(vehiculo);
        actualizarVentas(vehiculo);
    }

    private void actualizarVentas(Vehiculo vehiculo) {
        establecerVentasTotales(obtenerVentasTotales() + vehiculo.obtenerPrecioFinal());
        if (vehiculo.obtenerPrecioFinal() > obtenerCostoVehiculoMasCaro()) {
            establecerCostoVehiculoMasCaro(vehiculo.obtenerPrecioFinal());
        }
        if (vehiculo.obtenerPrecioFinal() < obtenerCostoVehiculoMasBarato()) {
            establecerCostoVehiculoMasBarato(vehiculo.obtenerPrecioFinal());
        }
    }

    @Override
    public String toString() {
        String mensaje = String.format("Concesionaria %s\n", obtenerNombre());
        for (int i = 0; i < obtenerListadoVehiculos().size(); i++) {
            mensaje = String.format("%s%s\n", mensaje, obtenerListadoVehiculos().get(i));
        }
        mensaje = String.format("""
                                %s
                                Ventas Totales: %.2f
                                Costo de Vehiculo Mas Costoso: %.2f
                                Costo de Vehiculo Mas Barato: %.2f
                                """,
                mensaje, obtenerVentasTotales(), obtenerCostoVehiculoMasCaro(), obtenerCostoVehiculoMasBarato());

        return mensaje;

    }

}
