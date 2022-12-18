import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class form1 extends JFrame {
    private JPanel panel;
    private JTable table1;

    DefaultTableModel modelim = new DefaultTableModel();
    Object[] kolonlar = {"No","Ad","Soyad"};
    Object[] satirlar = new Object[4];

    form1(){
        add(panel);
        setTitle("Veritabanı");
        setSize(600,600);

        veritabani.baglan();
        ResultSet rs = veritabani.listele("select * from veriler");

        modelim.setColumnCount(0);
        modelim.setRowCount(0);
        modelim.setColumnIdentifiers(kolonlar);

        try {
            while(rs.next()) {
                satirlar[0]=rs.getString("idno");
                satirlar[1]=rs.getString("ad");
                satirlar[2]=rs.getString("soyad");

                modelim.addRow(satirlar);
            }
            table1.setModel(modelim);


        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }


    }
}
