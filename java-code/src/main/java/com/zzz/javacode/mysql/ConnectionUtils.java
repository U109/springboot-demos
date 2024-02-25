package com.zzz.javacode.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author: Zzz
 * @date: 2024/1/22 10:18
 * @description:
 */
public class ConnectionUtils {

    static Connection con; // 声明Connection对象
    public static String user;
    public static  String password;

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        user = "root";//数据库登录名
        password = "root";//密码
        // 通过访问数据库的URL获取数据库连接对象
        con = DriverManager.getConnection("jdbc:mysql://117.72.32.234:3306/mtk?useUnicode=true", user, password);
        return con; // 按方法要求返回一个Connection对象
    }
}
