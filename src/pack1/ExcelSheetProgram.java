package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetProgram {

	public static void main(String[] args) throws IOException
	{
		//PATH Of exel
		String exelPath="D:\\SELIUM\\APACHE\\VBM.xlsx";
//   file read karachi
	//	java cha yek clss ahe file input striam
		FileInputStream file =new FileInputStream(exelPath);
		
		//to read the work book apache lab
		// workbook ha apache cha class ahe
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
         XSSFRow row=sheet.getRow(4);
         XSSFCell cell =row.getCell(1);
         String data=cell.getStringCellValue();
         System.out.println(data);
		
	}

}
