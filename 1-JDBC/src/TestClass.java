import java.sql.*;

public class TestClass {

    public static void main(String[] args) throws Exception{
        String queryToFetch = "SELECT * FROM personnes" ;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery(queryToFetch);
        while (rs.next()) {
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            int age = rs.getInt("age");
            System.out.println( prenom + " " + nom + " a " + age + " ans" );
        }
        rs.close();
        st.close();
        cx.close();
    }
}
