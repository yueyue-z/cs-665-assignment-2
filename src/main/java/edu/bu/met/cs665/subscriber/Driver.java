/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: Driver.java
 * Description: This class is responsible for the methods and attributes of a driver.
 */

package edu.bu.met.cs665.subscriber;

import edu.bu.met.cs665.request.DeliveryRequest;

/**
 * This is the Driver class.
 * This class is responsible for representing a driver.
 */
public abstract class Driver implements SubscriberBase {

  protected String name;
  protected String vehicleType;
  protected Boolean availability = true;
  protected DeliveryRequest latestDeliveryRequest;

  /**
   * Setter method for name.
   * @param name The name to assign to this driver as a string.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter method for name.
   * @return The name of this driver.
   */
  public String getName() {
    return name;
  }

  /**
   * Setter method for vehicle type.
   * @param vehicleType The type of the driver's vehicle as a string.
   */
  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  /**
   * Getter method for vehicle type.
   * @return The type of the driver's vehicle.
   */
  public String getVehicleType() {
    return vehicleType;
  }

  /**
   * Setter method for availability.
   * @param availability The availability to assign to this driver.
   */
  public void setAvailability(boolean availability) {
    this.availability = availability;
  }

  /**
   * Getter method for availability.
   * @return The availability of this driver.
   */
  public boolean availability() {
    return availability;
  }

  /**
   * Getter method for delivery request.
   * @return The string of delivery request.
   */
  public DeliveryRequest getLatestDeliveryRequest() {
    return latestDeliveryRequest;
  }

  /**
   * This method will be called by the subject when there is an update.
   * @param deliveryRequest The updated delivery request.
   */
  public abstract void updateSelf(DeliveryRequest deliveryRequest);



}
