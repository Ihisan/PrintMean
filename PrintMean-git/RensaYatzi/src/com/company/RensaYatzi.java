package com.company;


import java.util.Scanner;

import static com.company.BoardGameMaterial.startGame;

public class RensaYatzi {

    public static void main(String[] args) {
        System.out.println ("Welcome to Yatzi");
        startGame();
    }

    public static void exitProgram() {
        System.exit (0);
    }
}