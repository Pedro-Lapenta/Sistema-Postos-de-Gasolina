package repository;

import model.FuelTransaction;

import java.util.ArrayList;
import java.util.HashMap;

public class FuelTransactionRepository {
    private final HashMap<String, FuelTransaction> fuelTransactionMap = new HashMap<String, FuelTransaction>();

    public void addFuelTransaction(FuelTransaction fuelTransaction) {
        fuelTransactionMap.put(fuelTransaction.getTransactionId(), fuelTransaction);
    }

    public FuelTransaction findFuelTransactionById(String id) {
        return fuelTransactionMap.get(id);
    }

    public ArrayList<FuelTransaction> findAll() {
        return new ArrayList<>(fuelTransactionMap.values());
    }

    public ArrayList<FuelTransaction> findAllFuelTransactionsByGasStation(String gasStationId) {
        ArrayList<FuelTransaction> fuelTransactions = new ArrayList<>();

        for (FuelTransaction fuelTransaction : fuelTransactionMap.values()) {
            if (fuelTransaction.getGasStationId().equals(gasStationId)) {
                fuelTransactions.add(fuelTransaction);
            }
        }
        return fuelTransactions;
    }

    public void deleteFuelTransactionById(String id) {
        fuelTransactionMap.remove(id);
    }

}
