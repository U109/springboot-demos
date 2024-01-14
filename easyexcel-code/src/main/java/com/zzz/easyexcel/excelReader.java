package com.zzz.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangzhongzhen wrote on 2024/1/14
 * @version 1.0
 * @description:
 */
public class excelReader {

    public static void main(String[] args) {

        String filePath = "D:\\Desktop\\Projects\\springboot-demos\\easyexcel-code\\src\\main\\resources\\table_temp.xlsx";
        EasyExcel.read(filePath, ExcelData.class, new ReadListener<ExcelData>() {
            @Override
            public void invoke(ExcelData excelData, AnalysisContext analysisContext) {
                System.out.println(excelData.getTableName());
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {

            }
        }).sheet("db1").doRead();

    }
}