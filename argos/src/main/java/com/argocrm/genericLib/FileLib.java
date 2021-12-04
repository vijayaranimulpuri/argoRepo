package com.argocrm.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public static  String readPropertyData(String propPath,String key) throws Throwable
	{
	FileInputStream fis=new FileInputStream(propPath);
	Properties prop=new Properties();
	prop.load(fis);
	String	propvalue=prop.getProperty(key,"Incorrect key");
	return propvalue;
	}
	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws Throwable
	 */
	
public String readExcelData(String path,String sheetName,int row,int cell)
		throws Throwable
{
	

   FileInputStream fis= new FileInputStream(path) ;
   Workbook wb=WorkbookFactory.create(fis);
   String excelValue	= wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
   return excelValue;
}
/**
 * 
 * @param path
 * @param sheetName
 * @param row
 * @param cell
 * @param data
 * @throws Throwable
 */
public void WriteExcelData(String path,String sheetName,int row,int cell,String data)
			throws Throwable
	{
	FileInputStream fis= new FileInputStream(path) ;
	Workbook wb=WorkbookFactory.create(fis);
    wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);

    FileOutputStream fos=new FileOutputStream(path);
    wb.write(fos);

	}
/**
 * 
 * @param path
 * @param sheet
 * @return rowCount
 * @throws Throwable
 */
public int getRowCount(String path,String sheet)throws Throwable
	{
	FileInputStream fis= new FileInputStream(path) ;
	Workbook wb=WorkbookFactory.create(fis);
	int rowCount=wb.getSheet(sheet).getLastRowNum();
	return rowCount;
	}
}


