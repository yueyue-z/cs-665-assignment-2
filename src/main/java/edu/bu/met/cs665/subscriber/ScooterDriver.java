/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: ScooterDriver.java
 * Description: This class extends Driver class and represents a concrete ScooterDriver.
 * It implements the updateSelf method to update the driver with a new delivery request.
 */

package edu.bu.met.cs665.subscriber;

import edu.bu.met.cs665.request.DeliveryRequest;

/**
 * This is the ScooterDriver class.
 * This class is responsible for representing a driver with a scooter vehicle type.
 */
public class ScooterDriver extends Driver {

  /**
   * Creates a new ScooterDriver with the given name and sets the vehicle type to "Scooter".
   * @param name The name of the ScooterDriver.
   */
  public ScooterDriver(String name) {
    this.name = name;
    this.vehicleType = "Scooter";
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
      System.out.println("Scooter driver " + name + ": New delivery request received for address "
          + deliveryRequest.getCustomerAddress() + " from " + deliveryRequest.getShopName());
    }
  }
}
