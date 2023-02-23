/**
 * Name: YUEYUE ZHU
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2023
 * File Name: Shop.java
 * Description: This class represents a shop that generates delivery requests
 * and notifies its subscribers.
 */

package edu.bu.met.cs665.subject;

import edu.bu.met.cs665.request.DeliveryRequest;
import edu.bu.met.cs665.subscriber.SubscriberBase;
import java.util.ArrayList;
import java.util.List;

/**
 * The Shop class represents a shop that generates delivery requests and notifies its subscribers
 * when a new delivery request is generated.
 */
public class Shop implements PublisherBase {

  private String name;
  private DeliveryRequest deliveryRequest;
  private List<SubscriberBase> subscriberBases = new ArrayList<>();

  /**
   * Constructs a Shop object with a specified name.
   *
   * @param name the name of the shop.
   */
  public Shop(String name) {
    this.name = name;
  }

  /**
   * Constructs a Shop object by copying another Shop object.
   *
   * @param shop the Shop object to copy.
   */
  public Shop(Shop shop) {
    this.name = shop.name;
    this.deliveryRequest = shop.deliveryRequest;
    this.subscriberBases = new ArrayList<>(shop.subscriberBases);
  }

  /**
   * Registers a subscriber to receive updates from the shop.
   *
   * @param subscriber the subscriber to register.
   */
  @Override
  public void registerSubscribers(SubscriberBase subscriber) {
    subscriberBases.add(subscriber);
  }

  /**
   * Removes a subscriber from the shop's list of observers.
   *
   * @param subscriber the subscriber to remove.
   */
  @Override
  public void removeSubscriber(SubscriberBase subscriber) {
    subscriberBases.remove(subscriber);
  }

  /**
   * Notifies all registered observers that a new delivery request has been generated.
   */
  @Override
  public void notifySubscribers() {
    for (SubscriberBase subscriberBase : subscriberBases) {
      subscriberBase.updateSelf(deliveryRequest);
    }
  }

  /**
   * Sets the name of the shop.
   *
   * @param name the new name of the shop.
   */
  public void setName(String name) {
    this.name = new StringBuilder(name).toString();
  }

  /**
   * Sets the current delivery request of the shop and notifies all registered observers.
   *
   * @param deliveryRequest the new delivery request.
   */
  public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
    this.deliveryRequest = deliveryRequest;
    notifySubscribers();
  }

  /**
   * Returns the current delivery request of the shop.
   *
   * @return the current delivery request of the shop.
   */
  public DeliveryRequest getDeliveryRequest() {
    return deliveryRequest;
  }

  /**
   * Returns the name of the shop.
   *
   * @return the name of the shop.
   */
  public String getName() {
    return this.name;
  }
}
