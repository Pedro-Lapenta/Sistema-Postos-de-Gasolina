package model;

import model.enums.FuelType;
import model.enums.TankStatus;

/**
 * Entidade GasTank
 */
public class GasTank {

    private String gasTankId;
    private String gasStationId;
    private FuelType fuelType;
    private double totalFuelAmount;
    private double maxCapacity;
    private double criticalLimit;
    private TankStatus status;

    public GasTank(String gasTankId, String gasStationId, FuelType fuelType,
                   double totalFuelAmount, double maxCapacity, double criticalLimit) {
        this.gasTankId       = gasTankId;
        this.gasStationId    = gasStationId;
        this.fuelType        = fuelType;
        this.totalFuelAmount = totalFuelAmount;
        this.maxCapacity     = maxCapacity;
        this.criticalLimit   = criticalLimit;
        this.status          = TankStatus.NORMAL;
        verificarNivelCritico(); // status inicial coerente com o estoque
    }

    public GasTank() {}

    /**
     * RN_05 — Deduz volume do estoque.
     * Lança exceção se o estoque for insuficiente.
     *
     * @param volume litros a debitar (deve ser > 0)
     * @throws IllegalArgumentException se volume for inválido
     * @throws IllegalStateException    se estoque insuficiente
     */
    public void debitar(double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Volume de débito deve ser maior que zero.");
        }
        if (volume > totalFuelAmount) {
            throw new IllegalStateException(
                String.format("Estoque insuficiente. Disponível: %.2f L, solicitado: %.2f L.",
                              totalFuelAmount, volume));
        }
        totalFuelAmount -= volume;
    }

    /**
     * Adiciona volume ao tanque (reabastecimento).
     * Lança exceção se ultrapassar capacidade máxima.
     *
     * @param volume litros a adicionar (deve ser > 0)
     * @throws IllegalArgumentException se volume for inválido ou exceder capacidade
     */
    public void abastecer(double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Volume de abastecimento deve ser maior que zero.");
        }
        if (totalFuelAmount + volume > maxCapacity) {
            throw new IllegalArgumentException(
                String.format("Volume excede a capacidade máxima. Capacidade livre: %.2f L, solicitado: %.2f L.",
                              maxCapacity - totalFuelAmount, volume));
        }
        totalFuelAmount += volume;
    }

    /**
     * RN_03 — Verifica nível crítico e altera status para CRITICO se necessário.
     * Só faz a transição a partir do estado NORMAL; estados CRITICO e MANUTENCAO
     * não são sobrescritos aqui.
     *
     * @return true se o tanque ACABOU DE entrar no estado CRITICO nesta chamada
     */
    public boolean verificarNivelCritico() {
        if (status == TankStatus.NORMAL && totalFuelAmount < criticalLimit) {
            status = TankStatus.CRITICO;
            return true;
        }
        return false;
    }

    /**
     * RN_01 — Indica se o tanque está disponível para abastecimento.
     *
     * @return true somente se status == NORMAL
     */
    public boolean estaOperacional() {
        return status == TankStatus.NORMAL;
    }

    // ── Getters e Setters ─────────────────────────────────────────────────────

    public String getGasTankId() { return gasTankId; }
    public void setGasTankId(String gasTankId) { this.gasTankId = gasTankId; }

    public String getGasStationId() { return gasStationId; }
    public void setGasStationId(String gasStationId) { this.gasStationId = gasStationId; }

    public FuelType getFuelType() { return fuelType; }
    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }

    public double getTotalFuelAmount() { return totalFuelAmount; }
    public void setTotalFuelAmount(double totalFuelAmount) { this.totalFuelAmount = totalFuelAmount; }

    public double getMaxCapacity() { return maxCapacity; }
    public void setMaxCapacity(double maxCapacity) { this.maxCapacity = maxCapacity; }

    public double getCriticalLimit() { return criticalLimit; }
    public void setCriticalLimit(double criticalLimit) { this.criticalLimit = criticalLimit; }

    public TankStatus getStatus() { return status; }
    public void setStatus(TankStatus status) { this.status = status; }
}
