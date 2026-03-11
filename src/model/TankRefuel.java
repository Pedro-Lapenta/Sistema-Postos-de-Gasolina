package model;

import model.enums.FuelType;
import model.enums.PaymentMethod;

import java.util.Date;

public class TankRefuel {
    private String tankRefuelId;
    private String gasStationId;
    private String gasTankId;
    private FuelType fuelType;
    private Double fuelAmount;
    private Double fuelPrice;
    private Date dateTime;

    public TankRefuel(String tankRefuelId, String gasStationId, String gasTankId, FuelType fuelType, Double fuelAmount, Double fuelPrice, Date dateTime) {
        this.tankRefuelId = tankRefuelId;
        this.gasStationId = gasStationId;
        this.gasTankId = gasTankId;
        this.fuelType = fuelType;
        this.fuelAmount = fuelAmount;
        this.fuelPrice = fuelPrice;
        this.dateTime = dateTime;
    }

    public TankRefuel() {}

    public String getTankRefuelId() {
        return tankRefuelId;
    }

    public void setTankRefuelId(String tankRefuelId) {
        this.tankRefuelId = tankRefuelId;
    }

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

    public FuelType getfuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(Double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public Double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(Double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
