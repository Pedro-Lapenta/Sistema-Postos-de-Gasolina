package model;

public class GasStation {
    private String gasStationId;
    private String gasStationName;
    private Double dieselPrice;
    private Double gasolinePrice;
    private Double ethanolPrice;
    private Double totalExpenses;
    private Double totalRevenue;
    private Double profit;

    public GasStation(String gasStationId, String gasStationName, Double dieselPrice, Double gasolinePrice, Double ethanolPrice,
                      Double totalExpenses, Double totalRevenue, Double profit) {
        this.gasStationId = gasStationId;
        this.gasStationName = gasStationName;
        this.dieselPrice = dieselPrice;
        this.gasolinePrice = gasolinePrice;
        this.ethanolPrice = ethanolPrice;
        this.totalExpenses = totalExpenses;
        this.totalRevenue = totalRevenue;
        this.profit = profit;
    }

    public GasStation() {}

    public String getGasStationId() {
        return gasStationId;
    }

    public void setGasStationId(String gasStationId) {
        this.gasStationId = gasStationId;
    }

    public String getGasStationName() {
        return gasStationName;
    }

    public void setGasStationName(String gasStationName) {
        this.gasStationName = gasStationName;
    }

    public Double getDieselPrice() {
        return dieselPrice;
    }

    public void setDieselPrice(Double dieselPrice) {
        this.dieselPrice = dieselPrice;
    }

    public Double getGasolinePrice() {
        return gasolinePrice;
    }

    public void setGasolinePrice(Double gasolinePrice) {
        this.gasolinePrice = gasolinePrice;
    }

    public Double getEthanolPrice() {
        return ethanolPrice;
    }

    public void setEthanolPrice(Double ethanolPrice) {
        this.ethanolPrice = ethanolPrice;
    }

    public Double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(Double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }
}
