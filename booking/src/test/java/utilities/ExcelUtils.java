package utilities;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	public static String[][] getUserNameForRegister(String sheet) throws IOException {
		
		 
		String path = System.getProperty("user.dir");
		
		XSSFWorkbook workbook = new XSSFWorkbook(path + "\\excel files\\excel data.xlsx");
		

		XSSFSheet xsheet = workbook.getSheet(sheet);
		
		XSSFRow row = null;
		
		row = xsheet.getRow(0);
		 
		DataFormatter format = new DataFormatter();
		
		int colCount = row.getLastCellNum();
		
		int rowCount = xsheet.getLastRowNum() + 1;
		
		String[][] data = new String[rowCount - 1][colCount];
		for(int i = 1; i < rowCount ; i++)
		{
			for(int j = 0; j < colCount ; j++)
			{
//				data[i-1][j] = xsheet.getRow(i).getCell(j);
				String val = format.formatCellValue(xsheet.getRow(i).getCell(j));
				
			//	Cell cell = xsheet.getRow(i).getCell(j);

				//data[i-1][j] = cell.getStringCellValue();
				data[i-1][j] = val;
	            
			}
		}
			
		return data;
	}
	
}


