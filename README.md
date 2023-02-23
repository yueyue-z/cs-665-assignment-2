
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | YUEYUE ZHU                 |
| Date         | 02/22/2023                 |
| Course       | Spring                     |
| Assignment # | 2                          |

# Assignment Overview
This project aims to provide a comprehensive and flexible solution for a shop to send delivery requests to available drivers of different types, including van drivers, taxi drivers, and scooter drivers. 
The project is designed to be robust and scalable, allowing easy creation of shops, delivery requests, and different types of drivers. By using the observer pattern and abstract factory patterns, this project provides the level of flexibility and scalability required for a growing business.

# GitHub Repository Link:
https://github.com/yueyue-z/cs-665-assignment-2

# Implementation Description 
This project implements the functionality for a shop to send delivery requests to different types of freelance drivers, including van drivers, taxi drivers, and scooter drivers. The observer pattern and abstract factory patterns are used.

The project's classes are organized into different packages according to their functionality:

- The `factory` package includes a `DriverFactory` class as the abstract class. There are `ScooterDriverFactory`, `TaxiDriverFactory`, and `VanDriverFactory` classes, which inherit from this class, with the `createDriver` method overriding the abstract method in the parent class. With this approach, it is easy to customize each type of driver and the creation in the future without changing other code, which provides the level of flexibility and easy maintenance.


- The `request` package defines the `DeliveryRequest` class to represent a delivery request, containing the information of the shop and the customer's address.


- The `subject` package includes the `PublisherBase` interface, which serves as the subject/publisher in the observer pattern. It provides the methods for registering, removing, and notifying subscribers/observers (we use the name subscribers in the code for consistency and easy understanding). Then the `Shop` class implements the `PublisherBase` and represents the class of a shop object. It can generate delivery requests and notify its subscribers when a new delivery request is generated.


- The `subscriber` package defines the `SubscriberBase` interface, which has the method to `updateSelf`. The `Driver` class implements the `SubscriberBase` interface, and it provides methods and attributes of the drivers. `ScooterDriver`, `TaxiDriver`, and `VanDriver` are the subclasses inheriting from the `Driver` class, which define different behaviors to `updateSelf` when a delivery request is sent. A driver will only accept the delivery requests if the driver is available.


- Lastly, the `Main` class is provided as the entry point to the project, which demonstrates a scenario.

## Flexibility

The implementation of the project provides a high level of flexibility as new object types can be easily added or removed in the future. For example, new driver types can be added by creating a new factory class for that driver type, inheriting from the DriverFactory class, and overriding the createDriver method. Also, the methods of each subclass can be updated easily without changing the parent classes, which makes the project more maintainable.

For the different driver types, they have their own updateSelf methods, which allows for further customization in the behavior and logic when receiving new delivery requests. Potential subscriber classes other than drivers, such as delivery personnel without a vehicle or administrative personnel, can also be created by implementing the SubscriberBase interface if there is a future need. This implementation allows for potential extension to the project's functionality while keeping the current structure and design patterns intact.

## Simplicity and Understandability

The implementation of the project is intentionally designed to be simple and easy to comprehend. The well-defined package structure and clearly defined class responsibilities make it easy to read and maintain the code. Furthermore, design patterns such as the observer pattern and the abstract factory pattern make the code more readable and understandable.

Javadoc comments are available for all classes and methods in the project, and the class, variable, and method names are clearly indicative of their meanings, contributing to the code's readability. Additionally, the project uses consistent naming conventions for the Publisher and Subscriber classes, which could be named differently in other contexts, such as Subject/Object, for example. This consistency enhances the code's readability and aids in audience comprehension.

## Avoiding Duplicated Code

The project uses design patterns to avoid duplicated code. 
For example, the use of the abstract factory pattern in creating different types of drivers ensures that we do not duplicate the code to create similar objects. 
Similarly, the use of the observer pattern to notify subscribers of new delivery requests also avoids the duplication of code.

## Design Patterns
The project uses the abstract factory pattern and observer pattern.

In abstract factory pattern, the `DriverFactory` is used as the abstract class which is inherited by three different types of driver factories. Each of them overrides the `createDriver` method and can create the specific type of driver object. Client can invoke the driver factories to create the driver objects needed.

In the observer pattern, there are `PublisherBase` and `SubscriberBase` interfaces. `Shop` implements the `PublisherBase` to send `DeliveryRequest` to the subscribers, which are the drivers. So `Driver` implements the `SubscriberBase` and update themselves once received the notification. I added the logic for the driver to check if they are available as well, as the notification should only be sent to the available drivers. When using this pattern, clients need to create instances of shops and drivers, and register the drivers to the subscription list of the shop first. Whenever there is a new delivery request created, the shop can then notify everyone on the subscriber list.

# Usage of the Program

Users need to have JDK 1.8 and above installed to run this program.
A sample scenario is provided in the Main class.

## Compile
To compile the project, the user may type on the command line: 

```bash
mvn clean compile
```

## JUnit Tests
The `TestDriverFactory` class tests the functionality of creating drivers of each type with the abstract factory pattern. We also have `TestShop` class to test the functions to create a shop, create 5 drivers, register them to the shop as subscribers, and the shop sends a delivery request to them.

To run, use the following command:
```bash
mvn clean test
```

## Spotbugs 

Use the following command:

```bash
mvn spotbugs:gui 
```

## Checkstyle 

```bash
mvn checkstyle:checkstyle
```






