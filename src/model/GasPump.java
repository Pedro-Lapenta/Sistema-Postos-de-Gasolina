package model;

import model.enums.FuelType;

/**
 * Entidade GasPump — representa uma bomba de combustível.
 * GRASP Especialista: acumula o total de litros abastecidos pela bomba.
 */
public class GasPump {

    private String gasPumpId;
    private String gasStationId;
    private String gasTankId;
    private FuelType fuelType;
    private double totalFueledAmount;


    public GasPump(String gasPumpId, String gasStationId, String gasTankId,
                   FuelType fuelType, double totalFueledAmount) {
        this.gasPumpId         = gasPumpId;
        this.gasStationId      = gasStationId;
        this.gasTankId         = gasTankId;
        this.fuelType          = fuelType;
        this.totalFueledAmount = totalFueledAmount;
    }

    public GasPump() {}


    /**
     * RF_F3 — Incrementa o acumulado de litros abastecidos pela bomba.
     *
     * @param volume litros abastecidos na operação
     */
    public void registrarAbastecimento(double volume) {
        this.totalFueledAmount += volume;
    }


    public String getGasPumpId() { return gasPumpId; }
    public void setGasPumpId(String gasPumpId) { this.gasPumpId = gasPumpId; }

    public String getGasStationId() { return gasStationId; }
    public void setGasStationId(String gasStationId) { this.gasStationId = gasStationId; }

    public String getGasTankId() { return gasTankId; }
    public void setGasTankId(String gasTankId) { this.gasTankId = gasTankId; }

    public FuelType getFuelType() { return fuelType; }
    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }

    public double getTotalFueledAmount() { return totalFueledAmount; }
    public void setTotalFueledAmount(double totalFueledAmount) { this.totalFueledAmount = totalFueledAmount; }
}
