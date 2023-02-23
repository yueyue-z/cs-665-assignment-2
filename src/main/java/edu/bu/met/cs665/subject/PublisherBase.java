/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: PublisherBase.java
 * Description: The PublisherBase interface represents the subject in the Observer pattern.
 * It provides methods for registering, removing and notifying subscribers/observers.
 */

package edu.bu.met.cs665.subject;

import edu.bu.met.cs665.subscriber.SubscriberBase;

/**
 * This is the PublisherBase interface.
 * This interface represents the subject in the Observer pattern .
 */
public interface PublisherBase {

  /**
   * Register a subscriber to the subject.
   * @param subscriber the subscriber to be registered
   */
  void registerSubscribers(SubscriberBase subscriber);

  /**
   * Remove a subscriber from the subject.
   * @param subscriber the subscriber to be removed
   */
  void removeSubscriber(SubscriberBase subscriber);

  /**
   * Notify all observers about a change.
   */
  void notifySubscribers();
}
