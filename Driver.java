/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.driver;
public class Driver {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem("Android", "10.0");
        User user = new User("Alice", "alice@example.com");
        Battery battery = new Battery(4000, "Li-ion");
        Phone phone = new Phone("Google", "Pixel", battery, user, os);
        Computer computer = new Computer("Dell", "XPS", "Laptop", user, os);

        phone.start();
        System.out.println("User: " + phone.getUser().getName() + ", Email: " + phone.getUser().getEmail());
        System.out.println("Phone Battery Capacity: " + phone.getBattery().getCapacity() + "mAh");
        System.out.println("Operating System: " + phone.getOperatingSystem().getName() + " " + phone.getOperatingSystem().getVersion());
        phone.shutdown();

        computer.start();
        System.out.println("Computer Type: " + computer.getType());
        System.out.println("Operating System: " + computer.getOperatingSystem().getName() + " " + computer.getOperatingSystem().getVersion());
        computer.shutdown();
    }
}
