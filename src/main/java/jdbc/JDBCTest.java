package jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * JDBC = Java Database Connectivity
 * 1.
 * 2.
 * 3.
 * 4.
 */
public class JDBCTest {

    private static final String URL = "jdbc:mysql:///";
    private static final String USER = "root";
    private static final String PASSWORD = "system";

    public static void main(String[] args) throws Exception {
        // 1. 加载驱动程序
        new Driver();
        // 2. 连接数据库
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        // 3. 预编译语句
        /*
        String sql = "insert into db_test.department(title, tel) value (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "SS");
        preparedStatement.setString(2, "022-12345678");
        */

        /*
        String sql = "update db_test.department set tel = null where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 3);
        */

        /*
        String sql = "delete from db_test.department where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 3);
        */

        String sql = "select * from db_test.department";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 4. 执行预编译语句
//        preparedStatement.executeUpdate(); // Update : insert / update / delete
        ResultSet resultSet = preparedStatement.executeQuery(); // result set 结果集
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("title"));
            System.out.println(resultSet.getString("tel"));
        }
        // 5. 释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();

        System.out.println("done.");
    }
}
