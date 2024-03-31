import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection conn;
    DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Shopsite","root","29143@Suman");
            System.out.println("Connection Established");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}


