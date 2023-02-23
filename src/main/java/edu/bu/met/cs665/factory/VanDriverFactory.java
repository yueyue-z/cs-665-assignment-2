/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: VanDriverFactory.java
 * Description: This class represents a factory that creates VanDriver objects.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.subscriber.Driver;
import edu.bu.met.cs665.subscriber.VanDriver;

/**
 * This is the VanDriverFactory class.
 * This class is responsible to generate VanDriver objects.
 */
public class VanDriverFactory extends DriverFactory {

  /**
   * Creates a VanDriverFactory object with the given name.
   *
   * @param name Name of the driver to be created.
   * @return ScooterDriver object with the given name.
   */
  @Override
  public Driver createDriver(String name) {
    return new VanDriver(name);
  }
}

