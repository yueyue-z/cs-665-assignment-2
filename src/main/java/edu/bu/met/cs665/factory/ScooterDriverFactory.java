/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: ScooterDriverFactory.java
 * Description: This class represents a factory that creates ScooterDriver objects.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.subscriber.Driver;
import edu.bu.met.cs665.subscriber.ScooterDriver;

/**
 * This is the ScooterDriverFactory class.
 * This class is responsible to generate ScooterDriver objects.
 */

public class ScooterDriverFactory extends DriverFactory {

  /**
   * Creates a ScooterDriver object with the given name.
   *
   * @param name Name of the driver to be created.
   * @return ScooterDriver object with the given name.
   */
  @Override
  public Driver createDriver(String name) {
    return new ScooterDriver(name);
  }
}

