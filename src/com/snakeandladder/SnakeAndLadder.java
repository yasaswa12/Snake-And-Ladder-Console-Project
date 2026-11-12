package com.snakeandladder;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {

    static void startGame(List<Player> players) {

        System.out.println("\n---------------------------------------------");
        System.out.println("          SNAKE AND LADDER GAME");
        System.out.println("---------------------------------------------");
        System.out.println("Game Started!");

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // ================= LADDERS =================

        HashMap<Integer, Integer> ladder = new HashMap<>();

        ladder.put(5, 30);
        ladder.put(15, 40);
        ladder.put(23, 98);
        ladder.put(36, 70);
        ladder.put(50, 80);

        // ================= SNAKES =================

        HashMap<Integer, Integer> snakes = new HashMap<>();

        snakes.put(99, 9);
        snakes.put(90, 35);
        snakes.put(78, 55);
        snakes.put(66, 17);
        snakes.put(72, 26);

        // ================= GAME SETUP =================

        int curIdx = 0;
        int sixCount = 0;

        // ================= GAME LOOP =================

        while (true) {

            Player player = players.get(curIdx);

            System.out.println("\n==============================");
            System.out.println("Player Turn: " + player.getName());
            System.out.println("Current Position: " + player.getPosition());
            System.out.println("Press ENTER to roll the dice");

            sc.nextLine();

            // Roll dice: 1 to 6
            int dice = random.nextInt(6) + 1;

            System.out.println("\nDice Value: " + dice);

            // Check consecutive sixes
            if (dice == 6) {
                sixCount++;
            } else {
                sixCount = 0;
            }

            int newPosition = player.getPosition() + dice;

            // Position exceeds 100
            if (newPosition > 100) {

                System.out.println(
                    "Your turn is skipped because the position exceeds 100!"
                );

            } else {

                // ================= LADDER =================

                if (ladder.containsKey(newPosition)) {

                    System.out.println(
                        "\nCongratulations! You found a ladder!"
                    );

                    System.out.println(
                        "Jumping from " + newPosition
                        + " to " + ladder.get(newPosition)
                    );

                    player.setPosition(ladder.get(newPosition));

                }

                // ================= SNAKE =================

                else if (snakes.containsKey(newPosition)) {

                    System.out.println("\nOops! A snake bit you!");

                    System.out.println(
                        "Moving from " + newPosition
                        + " to " + snakes.get(newPosition)
                    );

                    player.setPosition(snakes.get(newPosition));

                }

                // ================= NORMAL MOVE =================

                else {

                    player.setPosition(newPosition);
                }

                System.out.println(
                    "Current Position: "
                    + player.getPosition()
                );

                // ================= WINNER =================

                if (player.getPosition() == 100) {

                    System.out.println(
                        "\n====================================="
                    );

                    System.out.println(
                        "WOW! Congratulations, "
                        + player.getName()
                        + "! YOU WON THE GAME!"
                    );

                    System.out.println(
                        "====================================="
                    );

                    break;
                }
            }

            // ================= EXTRA TURN =================

            if (dice == 6 && sixCount < 3) {

                System.out.println(
                    "\nYou rolled 6! You can play again."
                );

                continue;
            }

            // Reset six count when turn changes
            sixCount = 0;

            // ================= NEXT PLAYER =================

            curIdx = (curIdx + 1) % players.size();
        }
    }
}