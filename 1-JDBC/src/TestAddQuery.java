import java.sql.*;

public class TestAddQuery {
    public static void main(String[] args) throws Exception{
        String queryToAdd = "INSERT into personnes values('Doe','Jane',23)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = cx.createStatement();
        int nb = st.executeUpdate(queryToAdd);
        System.out.println("We added " + nb + " row/s");
    }
}
