/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: Main.java
 * Description: The Main class is the entry point of the program, and provides a main method
 * to demonstrate the subscriber pattern implementation.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.factory.DriverFactory;
import edu.bu.met.cs665.factory.ScooterDriverFactory;
import edu.bu.met.cs665.factory.TaxiDriverFactory;
import edu.bu.met.cs665.factory.VanDriverFactory;
import edu.bu.met.cs665.request.DeliveryRequest;
import edu.bu.met.cs665.subject.Shop;
import edu.bu.met.cs665.subscriber.Driver;


/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples where a shop, different types of drivers are created
   * and a delivery request from the shop is sent.
   */
  public static void main(String[] args) {

    // Create a shop and delivery request
    Shop shop = new Shop("Boston Seafood");

    // Create drivers using driver factories
    DriverFactory vanDriverFactory = new VanDriverFactory();
    Driver vanDriver = vanDriverFactory.createDriver("Steven");
    DriverFactory taxiDriverFactory = new TaxiDriverFactory();
    Driver taxiDriver = taxiDriverFactory.createDriver("Amy");
    DriverFactory scooterDriverFactory = new ScooterDriverFactory();
    Driver scooterDriver1 = scooterDriverFactory.createDriver("Alex");
    Driver scooterDriver2 = scooterDriverFactory.createDriver("Sam");
    Driver scooterDriver3 = scooterDriverFactory.createDriver("Lee");

    // Register drivers as observers of the shop
    shop.registerSubscribers(vanDriver);
    shop.registerSubscribers(taxiDriver);
    shop.registerSubscribers(scooterDriver1);
    shop.registerSubscribers(scooterDriver2);
    shop.registerSubscribers(scooterDriver3);

    // Print the driver names
    System.out.println(vanDriver.getName());
    System.out.println(taxiDriver.getName());
    System.out.println(scooterDriver1.getName());
    System.out.println(scooterDriver2.getName());
    System.out.println(scooterDriver3.getName());

    // Set scooterDriver 2 and 3 to be not available
    // - so that they will not accept the delivery request
    scooterDriver2.setAvailability(false);
    scooterDriver3.setAvailability(false);

    // Create a delivery request and the shop sends it to the observers
    DeliveryRequest deliveryRequest = new DeliveryRequest(shop, "1010 Commonwealth Street");
    shop.setDeliveryRequest(deliveryRequest);

  }

}
