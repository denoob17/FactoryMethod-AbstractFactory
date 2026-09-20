# Factory Method & Abstract Factory

## Software Design Patterns — ShP-2216

This project demonstrates two creational design patterns in Java:

* **Factory Method**
* **Abstract Factory**

The project was developed as an individual assignment for the Software Design Patterns course at Astana IT University.

---

## Technologies

* Java 17
* IntelliJ IDEA
* Git / GitHub

---

## Project Structure

The project contains two independent implementations.

```text
src/
├── factorymethod/
│   ├── Product
│   ├── Concrete Products
│   ├── Creator
│   └── Concrete Creators
│
└── abstractfactory/
    ├── Abstract Products
    ├── Concrete Products
    ├── Abstract Factory
    ├── Concrete Factories
    └── Client
```

---

# Part A — Factory Method

The **Factory Method** pattern is used to create objects without specifying their exact concrete classes in the client code.

In this project, the pattern is applied to the transport domain.

Different concrete transport products can be created through their corresponding factory classes.

### Main components

* **Product** — common interface for transport objects.
* **Concrete Products** — specific transport implementations.
* **Creator** — declares the factory method.
* **Concrete Creators** — create specific transport objects.

The client works with the common `Product` and `Creator` abstractions instead of directly creating concrete products.

---

# Part B — Abstract Factory

The **Abstract Factory** pattern is used to create families of related objects without specifying their concrete classes.

In this project, the pattern is applied to UI components.

The product family contains:

* `Button`
* `Checkbox`

Different concrete factories produce consistent UI component families for different platforms.

### Main components

* **Abstract Products** — `Button` and `Checkbox` interfaces.
* **Concrete Products** — platform-specific button and checkbox implementations.
* **Abstract Factory** — declares methods for creating the products.
* **Concrete Factories** — create a complete family of related UI components.
* **Client** — uses only the abstract factory and abstract product interfaces.

---

## Difference Between the Patterns

The main difference is the number and relationship of products being created.

**Factory Method** focuses on creating a particular type of product and allows subclasses to decide which concrete product should be created.

**Abstract Factory** creates a family of related products and ensures that the created products belong to the same compatible family.

For example:

```text
Factory Method
      ↓
   Transport
   ↙      ↘
Truck     Ship
```

```text
Abstract Factory
        ↓
    GUIFactory
     ↙      ↘
 Windows     Mac
    ↓          ↓
Button      Button
Checkbox    Checkbox
```

---

## Clean Code

The implementation follows several Clean Code principles:

1. **Meaningful names**
   Classes, interfaces, and methods use names that clearly describe their responsibilities.

2. **Single Responsibility**
   Each class has one main responsibility, such as creating a product or representing a product.

3. **Small methods**
   Factory methods are focused on object creation and do not contain unrelated logic.

4. **Polymorphism instead of conditional logic**
   The client works with interfaces instead of using large `if-else` or `switch` statements to determine concrete product types.

5. **Separation of responsibilities**
   Object creation is separated from the client logic.

---

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java 17 is configured.
4. Run the `Main` class.
5. The console output demonstrates both Factory Method and Abstract Factory implementations.

---

## Design Patterns Used

| Pattern          | Purpose                                                          |
| ---------------- | ---------------------------------------------------------------- |
| Factory Method   | Creates individual products while hiding their concrete creation |
| Abstract Factory | Creates families of related products                             |

---

## Author

**Gabidin**

Astana IT University
Software Design Patterns — ShP-2216
