package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetP2 
{

	public static void main(String[] args) throws IOException 
	{
		

				String exelPath="D:\\SELIUM\\APACHE\\VBM.xlsx";
	
		
				FileInputStream file =new FileInputStream(exelPath);
				
			
				XSSFWorkbook workbook=new XSSFWorkbook(file);
				XSSFSheet sheet=workbook.getSheet("Sheet1");
	         XSSFRow row=sheet.getRow(0);
		        XSSFCell cell =row.getCell(0);
	         String data=cell.getStringCellValue();
	         System.out.println(data);
		         
//	         for(int i=0;i<=6;i++)
//		         {
//	        	 for(int j=0;j<=1;j++)
//	        	 {
//	        		  XSSFRow row=sheet.getRow(i);
//	  		        XSSFCell cell =row.getCell(j);
//		  		         String data=cell.getStringCellValue();
//		  		         System.out.println(data);
//        	 }
//		         }
	         
				
			int lastrowno	=sheet.getLastRowNum();
			System.out.println(lastrowno);
			
		int lastcellno=row.getLastCellNum();
		System.out.println(lastcellno);
			
			
			
	         
			
	         
	}
}
