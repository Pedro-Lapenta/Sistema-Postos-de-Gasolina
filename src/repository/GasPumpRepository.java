package repository;

import model.GasPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GasPumpRepository {
    private final HashMap<String, GasPump> gasPumpMap = new HashMap<>();

    public void addGasPump(GasPump gasPump) {
        gasPumpMap.put(gasPump.getGasPumpId(), gasPump);
    }

    public GasPump findGasPumpById(String id) {
        return gasPumpMap.get(id);
    }

    public List<GasPump> findAll() {
        return new ArrayList<GasPump>(gasPumpMap.values());
    }

    public List<GasPump> findGasStationByGasStationId(String gasStationId) {
        ArrayList<GasPump> gasStations = new ArrayList<>();

        for (GasPump gasPump : gasPumpMap.values()) {
            if (gasPump.getGasStationId().equals(gasStationId)) {
                gasStations.add(gasPump);
            }
        }

        return gasStations;
    }

    public void deleteGasPumpById(String id) {
        gasPumpMap.remove(id);
    }

}
