/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: DriverFactory.java
 * Description: This class is the abstract factory class of drivers.
 */

package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.subscriber.Driver;

/**
 * This is the abstract DriverFactory class.
 * This class is responsible for representing a driver factory.
 */
public abstract class DriverFactory {

  /**
   * Creating a Driver object using the name.
   * @param name the name of the driver as a string.
   * @return a Driver object.
   */
  public abstract Driver createDriver(String name);
}

