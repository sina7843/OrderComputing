package ordeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ordeer.CalcluteTime.points;

public class Runcode { 
    public void java(String S,Load m) {
        int[] number=new int[25];
        for (int i =0; i <25; i++) {
            number[i]=i*10;
        }
        points="";
        for(int i=0;i<25;i++)
        {
            String code=S.replace("Number", Integer.toString((number[i])));
            try {
                PrintWriter writer = new PrintWriter("main.java");
                writer.println(code);
                writer.close();
                Runtime.getRuntime().exec("javac main.java");
                TimeUnit.SECONDS.sleep(1);
                Process exec=Runtime.getRuntime().exec("java main");
                BufferedReader stdInput=new BufferedReader(new InputStreamReader(exec.getInputStream()));
                TimeUnit.SECONDS.sleep(1);
                m.Loading(4*i);
                long lengh=stdInput.lines().count();
                if(i==24){m.point1=lengh;}
                points+="("+number[i]+","+lengh+")";
            } catch (IOException | InterruptedException  ex) {
                Logger.getLogger(Runcode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        String result=CalcluteTime.request().toString();
        String function=result.split(",")[0].split(":")[1];
        m.answer=function.substring(4, function.length()-3);
        m.Loading(100);
    }
}
