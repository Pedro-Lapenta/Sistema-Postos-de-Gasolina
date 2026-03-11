package repository;

import model.TankRefuel;

import java.util.ArrayList;
import java.util.HashMap;

public class TankRefuelRepository {
    private final HashMap<String, TankRefuel> tankRefuelMap = new HashMap<String, TankRefuel>();

    public void addTankRefuel(TankRefuel tankRefuel) {
        tankRefuelMap.put(tankRefuel.getTankRefuelId(), tankRefuel);
    }

    public TankRefuel findTankRefuelById(String tankRefuelId) {
        return tankRefuelMap.get(tankRefuelId);
    }

    public ArrayList<TankRefuel> findAll() {
        return new ArrayList<>(tankRefuelMap.values());
    }

    public ArrayList<TankRefuel> findByGasStationId(String gasStationId) {
        ArrayList<TankRefuel> tankRefuels = new ArrayList<>();

        for (TankRefuel tankRefuel : tankRefuelMap.values()) {
            if (tankRefuel.getGasStationId().equals(gasStationId)) {
                tankRefuels.add(tankRefuel);
            }
        }

        return tankRefuels;
    }

    public void deleteTankRefuelById(String tankRefuelId) {
        tankRefuelMap.remove(tankRefuelId);
    }
}
