package com.company;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

/**
 * Author: Ihisan Bashe
 * Game:Test
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] cars = {"Corvette", "Mustang", " Ford"};


        JFrame frame = new JFrame ();
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setVisible (false);
        frame.setSize (420,420);

        ImageIcon icon = new ImageIcon ("mustang.jpg");
        String favcar = (String) JOptionPane.showInputDialog (
          frame,
          "Pick you care to race with: ",
                " *VROOM VROOM* racing game",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                cars,
                cars[0]
        );
        JOptionPane.showMessageDialog (
                frame,
                "Player 1 has selected: \n" + favcar,
                "*VROOM VROOM* racing game",
                JOptionPane.INFORMATION_MESSAGE,
                icon
        );
        System.out.println (favcar);
    }
}
