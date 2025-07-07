## **Shape Game Project**

This repository contains the implementation of a **Shape Game** designed to calculate the **area, perimeter, volume, TSA (Total Surface Area)**, and **LSA (Lateral Surface Area)** of various 2D and 3D shapes. The project uses **object-oriented programming (OOP) concepts** such as **inheritance**, **method overriding**, **runtime polymorphism**, **constructors**, and **recursion** to provide a dynamic, interactive experience.

---

### **Project Questions**

1. **Main Objective**:  
   Design a shape game where:  
   - **Press 1 for 2D shapes**: Calculate the **area** and **perimeter** of 2D shapes like Circle, Triangle, and Rectangle.  
   - **Press 2 for 3D shapes**: Calculate the **volume**, **TSA**, and **LSA** of 3D shapes like Sphere, Hemisphere, Cone, and Cylinder.  
   - Handle invalid inputs gracefully using recursion, and provide the user with an option to continue or exit the game.

2. **Detailed Requirements**:
   - Use a **parent class (`TwoDshape` or `ThreeDshape`)** to define default methods.
   - Implement **child classes** (e.g., `Circle`, `Rectangle`, `Triangle`, `Sphere`, `Cone`, `Cylinder`, `Hemisphere`) to override these methods with shape-specific calculations.
   - Display a welcome message and dynamically route the user to 2D or 3D shape options based on their input.
   - Allow users to retry on invalid input and decide whether to continue or exit after each calculation.
   - Include the following calculations for each shape:
     - **Circle**: Area, Perimeter.
     - **Rectangle**: Area, Perimeter.
     - **Triangle**: Area, Perimeter.
     - **Sphere**: Volume, TSA, LSA.
     - **Hemisphere**: Volume, TSA, LSA.
     - **Cone**: Volume, TSA, LSA.
     - **Cylinder**: Volume, TSA, LSA.

---

### **OOP Concepts Used**

1. **Inheritance**:
   - Parent classes `TwoDshape` and `ThreeDshape` provide default implementations.
   - Child classes like `Circle`, `Rectangle`, `Sphere`, and `Cone` inherit and extend these classes.

2. **Method Overriding**:
   - Each child class overrides the parent class methods (`getArea()`, `getVolume()`, etc.) to provide shape-specific behavior.

3. **Runtime Polymorphism**:
   - The overridden methods are invoked dynamically at runtime based on the actual object type.

4. **Default Constructor**:
   - Each class includes a default constructor to initialize shape-specific inputs.

5. **Recursion**:
   - Recursion is used to handle invalid user inputs, redirecting the user back to the menu options.

6. **Encapsulation**:
   - All shape-specific logic (e.g., formulas for area, volume) is encapsulated within the respective classes.

7. **Dynamic Input Handling**:
   - User inputs (e.g., radius, height) are dynamically captured and used in calculations.

---

### **How to Run**

1. **Compile the Files**:
   - Ensure all `.java` files are in the same directory.
   - Compile all files using:
     ```bash
     javac *.java
     ```

2. **Run the Main Class**:
   - Execute the `ShapeGame` class to start the program:
     ```bash
     java ShapeGame
     ```

3. **User Interaction**:
   - Follow the prompts to select a 2D or 3D shape and provide necessary inputs like radius, height, or length.
   - Decide whether to continue or exit after each calculation.

---

### **Features**

1. **Welcome Message and Menu Options**:
   - Displays a dynamic menu where users can choose between 2D and 3D shapes.
   - Handles invalid input gracefully with recursion.

2. **2D Shape Calculations**:
   - **Circle**: Area = pi*r^2, Perimeter= 2*pi*r.
   - **Rectangle**: Area = l*b, Perimeter = 2(l + b).
   - **Triangle**: Area = 1/2*l*h, Perimeter = Base + Side1 + Side2.

