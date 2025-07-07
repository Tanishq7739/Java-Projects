### **Question for the Code**

Write a Java program to calculate the total cost for a buyer purchasing a certain number of products from a company based on the following pricing scheme:

1. **Pricing structure**:
   - For quantities **up to 50 products**: ₹100 per product.
   - For quantities **51 to 75 products**: ₹80 per product.
   - For quantities **76 to 100 products**: ₹70 per product.
   - For quantities **101 to 500 products**: ₹60 per product.
   - For quantities **above 500 products**: ₹245 per product.

2. The program should:
   - Take the number of products as input.
   - Calculate the total cost based on the pricing structure.
   - Display the total number of products and the corresponding total cost.

---

### **Example Input and Output**

#### **Example 1**:
**Input**:
```
Enter the number of products: 
45
```

**Output**:
```
Number of Products: 45
Total Cost: 4500 Rupees
```

---

#### **Example 2**:
**Input**:
```
Enter the number of products: 
150
```

**Output**:
```
Number of Products: 150
Total Cost: 9000 Rupees
```

---

### **Explanation**
1. **Input**:
   - The user provides the number of products to be purchased.

2. **Logic**:
   - The pricing is determined by the number of products purchased.
   - The cost for different ranges is calculated in chunks using `if-else` conditions to ensure accurate pricing for tiered rates.

3. **Output**:
   - The program displays the total number of products and their total cost.

---

### **Edge Cases**
- **Quantity = 0**: Ensure the program handles zero input gracefully and outputs a cost of 0.
- **Large Quantities**: Test with values above 500 to ensure the highest pricing tier is correctly applied.