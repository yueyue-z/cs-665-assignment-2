/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: TestShop.java
 * Description: This class is to test the functions of the shop.
 */

package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.request.DeliveryRequest;
import edu.bu.met.cs665.factory.DriverFactory;
import edu.bu.met.cs665.factory.ScooterDriverFactory;
import edu.bu.met.cs665.factory.TaxiDriverFactory;
import edu.bu.met.cs665.factory.VanDriverFactory;
import edu.bu.met.cs665.subscriber.*;
import edu.bu.met.cs665.subject.Shop;
import org.junit.Test;

/**
 * This is the TestShop class.
 * This class contains unit tests for the shop activities
 * such as set delivery request.
 */


public class TestShop {

    /**
     * Test the setDeliveryRequest method of Shop.
     */
    @Test
    public void testSetDeliveryRequest() {
        // Create a new Shop
        Shop shop = new Shop("Boston Seafood");

        // Create drivers using driver factories
        // create drivers using driver factories
        DriverFactory vanDriverFactory = new VanDriverFactory();
        Driver vanDriver = vanDriverFactory.createDriver("Steven");
        DriverFactory taxiDriverFactory = new TaxiDriverFactory();
        Driver taxiDriver1 = taxiDriverFactory.createDriver("Amy");
        Driver taxiDriver2 = taxiDriverFactory.createDriver("Ben");
        Driver taxiDriver3 = taxiDriverFactory.createDriver("John");
        DriverFactory scooterDriverFactory = new ScooterDriverFactory();
        Driver scooterDriver = scooterDriverFactory.createDriver("Alex");

        // Register drivers as observers of the shop
        shop.registerSubscribers(vanDriver);
        shop.registerSubscribers(taxiDriver1);
        shop.registerSubscribers(taxiDriver2);
        shop.registerSubscribers(taxiDriver3);
        shop.registerSubscribers(scooterDriver);

        // Set the availability of scooterDriver as not available
        scooterDriver.setAvailability(false);

        // Create a delivery request and set it to the subject
        DeliveryRequest deliveryRequest = new DeliveryRequest(shop, "1010 Commonwealth Street");
        shop.setDeliveryRequest(deliveryRequest);

        // Verify that all available drivers were notified of the delivery request
        assertEquals(vanDriver.getLatestDeliveryRequest(), deliveryRequest);
        assertEquals(taxiDriver1.getLatestDeliveryRequest(), deliveryRequest);
        assertEquals(taxiDriver2.getLatestDeliveryRequest(), deliveryRequest);
        assertEquals(taxiDriver3.getLatestDeliveryRequest(), deliveryRequest);

        // Verify the unavailable driver did not update the delivery request in this scenario
        assertEquals(scooterDriver.getLatestDeliveryRequest(), null);

    }
}




