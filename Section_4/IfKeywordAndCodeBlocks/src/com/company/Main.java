package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jonny", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("John", highScorePosition);
    }


    public static int calculateScore(boolean gameOver,
                                     int score,
                                     int levelCompleted,
                                     int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        // -1 is use to indicate an error
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " Managed to get into position: " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore < 1000 && playerScore > 500) {
            return 2;
        } else if (playerScore < 500 && playerScore > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
