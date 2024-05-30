/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.driver;
public class Phone extends Device {
    private Battery battery;
    private OperatingSystem os;

    public Phone(String brand, String model, Battery battery, User user, OperatingSystem os) {
        super(brand, model, user);
        this.battery = battery;
        this.os = os;
    }

    @Override
    public void start() {
        System.out.println("Phone starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("Phone shutting down...");
    }

    public Battery getBattery() {
        return battery;
    }

    public OperatingSystem getOperatingSystem() {
        return os;
    }
}
