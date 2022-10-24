package hafta05;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class form2 extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JPanel panel1;
    int r,g,b;
    Random rast = new Random();
    static Thread t;

    public form2(){
        add(panel1);
        setSize(400,200);
        setTitle("Thread Örneği");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    r = rast.nextInt(255);
                    g = rast.nextInt(255);
                    b = rast.nextInt(255);
                    button1.setBackground(new Color(r,g,b));

                    try {
                        t.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });

       t.start();


    }
}
