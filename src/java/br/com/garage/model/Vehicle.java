/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.garage.model;

/**
 *
 * @author Rafael
 */
public class Vehicle {

    private Integer idVehicle;
    private String nameVehicle;
    private int yearManufactureVehicle;
    private Double amountVehicle;

    public Vehicle() {
    }

    public Vehicle(Integer idVehicle, String nameVehicle, int yearManufactureVehicle, Double amountVehicle) {
        this.idVehicle = idVehicle;
        this.nameVehicle = nameVehicle;
        this.yearManufactureVehicle = yearManufactureVehicle;
        this.amountVehicle = amountVehicle;
    }

    /**
     * @return the idVehicle
     */
    public Integer getIdVehicle() {
        return idVehicle;
    }

    /**
     * @param idVehicle the idVehicle to set
     */
    public void setIdVehicle(Integer idVehicle) {
        this.idVehicle = idVehicle;
    }

    /**
     * @return the nameVehicle
     */
    public String getNameVehicle() {
        return nameVehicle;
    }

    /**
     * @param nameVehicle the nameVehicle to set
     */
    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    /**
     * @return the yearManufactureVehicle
     */
    public int getYearManufactureVehicle() {
        return yearManufactureVehicle;
    }

    /**
     * @param yearManufactureVehicle the yearManufactureVehicle to set
     */
    public void setYearManufactureVehicle(int yearManufactureVehicle) {
        this.yearManufactureVehicle = yearManufactureVehicle;
    }

    /**
     * @return the amountVehicle
     */
    public Double getAmountVehicle() {
        return amountVehicle;
    }

    /**
     * @param amountVehicle the amountVehicle to set
     */
    public void setAmountVehicle(Double amountVehicle) {
        this.amountVehicle = amountVehicle;
    }

}
