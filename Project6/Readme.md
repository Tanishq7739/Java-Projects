### **Updated README: Beverage Vending Machine Project**

---

### **Project Title**
Beverage Vending Machine with Inheritance, Method Overriding, Runtime Polymorphism, and Upcasting in Java

---

### **Project Description**
This project simulates a **Beverage Vending Machine** that allows a user to:

1. Insert money.
2. Choose a beverage from the options provided.
3. Specify the number of cups they want.
4. Receive the beverage and any remaining change if the inserted money exceeds the total cost.

The project demonstrates core object-oriented programming concepts such as **inheritance**, **method overriding**, **runtime polymorphism**, and **upcasting** in Java.

---

### **Problem Statement**
Design and implement a Java-based **Beverage Vending Machine** using the following specifications:

1. Create a parent class called `Beverage` to represent a generic beverage. It should include:
   - Name of the beverage.
   - Cost of one cup.
   - A method `drink()` to process and display the user's selection.

2. Create child classes `Coffee`, `Juice`, `Wine`, and `Tea`, which extend the `Beverage` class and override the `drink()` method.

3. Implement a class `VendingMachine` with a method `enterMoney(int amount)` to:
   - Accept user input for money.
   - Display the menu options and allow the user to select a beverage.
   - Handle insufficient funds and calculate change if necessary.
   - Demonstrate **upcasting** by returning the selected beverage as a `Beverage` object.

4. Create a `User` class (with a `main` method) to:
   - Simulate user interaction by taking input for money and delegating tasks to the `VendingMachine`.
   - Show runtime polymorphism by calling the `drink()` method dynamically based on the user's choice.

---

### **Features**
- **Menu Options:**
  1. Coffee - 125 Rs per cup
  2. Tea - 99 Rs per cup
  3. Juice - 199 Rs per cup
  4. Wine - 269 Rs per cup

- **Functionality:**
  - Validate user money and handle insufficient funds.
  - Display the beverage details and serve it.
  - Return extra money (change) if applicable.

- **Object-Oriented Concepts:**
  - **Inheritance**: Beverage is the parent class, and Coffee, Juice, Wine, and Tea are the child classes.
  - **Method Overriding**: Each child class overrides the `drink()` method to customize behavior.
  - **Runtime Polymorphism**: The `drink()` method is called dynamically at runtime based on the selected beverage.
  - **Upcasting**: The child class objects are treated as `Beverage` type references in the vending machine.

---

### **How to Run**
1. **Requirements**:
   - JDK 8 or higher.
   - A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor (e.g., VS Code).

2. **Steps**:
   - Compile all the `.java` files in your project directory.
   - Run the `User` class to start the program.
   - Follow the prompts to insert money, select a beverage, and enter the number of cups.

---

### **Project Structure**
```
src/
├── Beverage.java         # Parent class
├── Coffee.java           # Child class (inherits Beverage)
├── Juice.java            # Child class (inherits Beverage)
├── Wine.java             # Child class (inherits Beverage)
├── Tea.java              # Child class (inherits Beverage)
├── VendingMachine.java   # Handles user interactions and beverage logic
└── User.java             # Main class for program execution
```

---

### **Sample Interaction**

#### **Example 1: Sufficient Money**
```
Enter the money you have: 800
Welcome to the Beverage Vending Machine!
1. Coffee (125 Rs per cup)
2. Tea (99 Rs per cup)
3. Juice (199 Rs per cup)
4. Wine (269 Rs per cup)
Please select your beverage: 3
Enter the number of cups: 3
Enjoy your refreshing Juice!
Enjoy your 3 cups of Juice!
Please collect your change: 203 Rs.
Thank you for using the Beverage Vending Machine!
```

#### **Example 2: Insufficient Money**
```
Enter the money you have: 300
Welcome to the Beverage Vending Machine!
1. Coffee (125 Rs per cup)
2. Tea (99 Rs per cup)
3. Juice (199 Rs per cup)
4. Wine (269 Rs per cup)
Please select your beverage: 4
Enter the number of cups: 2
Insufficient money! Please insert at least 238 more.
Thank you for using the Beverage Vending Machine!
```

---

### **Learning Objectives**
- Understand and apply the concepts of **inheritance** to create a hierarchy of related classes.
- Explore **method overriding** to implement unique behaviors in child classes.
- Use **runtime polymorphism** to call methods dynamically based on object types.
- Practice **upcasting** to simplify the interaction with child objects.

---

---


## **Acknowledgements**
This project was developed as part of a learning exercise to understand Java object-oriented programming concepts. It provides a real-world example of how inheritance, polymorphism, and upcasting can be used in practical applications.

---

Feel free to explore the projects, and happy coding! 😊

