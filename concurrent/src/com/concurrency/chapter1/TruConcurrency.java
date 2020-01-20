package com.concurrency.chapter1;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/29 14:22
 */
public class TruConcurrency {
    public static void main(String[] args) {

    }
    private static void readFromDataBase() {

        try {
            System.out.println("begin read data from db.");
            Thread.sleep(100*10L);
            System.out.println("read data done and start handle it");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The data handle finish and successfully");
    }

    private static void prrintln(String msg) {
        System.out.println(msg);
    }
}
