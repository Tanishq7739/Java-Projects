### **Question for the Code**

Write a Java program to calculate the **electricity bill** based on the user's unit consumption. The program should:

1. Prompt the user to enter:
   - The **old unit reading**.
   - The **current unit reading**.
2. Validate that the **current unit reading** is greater than the **old unit reading**:
   - If invalid, display an error message and terminate the program.
3. Calculate the **total unit consumption** as:
   - `totalUnitConsumed = currentUnit - oldUnit`.
4. Calculate the electricity cost based on the following tariff:
   - **First 50 units**: ₹1.25 per unit.
   - **Next 20 units** (51 to 70): ₹1.75 per unit.
   - **Next 30 units** (71 to 100): ₹2.25 per unit.
   - **Beyond 100 units**: ₹3.00 per unit.
5. Add a **20% surcharge** to the calculated cost.
6. Display the total consumption and the final bill amount.

---

### **Example Input and Output**

#### **Example 1**:
**Input**:
```
Enter the Old Unit Reading: 
300
Enter the Current Unit Reading: 
450
```

**Output**:
```
Total Consumption is: 150 Unit
Total Cost is: 405.0 Rupees
======Thank You===========
```

---

#### **Example 2**:
**Input**:
```
Enter the Old Unit Reading: 
600
Enter the Current Unit Reading: 
550
```

**Output**:
```
Invalid Unit Entered
```

---

### **Explanation**

1. The program calculates the total unit consumption by subtracting the old reading from the current reading.
2. The cost is determined based on a tiered rate structure:
   - For the first 50 units, the cost is ₹1.25/unit.
   - For the next 20 units (up to 70), the cost is ₹1.75/unit.
   - For the next 30 units (up to 100), the cost is ₹2.25/unit.
   - Any additional units beyond 100 are charged at ₹3.00/unit.
3. After calculating the cost based on the tiered structure, a 20% surcharge is added.
4. If the current unit reading is less than or equal to the old unit reading, the program exits with an error message.

This program simulates a basic electricity bill calculator.