# Snake and Ladder Game

A console-based **Snake and Ladder game** developed using Core Java and Object-Oriented Programming concepts.

## Features

- 🎲 Random dice rolling from 1 to 6
- 👥 Supports multiple players
- 🪜 Ladder-based upward movement
- 🐍 Snake-based downward movement
- 🔄 Extra turn when rolling 6
- 🚫 Maximum of 3 consecutive sixes
- ⛔ Prevents movement beyond position 100
- 🏆 Automatic winner detection

## Technologies Used

- Java
- OOP
- ArrayList
- HashMap
- Random
- Scanner

## Project Structure

```text
SnakeAndLadder/
└── src/
    └── com/
        └── snakeandladder/
            ├── Player.java
            ├── SnakeAndLadder.java
            └── TestGame.java
```

## How to Run

1. Clone the repository.
2. Open the project in Eclipse or IntelliJ IDEA.
3. Run `TestGame.java`.
4. Press **ENTER** to roll the dice.
5. The first player to reach position **100** wins.

## Game Rules

- Players start from position `0`.
- A player must reach exactly `100` to win.
- If the dice roll takes the player beyond `100`, the turn is skipped.
- Landing on a ladder moves the player upward.
- Landing on a snake moves the player downward.
- Rolling 6 gives another turn.
- After **3 consecutive sixes**, the turn moves to the next player.

## Author

**Yasaswa**
