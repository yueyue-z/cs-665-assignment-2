/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: DeliveryRequest.java
 * Description: Description: This class represents a delivery request that
 * contains the shop where the order is placed and the customer's address.
 */

package edu.bu.met.cs665.request;

import edu.bu.met.cs665.subject.Shop;

/**

 This is the DeliveryRequest class.
 This class is responsible for representing a delivery request
 that contains the shop where the order is placed and the customer's address.
 */
public class DeliveryRequest {
  private Shop shop;
  private String customerAddress;

  /**
   * Create a DeliveryRequest object using shop and customerAddress.
   * @param shop the shop where the order is placed
   * @param customerAddress the customer's address
   */
  public DeliveryRequest(Shop shop, String customerAddress) {
    this.shop = new Shop(shop);
    this.customerAddress = customerAddress;
  }

  public String getCustomerAddress() {
    return customerAddress;
  }

  /**
   * Get the shop's name where the order is placed.
   * @return The shop's name where the order is placed.
   */
  public String getShopName() {
    return shop.getName();
  }
}
