package org.example;

public class BowlingGame {

    public BowlingGame() {
    }

    public int[] getScore(int[] rolls) {
        int score = 0;
        int[] scores = new int[10];
        int rollIndex = 0;
        int scoreIndex=0;
        //input
        //1,4,4,5,6,4,5,5,10,0,1,7,3,6,4,10,2,8,6
        //output
        //5, 14, 29, 49, 60, 61, 77, 97, 117, 133

        while (rollIndex < rolls.length-2){

            if (rolls[rollIndex] == 10) {
                score += rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex++;

                System.out.println(" score" + " = " + score);
                //that means spare
            } else if (rolls[rollIndex] + rolls[rollIndex + 1] == 10) {
                score += rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex += 2;
            } else {
                score += rolls[rollIndex] + rolls[rollIndex + 1];
                rollIndex += 2;
            }
            scores[scoreIndex++] = score;
        }
        return scores;
    }


}


