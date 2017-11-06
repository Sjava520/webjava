package com.work.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
public void readtranser() throws IOException{
	FileInputStream in=new FileInputStream("D://Mobile.xls");
	HSSFWorkbook workbook = new HSSFWorkbook(in);
	HSSFSheet sheet = workbook.getSheet("Sheet1");
	HSSFCell s = sheet.getRow(0).getCell(1);
	System.out.println(s);
}
public static void main(String[] args) throws IOException {
	FileInputStream in=new FileInputStream("D://Mobile.xls");
	HSSFWorkbook workbook = new HSSFWorkbook(in);
	HSSFSheet sheet = workbook.getSheet("Sheet1");
	HSSFCell s = sheet.getRow(0).getCell(1);
	System.out.println(s);
}
}
