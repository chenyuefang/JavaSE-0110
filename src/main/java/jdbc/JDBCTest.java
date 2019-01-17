package jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * JDBC = Java Database Connectivity
 * 1.
 * 2.
 * 3.
 * 4.
 */
public class JDBCTest {

    public static void main(String[] args) throws Exception {
        // 1. 加载驱动程序
        new Driver();
        // 2. 连接数据库
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "system");
        // 3. 预编译语句
        String sql = "insert into db_test.department(title, tel) value (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "SS");
        preparedStatement.setString(2, "022-12345678");
        // 4. 执行预编译语句
        preparedStatement.executeUpdate(); // Update : insert / update / delete
        // 5. 释放资源
        preparedStatement.close();
        connection.close();

        System.out.println("done.");
    }
}
