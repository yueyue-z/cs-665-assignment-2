/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: TaxiDriverFactory.java
 * Description: This class represents a factory that creates TaxiDriver objects.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.subscriber.Driver;
import edu.bu.met.cs665.subscriber.TaxiDriver;

/**
 * This is the TaxiDriverFactory class.
 * This class is responsible to generate TaxiDriver objects.
 */
public class TaxiDriverFactory extends DriverFactory {
  /**
   * Creates a TaxiDriverFactory object with the given name.
   *
   * @param name Name of the driver to be created.
   * @return ScooterDriver object with the given name.
   */
  @Override
  public Driver createDriver(String name) {
    return new TaxiDriver(name);
  }
}

