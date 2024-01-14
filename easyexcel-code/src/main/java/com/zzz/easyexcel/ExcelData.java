package com.zzz.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @author zhangzhongzhen wrote on 2024/1/14
 * @version 1.0
 * @description:
 */
public class ExcelData {

    @ExcelProperty(index = 0)
    private String tableName;


    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

}
