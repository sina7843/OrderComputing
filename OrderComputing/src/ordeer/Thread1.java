package ordeer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Thread1 extends java.lang.Thread{
    JPanel app;
    JFrame myapp;
    private final Runcode runner=new Runcode();
    public Thread1(JPanel app,JFrame myapp) {
        this.app = app;
        this.myapp = myapp;
    }
    @Override
    public void run(){
        runner.java(Load.text1, (Load) app);
    }
   }