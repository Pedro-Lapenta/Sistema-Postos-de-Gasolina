package model.enums;

public enum PaymentMethod {
    DINHEIRO(0.0),
    PIX(0.0),
    DEBITO(0.01),
    CREDITO(0.03);

    private final Double rate;

    PaymentMethod(Double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }
}