package com.zzz.javacode.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author: Zzz
 * @date: 2024/1/22 10:18
 * @description:
 */
public class ReaderData {


    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtils.getConnection();
        Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
        statement.setFetchSize(100);

        String sql = "select id,value from batchSizeTable";
        ResultSet resultSet = statement.executeQuery(sql);

        int count = 1;

        while (resultSet.next()) {
            if (count >= 500 && count <= 600){
                System.out.println("id:" + resultSet.getInt("id") + " value:" + resultSet.getString("value"));
            }
            count ++;
        }

    }


}
