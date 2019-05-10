/*******************************************************************************
Name: Sarah Redmon
Date: 4/1/19
Instructor: Ms. Tucker
Class: Volunteers
Purpose: To show ArrayList of Volunteers & let user do simple actions
*******************************************************************************
*/

import java.io.*;
import javax.swing.*;

public class Volunteers {
    public static void main(String[] args) throws IOException {
/*------------------------------------------------------------------------------
        Creates and displays the GUI of the program
        ------------------------------------------------------------------------------
        */
        JFrame frame = new JFrame ("Volunteers");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new VolunteersGUI());

        frame.pack();
        frame.setVisible(true);
    }
}