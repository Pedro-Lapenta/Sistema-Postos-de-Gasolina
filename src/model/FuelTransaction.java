package model;

import model.enums.FuelType;
import model.enums.PaymentMethod;

import java.util.Date;

public class FuelTransaction {

    private String transactionId;
    private String gasStationId;
    private String gasPumpId;
    private FuelType fuelType;
    private double fuelledAmount;   // litros abastecidos
    private double payedAmount;     // valor bruto cobrado (volume × preço)
    private PaymentMethod paymentMethod;
    private double totalReceived;   // valor líquido após taxa do método de pagamento
    private Date dateTime;
    private boolean isSimulated;

    public FuelTransaction(String transactionId, String gasStationId, String gasPumpId,
                           FuelType fuelType, double fuelledAmount, double payedAmount,
                           PaymentMethod paymentMethod, Date dateTime, boolean isSimulated) {
        this.transactionId  = transactionId;
        this.gasStationId   = gasStationId;
        this.gasPumpId      = gasPumpId;
        this.fuelType       = fuelType;
        this.fuelledAmount  = fuelledAmount;
        this.payedAmount    = payedAmount;
        this.paymentMethod  = paymentMethod;
        this.dateTime       = dateTime;
        this.isSimulated    = isSimulated;
    }

    public FuelTransaction() {}


    public void calcularValorLiquido() {
        this.totalReceived = payedAmount * (1.0 - paymentMethod.getRate());
    }

    /**
     * RF_F4 — Calcula o lucro bruto desta transação.
     * lucro = payedAmount - (fuelledAmount × costPerLiter)
     *
     * @param costPerLiter custo de compra do combustível por litro (do último TankRefuel)
     * @return lucro bruto da transação
     */
    public double calcularLucroBruto(double costPerLiter) {
        return payedAmount - (fuelledAmount * costPerLiter);
    }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getGasStationId() { return gasStationId; }
    public void setGasStationId(String gasStationId) { this.gasStationId = gasStationId; }

    public String getGasPumpId() { return gasPumpId; }
    public void setGasPumpId(String gasPumpId) { this.gasPumpId = gasPumpId; }

    public FuelType getFuelType() { return fuelType; }
    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }

    public double getFuelledAmount() { return fuelledAmount; }
    public void setFuelledAmount(double fuelledAmount) { this.fuelledAmount = fuelledAmount; }

    public double getPayedAmount() { return payedAmount; }
    public void setPayedAmount(double payedAmount) { this.payedAmount = payedAmount; }

    public PaymentMethod getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(PaymentMethod paymentMethod) { this.paymentMethod = paymentMethod; }

    public double getTotalReceived() { return totalReceived; }
    public void setTotalReceived(double totalReceived) { this.totalReceived = totalReceived; }

    public Date getDateTime() { return dateTime; }
    public void setDateTime(Date dateTime) { this.dateTime = dateTime; }

    public boolean isSimulated() { return isSimulated; }
    public void setSimulated(boolean simulated) { isSimulated = simulated; }
}
