package model;

import model.enums.FuelType;

public class GasPump {
    private String gasStationId;
    private String gasPumpId;
    private String gasTankId;
    private FuelType fuelType;
    private Double totalFueledAmount;

    public GasPump(String gasStationId, String gasPumpId, String gasTankId, FuelType fuelType, Double totalFueledAmount) {
        this.gasStationId = gasStationId;
        this.gasPumpId = gasPumpId;
        this.gasTankId = gasTankId;
        this.fuelType = fuelType;
        this.totalFueledAmount = totalFueledAmount;
    }

    public String getGasStationId() {
        return gasStationId;
    }

    public void setGasStationId(String gasStationId) {
        this.gasStationId = gasStationId;
    }

    public String getGasPumpId() {
        return gasPumpId;
    }

    public void setGasPumpId(String gasPumpId) {
        this.gasPumpId = gasPumpId;
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

    public Double getTotalFueledAmount() {
        return totalFueledAmount;
    }

    public void setTotalFueledAmount(Double totalFueledAmount) {
        this.totalFueledAmount = totalFueledAmount;
    }
}
