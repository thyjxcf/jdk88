package net.zdsoft.jvm.classloader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/8/6 14:23
 */
public class MyTest27 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //使用调用者的类加载器
        System.out.println(System.getProperty(""));
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb", "lu", "`12345");
    }
}
