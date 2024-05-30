/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.driver;
public class Computer extends Device {
    private String type; // Laptop or Desktop
    private OperatingSystem os;

    public Computer(String brand, String model, String type, User user, OperatingSystem os) {
        super(brand, model, user);
        this.type = type;
        this.os = os;
    }

    @Override
    public void start() {
        System.out.println("Computer starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("Computer shutting down...");
    }

    public String getType() {
        return type;
    }

    public OperatingSystem getOperatingSystem() {
        return os;
    }
}
