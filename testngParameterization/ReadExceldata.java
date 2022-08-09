package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata {

	public static String[][] testData() throws IOException {

		XSSFWorkbook book = new XSSFWorkbook("./Exceldata/SampleData.xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();// by default it considers the first row as header
		System.out.println(rowCount);
		XSSFRow row = sheet.getRow(1);
		int cellCount = row.getLastCellNum();
		System.out.println(cellCount);
		
		String[][] data=new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				// book-->sheet->read the row-->col-->read the values
				String celldatas = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=celldatas;
				//data[0][0]=TL
				
			}

		}
		book.close();
		return data;

	}

}
