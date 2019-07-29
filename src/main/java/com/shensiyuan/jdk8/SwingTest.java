package com.shensiyuan.jdk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/7/16 20:23
 */
public class SwingTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("my Frame");
        JButton button = new JButton("my button");

        button.addActionListener(event -> {
            System.out.println("press button");
            System.out.println("hello world");
            System.out.println("how are you ");
        });
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
