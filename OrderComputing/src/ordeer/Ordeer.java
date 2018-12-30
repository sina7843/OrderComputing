package ordeer;

import java.awt.Point;
import javax.swing.JFrame;

public class Ordeer {
    public static Point[] coord=new Point[10];
    public static int cou=0 ;
public static void main(String[] args) {
        JFrame myapp=new JFrame();
        myapp.setExtendedState(JFrame.MAXIMIZED_BOTH);
        myapp.setUndecorated(true);
        StartPage app=new StartPage();
        myapp.add(app);
        myapp.setVisible(true);
        myapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
