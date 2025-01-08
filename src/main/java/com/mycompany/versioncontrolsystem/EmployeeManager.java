/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.versioncontrolsystem;

/**
 *
 * @author hellblazer
 */
import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
        System.out.println("Employee added: ID " + id + ", Name " + name);
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }
}

