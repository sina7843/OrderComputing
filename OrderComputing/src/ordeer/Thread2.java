/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordeer;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ACER
 */
public class Thread2 extends java.lang.Thread{
    JPanel app;
    JFrame myapp;
    private final Runcode runner=new Runcode();
    public Thread2(JPanel app,JFrame myapp) {
        this.app = app;
        this.myapp = myapp;
    }
    @Override
    public void run(){
        runner.java(Load.text2, (Load) app);
        ComparePan.flag=1;
        runner.java(Load.text1, (Load) app);
    }
}
