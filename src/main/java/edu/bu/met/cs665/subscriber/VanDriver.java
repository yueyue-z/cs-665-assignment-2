/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: TaxiDriver.java
 * Description: This class is a subclass of Driver class and represents a Van driver.
 * It contains a constructor to create a new instance of Van driver with the given name.
 * It overrides the updateSelf() method to handle delivery request updates specific to
 * Van drivers.
 */

package edu.bu.met.cs665.subscriber;

import edu.bu.met.cs665.request.DeliveryRequest;
/**
 * This is the VanDriver class.
 * This class is a subclass of Driver class and represents a Taxi driver.
 */

public class VanDriver extends Driver {

  /**
   * Constructs a new VanDriver object with given name.
   *
   * @param name name of the driver as a string
   */
  public VanDriver(String name) {
    this.name = name;
    this.vehicleType = "Van";
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
      System.out.println("Van driver " + name + ": New delivery request received for address "
          + deliveryRequest.getCustomerAddress() + " from " + deliveryRequest.getShopName());
    }
  }
}
