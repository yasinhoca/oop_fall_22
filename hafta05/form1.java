package hafta05;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class form1 extends JFrame {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    static int x,y,hizx,hizy,x2,y2,hizx2,hizy2;
    Timer t;
    TimerTask g;

    public form1(){ //constructer method
            add(panel1);
            setSize(400,400);
            setTitle("Timer Örnek");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            button1.setBackground(Color.BLUE);
            button2.setBackground(Color.GREEN);
            x = 200;
            y= 200;
            x2= 100;
            y2= 100;
            hizx = 2;
            hizy = 7;
            hizx2 = 5;
            hizy2 = 1;
            t = new Timer();
            g = new TimerTask() {
                @Override
                public void run() {
                    x += hizx;
                    y += hizy;
                    x2 += hizx2;
                    y2 += hizy2;
                    if(x>=360 || x<=0) hizx*=-1;
                    if(y>=350 || y<=0) hizy*=-1;
                    if(x2>=360 || x2<=0) hizx2*=-1;
                    if(y2>=350 || y2<=0) hizy2*=-1;
                    button1.setBounds(x,y,25,25);
                    button2.setBounds(x2,y2,25,25);
                }
            };

            t.schedule(g,0,10);





    }

}
