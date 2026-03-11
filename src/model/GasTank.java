package model;

import model.enums.FuelType;

public class GasTank {
    private String gasStationId;
    private String gasTankId;
    private FuelType fuelType;
    private Double totalFuelAmount;
    private Double maxCapacity;

    public GasTank(String gasStationId, String gasPumpId, FuelType fuelType, Double totalFuelAmount, Double maxCapacity) {
        this.gasStationId = gasStationId;
        this.gasTankId = gasPumpId;
        this.fuelType = fuelType;
        this.totalFuelAmount = totalFuelAmount;
        this.maxCapacity = maxCapacity;
    }

    public GasTank() {}

    public String getGasStationId() {
        return gasStationId;
    }

    public void setGasStationId(String gasStationId) {
        this.gasStationId = gasStationId;
    }

    public String getGasTankId() {
        return gasTankId;
    }

    public void setGasTankId(String gasTankId) {
        this.gasTankId = gasTankId;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Double getTotalFuelAmount() {
        return totalFuelAmount;
    }

    public void setTotalFuelAmount(Double totalFuelAmount) {
        this.totalFuelAmount = totalFuelAmount;
    }

    public Double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
