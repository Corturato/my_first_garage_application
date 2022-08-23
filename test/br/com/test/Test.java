package br.com.test;

import br.com.garage.model.Vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 */
public class Test {
    public static void main(String[] args) {
        Vehicle v1= new Vehicle();
        v1.setNameVehicle("Uno com escada");
        v1.setYearManufactureVehicle(2022);
        v1.setAmountVehicle(0.00);
        v1.setIdVehicle(1);
        
        System.out.println(v1.getNameVehicle());
    }
}
