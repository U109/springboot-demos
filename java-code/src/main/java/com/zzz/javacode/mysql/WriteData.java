package com.zzz.javacode.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author: Zzz
 * @date: 2024/1/22 10:54
 * @description:
 */
public class WriteData {

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtils.getConnection();

        String insertSQL = "insert into batchSizeTable (id , value) values (?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

        for (int i = 0; i < 1001; i++) {
            preparedStatement.setInt(1, i);
            preparedStatement.setString(2, "value" + i);
            preparedStatement.addBatch();
            if (i % 100 == 0) {
                preparedStatement.executeBatch();
            }
        }

    }
}
