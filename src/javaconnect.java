import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection con ;
    
    public static Connection connectdb () {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
            return con;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,e );
            return null;
        }
        
    }
}
