import java.sql.*;

public class veritabani {
    static String url = "jdbc:postgresql://localhost:5432/deneme"; //127.0.0.1
    //uzaktaki bir servere bağlanırken o makinenin ip adresini yazabilirsiniz 74.68.124.23
    static Connection conn=null;
    static void baglan(){
        try {
            conn = DriverManager.getConnection(url,"postgres","1234");
            System.out.print("Veritabanına bağlantı baþarılı!");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Veritabanına bağlanılamadı!");
        }
    }

    static ResultSet listele(String sorgu) {
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sorgu);
            return rs;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }

    }

}
