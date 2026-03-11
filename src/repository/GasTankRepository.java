package repository;

import model.GasTank;
import model.enums.FuelType;

import java.util.ArrayList;
import java.util.HashMap;

/*
* findByGasStationId(String gasStationId)  → listar todos os tanques de um posto
* findByFuelType(String gasStationId, FuelType fuelType) → buscar tanque pelo tipo de combustível (útil no abastecimento)
*/
public class GasTankRepository {
    private final HashMap<String, GasTank> gasTankMap = new HashMap<String, GasTank>();

    public void saveGasTank(GasTank gasTank) {
        gasTankMap.put(gasTank.getGasTankId(), gasTank);
    }

    public GasTank findGasTankById(String id) {
        return gasTankMap.get(id);
    }

    public ArrayList<GasTank> findAllGasTanks() {
        return new  ArrayList<>(gasTankMap.values());
    }

    public ArrayList<GasTank> findByGasStationId(String gasStationId) {
        ArrayList<GasTank> gasTanks = new ArrayList<>();

        for (GasTank gasTank : gasTankMap.values()) {
            if (gasTank.getGasStationId().equals(gasStationId)) {
                gasTanks.add(gasTank);
            }
        }

        return gasTanks;
    }

    public ArrayList<GasTank> findGasTanksByFuelType(String gasStationId, FuelType fuelType) {
        ArrayList<GasTank> gasTanks = new ArrayList<>();

        for (GasTank gasTank : gasTankMap.values()) {
            if (gasTank.getGasStationId().equals(gasStationId) && gasTank.getFuelType().equals(fuelType)) {
                gasTanks.add(gasTank);
            }
        }

        return gasTanks;
    }

    public void deleteGasTankById(String id) {
        gasTankMap.remove(id);
    }
}
