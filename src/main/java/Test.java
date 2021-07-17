import java.sql.*;
public class Test {
    public static void main(String[] args) throws SQLException ,ClassCastException{
        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/testdb")){
            Statement createStatement = connection.createStatement();
            ResultSet executeQuery = createStatement.executeQuery("select ecode , ename from employee");
            while (executeQuery.next()){
                String ecode = executeQuery.getString("ecode");
                String ename = executeQuery.getString("ename");
                System.out.println(ecode+" - "+ename);
            }
        }
    }
}
