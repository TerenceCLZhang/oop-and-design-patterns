# Fragile Base Class Problem -> Use Composition Over Inheritance

The Fragile Base Class Problem is a software design issue that arises in OOP when changes made to a base class can inadvertently break the functionality of dervived classes. This problem occurs due to the tight coupling between base and derived classes in inheritance hierarchies.

Some problems include:

1. Inheritance Coupling: Inheritance creates a tight coupling between the base class and derived classes. Any changes made to the base class can potentially affect the behaviour of all derived classes.

2. Limited Extensibility: The Fragile Base Class Problem limits the extensibility of software systems, as modifications to the base class can become increasingly risky and costly over time. Developers may avoid making necessary changes due to the fear of breaking existing functionality.

To mitigate the Fragile Base Class Problem, developers can use design principles such as the Open/Close Principle (OCP) and Dependency Inversion Pricniple (DIP), as well as design patterns like Composition over Inheritance. These approaches promote loose coupling, encapsulation, and modular design, reducing the impact of changes in base classes.