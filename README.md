# "Builder Pattern approach for an E-Commerce Application"

## Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

## However, you encounter challenges:

* Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
* Optional fields: Not all customers provide complete information, but the constructor forces them to.
* Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields. <br>
Implement solution using the Builder Pattern to address the issues.<br><br>

## UML Diagram:
![Builder Pattern UML](https://github.com/brixcyver/builderPattern/assets/142380216/ee755c2f-6d57-4357-9369-e280cc942787)
