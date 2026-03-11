package repository;

import model.GasStation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GasStationRepository {
    private final HashMap<String, GasStation> gasStationMap = new HashMap<String, GasStation>();

    public void addGasStation(GasStation gasStation) {
        gasStationMap.put(gasStation.getGasStationId(), gasStation);
    }

    public GasStation findGasStationById(String gasStationId) {
        return gasStationMap.get(gasStationId);
    }

    public List<GasStation> findAll() {
        return new ArrayList<GasStation>(gasStationMap.values());
    }

    public void deleteGasStationById(String gasStationId) {
        gasStationMap.remove(gasStationId);
    }
}
