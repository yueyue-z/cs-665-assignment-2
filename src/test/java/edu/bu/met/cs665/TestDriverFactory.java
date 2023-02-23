/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: TestDriverFactory.java
 * Description: This class is to test the functions of the driver factory.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.factory.DriverFactory;
import edu.bu.met.cs665.factory.ScooterDriverFactory;
import edu.bu.met.cs665.factory.TaxiDriverFactory;
import edu.bu.met.cs665.factory.VanDriverFactory;
import edu.bu.met.cs665.subscriber.Driver;
import edu.bu.met.cs665.subscriber.ScooterDriver;
import edu.bu.met.cs665.subscriber.TaxiDriver;
import edu.bu.met.cs665.subscriber.VanDriver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A class to test the functionality of different driver factories.
 */
public class TestDriverFactory {

  /**
   * Tests the creation of van drivers using the van driver factory.
   */
  @Test
  public void testVanDriverFactory() {
    DriverFactory factory = new VanDriverFactory();
    Driver driver1 = factory.createDriver("Amy");
    Driver driver2 = factory.createDriver("Lisa");
    Driver driver3 = factory.createDriver("John");
    assertEquals(VanDriver.class, driver1.getClass());
    assertEquals(VanDriver.class, driver2.getClass());
    assertEquals(VanDriver.class, driver3.getClass());
    assertEquals("Amy", driver1.getName());
    assertEquals("Lisa", driver2.getName());
    assertEquals("John", driver3.getName());
  }

  /**
   * Tests the creation of taxi drivers using the taxi driver factory.
   */
  @Test
  public void testTaxiDriverFactory() {
    DriverFactory factory = new TaxiDriverFactory();
    Driver driver = factory.createDriver("Peter");
    assertEquals(TaxiDriver.class, driver.getClass());
    assertEquals("Peter", driver.getName());
  }

  /**
   * Tests the creation of scooter drivers using the scooter driver factory.
   */
  @Test
  public void testScooterDriverFactory() {
    DriverFactory factory = new ScooterDriverFactory();
    Driver driver = factory.createDriver("Sam");
    assertEquals(ScooterDriver.class, driver.getClass());
    assertEquals("Sam", driver.getName());
  }

}
