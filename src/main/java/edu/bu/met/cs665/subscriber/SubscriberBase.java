/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: SubscriberBase.java
 * Description: This interface represents a base interface for all subscribers of delivery requests.
 */

package edu.bu.met.cs665.subscriber;

import edu.bu.met.cs665.request.DeliveryRequest;

/**
 * This is the SubscriberBase interface.
 * It defines an update method for subscribers in an subscriber pattern.
 */

public interface SubscriberBase {

  /**
   * Update the subscriber with the delivery request sent by the subject.
   *
   * @param deliveryRequest the delivery request sent by the subject
   */
  void updateSelf(DeliveryRequest deliveryRequest);
}
