package model;

import model.enums.FuelType;
import model.enums.PaymentMethod;

import java.util.Date;

public class FuelTransaction {
    private String gasStationId;
    private String gasPumpId;
    private String transactionId;
    private Double fuelledAmount;
    private Double payedAmount;
    private PaymentMethod paymentMethod;
    private FuelType fuelType;
    private Date dateTime;
    private Boolean isSimulated;

    public FuelTransaction(String gasStationId, FuelType fuelType, PaymentMethod paymentMethod, Double payedAmount,
                           Double fuelledAmount, String gasPumpId, String transactionId, Date dateTime, Boolean isSimulated) {
        this.gasStationId = gasStationId;
        this.fuelType = fuelType;
        this.paymentMethod = paymentMethod;
        this.payedAmount = payedAmount;
        this.fuelledAmount = fuelledAmount;
        this.gasPumpId = gasPumpId;
        this.transactionId = transactionId;
        this.dateTime = dateTime;
        this.isSimulated = isSimulated;
    }

    public Boolean getSimulated() {
        return isSimulated;
    }

    public void setSimulated(Boolean simulated) {
        isSimulated = simulated;
    }

    public FuelTransaction() {}

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

    public Double getFuelledAmount() {
        return fuelledAmount;
    }

    public void setFuelledAmount(Double fuelledAmount) {
        this.fuelledAmount = fuelledAmount;
    }

    public Double getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(Double payedAmount) {
        this.payedAmount = payedAmount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
