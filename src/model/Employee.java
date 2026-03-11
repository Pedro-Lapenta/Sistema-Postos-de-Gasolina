package model;

import javax.management.relation.Role;

public class Employee {
    private String gasStationId;
    private String employeeId;
    private String employeeName;
    private Double salary;
    private Boolean isActive;
    private Role role;


    public Employee(String gasStationId, Double salary, String employeeId, String employeeName, Boolean isActive, Role role) {
        this.gasStationId = gasStationId;
        this.salary = salary;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.isActive = isActive;
        this.role = role;
    }

    public Employee() {}

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getGasStationId() {
        return gasStationId;
    }

    public void setGasStationId(String gasStationId) {
        this.gasStationId = gasStationId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
