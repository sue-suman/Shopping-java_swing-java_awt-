import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
public class UserLogin {
    public static boolean AuthenticateAdmin(String id,String password) throws SQLException {
        DBConnection con = new DBConnection();
        String query = "SELECT * FROM userlogins WHERE userid=? and password=?";
        PreparedStatement ps = con.conn.prepareStatement(query);
        ps.setString(1,id);
        ps.setString(2,password);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you userId and password");
        boolean isAuthenticated = false;
        do {
            System.out.println("UserId :");
            String userid = sc.nextLine();
            System.out.println("Password :");
            String password = sc.nextLine();
            isAuthenticated = AuthenticateAdmin(userid, password);
            if (isAuthenticated) {
                System.out.println("Successful");
            } else {
                System.out.println("Unsuccessful");
            }
        }
        while (!isAuthenticated);
        Shopseeweb sb=new Shopseeweb();
    }
}
