package model;

import model.enums.FuelType;

import java.util.Date;

/**
 * Entidade TankRefuel
 */
public class TankRefuel {

    private String tankRefuelId;
    private String gasStationId;
    private String gasTankId;
    private FuelType fuelType;
    private double fuelAmount;   // litros comprados
    private double fuelPrice;    // preço por litro na compra
    private Date dateTime;

    public TankRefuel(String tankRefuelId, String gasStationId, String gasTankId,
                      FuelType fuelType, double fuelAmount, double fuelPrice, Date dateTime) {
        this.tankRefuelId = tankRefuelId;
        this.gasStationId = gasStationId;
        this.gasTankId    = gasTankId;
        this.fuelType     = fuelType;
        this.fuelAmount   = fuelAmount;
        this.fuelPrice    = fuelPrice;
        this.dateTime     = dateTime;
    }

    public TankRefuel() {}

    /**
     * Calcula o custo total desta compra de combustível.
     *
     * @return fuelAmount × fuelPrice
     */
    public double calcularCustoTotal() {
        return fuelAmount * fuelPrice;
    }

    public String getTankRefuelId() { return tankRefuelId; }
    public void setTankRefuelId(String tankRefuelId) { this.tankRefuelId = tankRefuelId; }

    public String getGasStationId() { return gasStationId; }
    public void setGasStationId(String gasStationId) { this.gasStationId = gasStationId; }

    public String getGasTankId() { return gasTankId; }
    public void setGasTankId(String gasTankId) { this.gasTankId = gasTankId; }

    public FuelType getFuelType() { return fuelType; }
    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }

    public double getFuelAmount() { return fuelAmount; }
    public void setFuelAmount(double fuelAmount) { this.fuelAmount = fuelAmount; }

    public double getFuelPrice() { return fuelPrice; }
    public void setFuelPrice(double fuelPrice) { this.fuelPrice = fuelPrice; }

    public Date getDateTime() { return dateTime; }
    public void setDateTime(Date dateTime) { this.dateTime = dateTime; }
}
