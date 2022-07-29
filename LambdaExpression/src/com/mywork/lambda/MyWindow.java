package com.mywork.lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {

    public static void main(String[] args) {

        //    Creating window: object JFrame
        JFrame frame = new JFrame("MyWindow");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click me");

//        Adding action listener using anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
                JOptionPane.showMessageDialog(null, "Button Click ok");
            }
        });


        frame.add(button);

        JButton button2 = new JButton("Hit me");
        frame.add(button2);

//        adding action listener using lambda expression
        button2.addActionListener((ActionEvent e)->{
            System.out.println("Button Hit");
            JOptionPane.showMessageDialog(null, "Button hit done");
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }



}
