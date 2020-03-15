package com.scq.excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @ClassName ExportExcel
 * @Description
 * @Author JavaQ
 * @Date 2019/12/31 16:53
 **/
public class ExportExcel {

    @Test
    public void Test() throws IOException {
//        HSSFWorkbook workbook = new HSSFWorkbook();
//        HSSFSheet sheet1 = workbook.createSheet("sheet1");
//        HSSFRow row = sheet1.createRow(0);
//        HSSFCell cell = row.createCell(0);
//        cell.setCellValue("你好 2020年");
//        FileOutputStream outputStream = new FileOutputStream("D:\\war\\2020.xls");
//        workbook.write(outputStream);
//        outputStream.flush();
        System.out.println(Integer.parseInt("1010",2));
    }

}
