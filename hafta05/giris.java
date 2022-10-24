package hafta05;

import javax.swing.*;

public class giris {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //ekrana basılması için thread
            @Override
            public void run() {
                form1 f1 = new form1();
                f1.setVisible(true);
                form2 f2 = new form2();
                f2.setVisible(true);
            }
        });
    }
}
