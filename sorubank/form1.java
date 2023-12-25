package sorubank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {
    private JPanel panel;
    private JTextArea textArea1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JButton button3;
    private JLabel lbl1;
    private JLabel lbl2;
    int sayac = 0;
    int dogru = 0;
    int yanlis =0;
    form1(){
        add(panel);
        setTitle("Sınav");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);
        bg.add(radioButton3);
        bg.add(radioButton4);
        SoruOlustur so = new SoruOlustur();
        soruYukle(so,sayac);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cevap="";
                if(radioButton1.isSelected()) cevap=radioButton1.getText();
                else if(radioButton2.isSelected()) cevap=radioButton2.getText();
                else if(radioButton3.isSelected()) cevap=radioButton3.getText();
                else if(radioButton4.isSelected()) cevap=radioButton4.getText();
                if(kontrolEt(so,cevap,sayac)) dogru++; else yanlis++;
                lbl1.setText(Integer.toString(dogru) + " doğru");
                lbl2.setText(Integer.toString(yanlis) + " yanlis");

                if(sayac<4){
                    sayac++;
                    soruYukle(so,sayac);
                } else button3.setEnabled(false);
            }
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form1 f= new form1();
                f.setVisible(true);
            }
        });
    }

    void soruYukle(SoruOlustur so, int sayac){
        textArea1.setText(so.sorular.get(sayac).metin);
        radioButton1.setText(so.sorular.get(sayac).a);
        radioButton2.setText(so.sorular.get(sayac).b);
        radioButton3.setText(so.sorular.get(sayac).c);
        radioButton4.setText(so.sorular.get(sayac).d);
    }

    Boolean kontrolEt(SoruOlustur so, String cevap,int sayac){
        if(cevap.equals(so.sorular.get(sayac).cevap)) return true; else return false;
    }

}
