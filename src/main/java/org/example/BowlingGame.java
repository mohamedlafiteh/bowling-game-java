package org.example;

public class BowlingGame {
    private int[] rolls;
    private int currRoll=0;

    public BowlingGame() {
        this.rolls = new int[21];
    }

    public void roll(int pins) {
        rolls[currRoll++] =pins;
    }
    public int getScore() {
        int score = 0;
        int rollInex=0;
        //frame loop
        for (int i = 0; i < 10; i++) {
            //that means strike
            if(rolls[rollInex] ==10) {
                score+=rolls[rollInex]+rolls[rollInex+1] + rolls[rollInex+2];
                rollInex++;
                System.out.println(" score" + " = " +  score);
                //that means spare
            }else if(rolls[rollInex]+rolls[rollInex+1]==10){
                score+=rolls[rollInex]+rolls[rollInex+1] + rolls[rollInex+2];
                rollInex+=2;
            }else {
                score+=rolls[rollInex]+rolls[rollInex+1] ;
                rollInex+=2;
            }

        }
         return score;
    }


}


