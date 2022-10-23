import javax.swing.*;
import java.awt.*;

public class form2 extends JFrame {
    private JTextField textField1;
    private JButton button1;
    private JPanel panel1;

    public form2(){
        add(panel1);
        setSize(400,400);
        setTitle("Thread Örnek");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    button1.setBackground(Color.GREEN);
                }
            }
        });

        t.start();


    }

}
