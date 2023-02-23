/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: TaxiDriver.java
 * Description: This class is a subclass of Driver class and represents a Taxi driver.
 * It contains a constructor to create a new instance of Taxi driver with the given name.
 * It overrides the updateSelf() method to handle delivery request updates specific to
 * Taxi drivers.
 */

package edu.bu.met.cs665.subscriber;

import edu.bu.met.cs665.request.DeliveryRequest;

/**
 * This is the TaxiDriver class.
 * This class is a subclass of Driver class and represents a Taxi driver.
 */
public class TaxiDriver extends Driver {

  /**
   * Constructs a new TaxiDriver object with given name.
   *
   * @param name name of the driver as a string
   */
  public TaxiDriver(String name) {
    this.name = name;
    this.vehicleType = "Taxi";
    System.out.println("Created new " + vehicleType + " driver: " + name);
  }

  /**
   * Update the driver with a delivery request and print out the details of the request,
   * if the driver is available.
   *
   * @param deliveryRequest the delivery request as a DeliveryRequest object
   */
  @Override
  public void updateSelf(DeliveryRequest deliveryRequest) {
    if (this.availability) {
      this.latestDeliveryRequest = deliveryRequest;
      System.out.println("Taxi driver " + name + ": New delivery request received for address "
          + deliveryRequest.getCustomerAddress() + " from " + deliveryRequest.getShopName());
    }
  }
}
