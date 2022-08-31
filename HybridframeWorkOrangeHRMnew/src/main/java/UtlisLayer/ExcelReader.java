package UtlisLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
  public XSSFWorkbook workbook;
	public ExcelReader(String filename) throws IOException {
		File f=new File(filename);
		FileInputStream fil=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
	}
	public String getDatafromExcelsheet(int sheetindex,int rows,int cells) {
		
	try {
		return workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getStringCellValue();
	}
	catch(Exception e)

	{
		double d= workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getNumericCellValue();
	return Long.toString((long)d);
	}
	}
		public int countTotalRows(int SheetIndex) {
			return workbook.getSheetAt(SheetIndex).getLastRowNum();
		}
		
		public int countTotalcells(int SheetIndex) {
			return workbook.getSheetAt(SheetIndex).getRow(0).getLastCellNum();
		}
}
		
		
		
	
	
