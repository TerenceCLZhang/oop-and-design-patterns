# Composition vs Inheritance

## When to use Composition:

- Composition should be used when you need for flexibility in constructing objects by assembling smaller, reusable components. It allows for changing behavior at runtime by swapping out components, promoting code reuse and reducing tight coupling between classes.
- When there is no clear "is-a" relationship between classes, and a "has-a" relationship is more appropriate. For example, a Car "has-a" Engine, rather than a Car "is-a" Engine.
- When you want to avoid the limitations of inheritance, such as tight couppling and the fragile base class problem

## When to use Inheritance:

- When there is a clear "is-a" relationship between the base class and derived class, and subclass objects can be trated as instances of their superclass. For example, a Dog "is-a" Animal.
- When you want to promote code reuse by inheriting properties and behaviours from existing classes.
- When you want to leverage polymorphism to allow objects of different subclasses to be trated uniformly through their common superclass interface.