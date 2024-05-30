/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.driver;
public abstract class Device implements Operable {
    protected String brand;
    protected String model;
    protected User user;

    public Device(String brand, String model, User user) {
        this.brand = brand;
        this.model = model;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public abstract void start();

    @Override
    public abstract void shutdown();
}
