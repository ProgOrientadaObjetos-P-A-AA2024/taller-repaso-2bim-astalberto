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

        Comprador comprador2 = new Comprador("Maria López", "444555666");

        Comprador comprador3 = new Comprador("Pedro Ramírez", "777888999");

        TipoSedan sedan1 = new TipoSedan(comprador1, "Toyota", 25000, 12);
        sedan1.calcularPrecioFinal();

        TipoSedan sedan2 = new TipoSedan(comprador2, "Mazda", 24000, 7);
        sedan2.calcularPrecioFinal();

        TipoSuv suv = new TipoSuv(comprador3, "Jeep", 35000, 12);
        suv.calcularPrecioFinal();

        TipoCamioneta camioneta = new TipoCamioneta(comprador1, "GMC", 27000, 18);
        camioneta.calcularPrecioFinal();

        Concesionaria concesionaria = new Concesionaria("El patio de Goku");
        concesionaria.agregarVehiculo(sedan1);
        concesionaria.agregarVehiculo(sedan2);
        concesionaria.agregarVehiculo(suv);
        concesionaria.agregarVehiculo(camioneta);
        System.out.println(concesionaria);
    }
}
