### **Shopping Cart Project**

Write a Java program to implement a **Shopping Cart System**. The program should:

1. Prompt the user to enter the number of items they wish to purchase.
2. Allow the user to input the price of each item one by one.
3. Calculate the total price of all the items.
4. Apply a discount based on the total price using the following criteria:
   - **40% discount** if the total is ≥10,000.
   - **30% discount** if the total is ≥7,000 but less than 10,000.
   - **20% discount** if the total is ≥3,000 but less than 7,000.
   - **8% discount** for totals less than 3,000.
5. Display:
   - The total price before the discount.
   - The discount percentage applied.
   - The final amount to be paid after the discount.
6. End with a "Thank you for shopping" message.

---

### **Example Input and Output**

#### **Example 1**:
**Input**:
```
Enter the Number of Items: 
3
Enter the Price of Item: 1
4000
Enter the Price of Item: 2
2000
Enter the Price of Item: 3
1000
```

**Output**:
```
Total Price is: 7000 Rupees
You got a discount of 30% on Shopping of 7000 Rupees
You have to pay 4900.0 Rupees
======Thank You for Shopping===========
```

#### **Example 2**:
**Input**:
```
Enter the Number of Items:
2
Enter the Price of Item: 1
500
Enter the Price of Item: 2
1000
```

**Output**:
```
Total Price is: 1500 Rupees
You got a discount of 8% on Shopping of 1500 Rupees
You have to pay 1380.0 Rupees
======Thank You for Shopping===========
```

---

### **Constraints**
- The number of items and their prices must be non-negative.
- Assume all inputs are integers or doubles where applicable.