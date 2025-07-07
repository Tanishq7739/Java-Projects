## **Weapon Game Project**

### **Project Description**

The Weapon Game Project is an interactive Java-based application where players select weapons and use them in a simulated environment. The choice of weapon depends on the player's score, and each weapon has unique actions associated with its use.

---

### **Key Features**

1. **Score-Based Weapon Selection**:
   - Players are assigned weapons based on their game score:
     - **Score ≤ 400**: Knife
     - **401 ≤ Score ≤ 800**: Knife or Gun
     - **Score > 800**: Knife, Gun, or Bomb

2. **Dynamic Weapon Actions**:
   - Each weapon has specific actions, such as:
     - **Knife**: Swing, stab, and kill enemies.
     - **Gun**: Load, aim, and fire at enemies.
     - **Bomb**: Unpin, aim, and throw at enemies.

3. **Interactive Gameplay**:
   - The game prompts players to make choices based on their scores and interactively guides them through weapon selection and usage.

---

### **How It Works**

1. **Game Initialization**:
   - The game starts with a welcome message.
   - Players enter their score, which determines the available weapons.

2. **Weapon Selection**:
   - Based on the score, the player is presented with one or more weapon choices.
   - The player selects a weapon using the corresponding input option.

3. **Weapon Usage**:
   - Once selected, the player can "use" the weapon, triggering predefined actions unique to the weapon.

---

### **Code Overview**

1. **Classes**:
   - **Weapon (Base Class)**: Defines the base functionality of all weapons.
   - **Knife, Gun, Bomb (Derived Classes)**: Extend the `Weapon` class and implement specific actions.
   - **Game**: Handles the game logic, including score-based weapon selection.
   - **Player**: The main entry point to the game.

2. **Key Methods**:
   - `Game.selectWeapon()`: Determines the weapon based on the player's score.
   - `Weapon.use()`: Executes the specific actions for the selected weapon.

3. **Sample Interaction**:
   ```java
   ====Game has Started====
   Enter the Score: 
   900
   Press 1 to select Knife
   Press 2 to select Gun
   Press 3 to select Bomb
   You got Bomb
   Use the Bomb
   Unpin the Bomb
   Aim at Enemy
   Throw it and Runnn
   ```

---

### **Example Gameplay Scenarios**

#### **Scenario 1**:
**Input**:
```
Score: 350
```

**Output**:
```
You got Knife
Use the Knife
Swing the knife
Stab the Enemy
Kill the Enemy
```

---

#### **Scenario 2**:
**Input**:
```
Score: 750
Choice: 2
```

**Output**:
```
You got Gun
Use the Gun
Load the Gun
Aim at Enemy
Fire Now and Kill Enemy..
```

---

### **Edge Cases**
1. **Invalid Input**:
   - Ensures proper handling of incorrect or invalid weapon selection inputs.
2. **Boundary Scores**:
   - Tests the transitions between score ranges to ensure correct weapon assignment.

---

### **Future Enhancements**
- Add more weapons with unique actions.
- Introduce multiplayer support.
- Implement graphical user interface (GUI) for better interaction.
- Add scoring mechanism based on performance.

---

### **How to Run**
1. Clone the repository and navigate to the project directory.
2. Compile all `.java` files:
   ```
   javac Project4/*.java
   ```
3. Run the `Player` class to start the game:
   ```
   java Project4.Player
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
Special thanks to the mentor([Shambhu Sir](https://www.instagram.com/kumarsam07)) and faculty at **J-Spider Software Training Institute (Noida Branch)** for providing excellent guidance and support throughout the course.

---

Feel free to explore the projects, and happy coding! 😊