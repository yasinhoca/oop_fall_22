package hafta11;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class form1 extends JFrame {
    private JPanel panel;
    private JTable table1;
    private JTextField textField1;
    private JButton button1;

    DefaultTableModel modelim = new DefaultTableModel();
    Object[] kolonlar = {"No","Ad","Soyad","Telefon"};
    Object[] satirlar = new Object[4];

    form1(){
        add(panel);
        setTitle("Veritabanı");
        setSize(600,600);

        veritabani.baglan();
        String sorgu = "select * from ogrenci";
        ResultSet rs = veritabani.listele(sorgu);

        modelim.setColumnCount(0);
        modelim.setRowCount(0);
        modelim.setColumnIdentifiers(kolonlar);

        try {
            while(rs.next()) {
                satirlar[0]=rs.getInt("numara");
                satirlar[1]=rs.getString("ad");
                satirlar[2]=rs.getString("soyad");
                satirlar[3]=rs.getString("tel");

                modelim.addRow(satirlar);
            }
            table1.setModel(modelim);


        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sorgu = textField1.getText();
                ResultSet rs = veritabani.listele(sorgu);

                modelim.setColumnCount(0);
                modelim.setRowCount(0);
                modelim.setColumnIdentifiers(kolonlar);

                try {
                    while(rs.next()) {
                        satirlar[0]=rs.getInt("numara");
                        satirlar[1]=rs.getString("ad");
                        satirlar[2]=rs.getString("soyad");
                        satirlar[3]=rs.getString("tel");

                        modelim.addRow(satirlar);
                    }
                    table1.setModel(modelim);


                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        });
    }

}
