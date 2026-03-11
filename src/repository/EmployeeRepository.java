package repository;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeRepository {
    private final HashMap<String, Employee> employeeMap = new HashMap<String, Employee>();

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
    }

    public Employee findEmployeeById(String id) {
        return employeeMap.get(id);
    }

    public ArrayList<Employee> findAll() {
        return new ArrayList<Employee>(employeeMap.values());
    }

    public ArrayList<Employee> findByGasStation(String gasStationId) {
        ArrayList<Employee> employeesByGasStation = new ArrayList<>();

        for (Employee employee : employeeMap.values()){
            if (employee.getGasStationId().equals(gasStationId)){
                employeesByGasStation.add(employee);
            }
        }

        return employeesByGasStation;
    }

    public void deleteEmployeeById(Employee employee) {
        employeeMap.remove(employee.getEmployeeId());
    }

}