3. **3D Shape Calculations**:
   - **Sphere**:  
     Volume = 4/3*pi*r^3,  
     TSA = 4*pi*r^2,  
     LSA = 4*pi*r^2.  
   - **Hemisphere**:  
     Volume = 2/3*pi*r^3,  
     TSA = 3*pi*r^2,  
     LSA = 2*pi*r^2.  
   - **Cone**:  
     Volume = 1/3*pi*r^2*h,  
     TSA = pi*r*(r + l),  
     LSA = pi*r*l, where l = sqrt{r^2 + h^2}.  
   - **Cylinder**:  
     Volume = pi*r^2*h,  
     TSA = 2*pi*r*(r + h),  
     LSA = 2*pi*r*h.

4. **User-Friendly Flow**:
   - After each calculation, the user can decide whether to continue or exit.
   - Invalid inputs are handled gracefully with appropriate messages.

---

### **Project Structure**

```
src/
├── Mobile.java           # Main class to start the game
├── ShapeGame.java        # Implement all conditions
├── TwoDshape.java        # Parent class for 2D shapes
├── ThreeDshape.java      # Parent class for 3D shapes
├── Circle.java           # Implements Circle-specific calculations
├── Rectangle.java        # Implements Rectangle-specific calculations
├── Triangle.java         # Implements Triangle-specific calculations
├── Sphere.java           # Implements Sphere-specific calculations
├── HemiSphere.java       # Implements Hemisphere-specific calculations
├── Cone.java             # Implements Cone-specific calculations
└── Cylinder.java         # Implements Cylinder-specific calculations
```

---

### **Sample Interaction**

#### **Example 1: 2D Shape - Circle**
```
Welcome to Shape Game!
Press 1 for 2D Shape
Press 2 for 3D Shape
Enter your choice: 1
Choose a 2D Shape:
1. Circle
2. Triangle
3. Rectangle
Enter your choice: 1
Enter the radius of the circle: 5
Circle Area: 78.53981633974483
Circle Perimeter: 31.41592653589793
Do you want to continue? (Press Y/y for Yes, N/n for No): Y
```

#### **Example 2: 3D Shape - Cone**
```
Welcome to Shape Game!
Press 1 for 2D Shape
Press 2 for 3D Shape
Enter your choice: 2
Choose a 3D Shape:
1. Sphere
2. Cylinder
3. Cone
4. Hemisphere
Enter your choice: 3
Enter the radius of the cone: 3
Enter the height of the cone: 4
Cone Volume: 37.69911184307752
Cone Total Surface Area: 75.39822368615503
Cone Curved Surface Area (LSA): 37.69911184307752
Do you want to continue? (Press Y/y for Yes, N/n for No): N
Thank you for playing Shape Game!
```

---

## About Me

Hi, I’m Ankush Raj  or Ankush Raj Mahe Yam (ARMY), an aspiring software developer currently pursuing Java Full Stack Development. I’m also involved in various business ventures, including a tech-based YouTube channel, a logistics business, and real estate projects.

Connect with me on:
- **Search on Google:** [Ankush Raj Mahe Yam](https://www.google.com/search?q=ankush+raj+mahe+yam)
- **LinkedIn:** [Ankush Raj Mahe Yam](https://linkedin.com/in/AnkushRajMaheYam)
- **GitHub:** [Ankush Raj Mahe Yam](https://github.com/AnkushRajMaheYam)
- **Instagram:** [@AnkushRajaMaheYam](https://instagram.com/AnkushRajaMaheYam)
- **Facebook:** [Ankush Raj Mahe Yam](https://facebook.com/AnkushRajMaheYam)

---


## **Acknowledgements**
This project demonstrates core **object-oriented programming (OOP)** principles and the use of **mathematical formulas** in Java programming. It provides a hands-on experience for implementing inheritance, polymorphism, recursion, and constructors in a real-world application.
Special thanks to the mentor([Shambhu Sir](https://www.instagram.com/kumarsam07)) and faculty at **J-Spider Software Training Institute (Noida Branch)** for providing excellent guidance and support throughout the course.

---

Feel free to explore the projects, and happy coding! 😊