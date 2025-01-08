/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.versioncontrolsystem;

/**
 *
 * @author hellblazer
 */
import java.util.Scanner;
public class Versioncontrolsystem {

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();
                manager.addEmployee(id, name);
            } else if (choice == 2) {
                manager.viewEmployees();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
