package model;

import model.enums.Role;

/**
 * Entidade Employee
 */
public class Employee {

    private String employeeId;
    private String gasStationId;
    private String employeeName;
    private double salary;
    private String password;
    private Role role;
    private boolean isActive;

    public Employee(String employeeId, String gasStationId, String employeeName,
                    double salary, String password, Role role) {
        this.employeeId   = employeeId;
        this.gasStationId = gasStationId;
        this.employeeName = employeeName;
        this.salary       = salary;
        this.password     = password;
        this.role         = role;
        this.isActive     = true;
    }

    public Employee() {}

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getGasStationId() { return gasStationId; }
    public void setGasStationId(String gasStationId) { this.gasStationId = gasStationId; }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
}
