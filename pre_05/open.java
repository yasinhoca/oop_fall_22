import javax.swing.*;

public class open {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                deneme d = new deneme();
                d.setVisible(true);
            }
        });

    }
}
