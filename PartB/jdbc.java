import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/emp";
        String uname = "root";
        String password = "";
        String query = "select * from employee";

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Connection con = DriverManager.getConnection(url, uname, password);
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);

            while(result.next()){
                String EmpData = "";
                for(int i=1;i<=2;i++){
                    EmpData += result.getString(i) + ":";
                }
                System.out.println(EmpData);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
