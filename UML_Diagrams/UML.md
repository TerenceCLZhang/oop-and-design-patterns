# Unified Modelling Language

UML is used to model our systems, visually showing the relationships between our classes.

https://app.diagrams.net/

## Representing a class

A `Dog` class with a private `name` property and public `bark()` method.

![Dog Class](./dog.png)

Access modifiers:

- "+" means public
- "-" means private
- "#" means protected
- "~" means package local

## Inheritance

`Dog`, `Cat` and `Fish` classes inherits from the `Animal` class. Represented with a solid line and a closed, unfilled arrowhead pointing to the parent class.

![Inheritance](./inheritance.png)

## Composition

A `Car` class that has `Engine`, `Wheel`, and `Door` classes as properties. Represented with a solid line and a filled diamond at the owning class end.

![Composition](./composition.png)

## Association Relationship

A `Student` class that is associated with an `Teacher` class. Represented with a solid line with arrowhead pointing to the associated class.

A `Student` "has an" `Teacher`, but a `Student` can exist without an `Teacher`, unlike composition, where the owned class cannot exist without the owning class.

![Association](./association.png)

## Dependency Relationship

A `Car` class that depends on a `GPS` class. Represented with a dashed line and an open arrowhead pointing to the depended-on class.

`GPS` is not a field in `Car` but is used elsewere -- in this case it's a parameter, but it could also be a variable in `Car` or a temporary object within a method.

![Dependency](./dependency.png)
