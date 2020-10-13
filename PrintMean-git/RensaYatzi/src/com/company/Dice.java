package com.company;

import java.util.Scanner;


public class Dice extends com.company.BoardGameMaterial {
    int value;
    static Dice[] dice;


    private Dice() {
        roll();
    }

    void roll() {
        value = (int)(Math.random()*6+1);
    }


    static void createDice(){
        dice = new Dice[5];
        for (int d = 0; d < 5; d++) {
            dice[d] = new Dice ();
        }
    }

}
