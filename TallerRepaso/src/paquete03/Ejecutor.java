/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete01.Comprador;
import paquete01.Concesionaria;
import paquete02.TipoCamioneta;
import paquete02.TipoSedan;
import paquete02.TipoSuv;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        Comprador comprador1 = new Comprador("Maria Juana", "123456789");

        TipoSedan sedan1 = new TipoSedan(comprador1, "Toyota", 25000, 12);
        sedan1.calcularPrecioFinal();
        Concesionaria concesionaria = new Concesionaria("El patio de Goku");
        concesionaria.agregarVehiculo(sedan1);
        System.out.println(concesionaria);
    }
}
