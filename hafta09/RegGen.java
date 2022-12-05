package hafta09;

import hafta05.form1;
import hafta05.form2;

import javax.swing.*;

public class RegGen {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //ekrana basılması için thread
            @Override
            public void run() {
                formRegex fr = new formRegex();
                fr.setVisible(true);
            }
        });
    }
}
