import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class deneme extends JFrame {

    private JButton button1;
    private JPanel panel1;
    Timer t;
    TimerTask g;
    static int x,y,hizx,hizy;

    public deneme(){
        add(panel1);
        setSize(400,400);
        setTitle("İlk form");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        button1.setSize(25,25);
        button1.setText("");
        button1.setBackground(Color.GREEN);
        x = y = 200;
        hizx=2;
        hizy=3;

        t = new Timer();
        g = new TimerTask() {
            @Override
            public void run() {
                x+=hizx;
                y+=hizy;
                if(x>=375 || x<=0) hizx*=-1;
                if(y>=350 || y<=0) hizy*=-1;
                button1.setBounds(x,y,25,25);
            }
        };

        t.schedule(g,0,10);
    }
}
