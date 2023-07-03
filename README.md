# Yatzy Refactoring Kata

## Project Structure

The code is organized in the following structure:

- The `category` package contains classes for different categories in the Yatzy game. Each category implements the `YatzyCategory` interface, which defines the `calculateScore(int[] dice)` method to calculate the score.
- The `YatzyFactory` class acts as a factory to create instances of specific categories based on their names.
- The `YatzyGame` class represents the Yatzy game. It initializes the dice and provides methods to calculate the score using a specific category.
- The `YatzyTest` class contains unit tests for the Yatzy game, covering various categories and scenarios.

This structure separates responsibilities and follows the SOLID principles. Each class has a specific responsibility and can be modified or extended independently of others.

## Usage

To use the Yatzy game, you can create an instance of the `YatzyGame` class and call the appropriate methods to calculate scores for different categories. Here's an example:

```java
YatzyGame game = new YatzyGame();
int[] dice = {1, 2, 3, 4, 5};
int score = game.calculateScore("Ones", dice);
System.out.println("Score for Ones category: " + score);
