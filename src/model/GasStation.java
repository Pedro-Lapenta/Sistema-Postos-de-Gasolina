package model;

import model.enums.FuelType;

/**
 * Entidade GasStation
 */
public class GasStation {

    private String gasStationId;
    private String name;
    private String address;
    private String cnpj;
    private double gasolinePrice;
    private double dieselPrice;
    private double ethanolPrice;
    private double totalRevenue;
    private double totalExpenses;
    private double profit;

    public GasStation(String gasStationId, String name, String address, String cnpj,
                      double gasolinePrice, double dieselPrice, double ethanolPrice,
                      double totalRevenue, double totalExpenses) {
        this.gasStationId  = gasStationId;
        this.name          = name;
        this.address       = address;
        this.cnpj          = cnpj;
        this.gasolinePrice = gasolinePrice;
        this.dieselPrice   = dieselPrice;
        this.ethanolPrice  = ethanolPrice;
        this.totalRevenue  = totalRevenue;
        this.totalExpenses = totalExpenses;
        recalcularLucro();
    }

    public GasStation() {}

    /**
     * RN implicita — profit = totalRevenue - totalExpenses.
     * Deve ser chamado pelo Controller sempre que revenue ou expenses mudar.
     */
    public void recalcularLucro() {
        this.profit = this.totalRevenue - this.totalExpenses;
    }

    /**
     * Retorna o preço por litro do tipo de combustível informado.
     *
     * @param fuelType tipo de combustível
     * @return preço por litro
     * @throws IllegalArgumentException se o tipo não for reconhecido
     */
    public double obterPreco(FuelType fuelType) {
        switch (fuelType) {
            case GASOLINA: return gasolinePrice;
            case DIESEL:   return dieselPrice;
            case ETANOL:   return ethanolPrice;
            default: throw new IllegalArgumentException("Tipo de combustível desconhecido: " + fuelType);
        }
    }

    public String getGasStationId() { return gasStationId; }
    public void setGasStationId(String gasStationId) { this.gasStationId = gasStationId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public double getGasolinePrice() { return gasolinePrice; }
    public void setGasolinePrice(double gasolinePrice) { this.gasolinePrice = gasolinePrice; }

    public double getDieselPrice() { return dieselPrice; }
    public void setDieselPrice(double dieselPrice) { this.dieselPrice = dieselPrice; }

    public double getEthanolPrice() { return ethanolPrice; }
    public void setEthanolPrice(double ethanolPrice) { this.ethanolPrice = ethanolPrice; }

    public double getTotalRevenue() { return totalRevenue; }
    public void setTotalRevenue(double totalRevenue) { this.totalRevenue = totalRevenue; }

    public double getTotalExpenses() { return totalExpenses; }
    public void setTotalExpenses(double totalExpenses) { this.totalExpenses = totalExpenses; }

    public double getProfit() { return profit; }
    public void setProfit(double profit) { this.profit = profit; }
}
