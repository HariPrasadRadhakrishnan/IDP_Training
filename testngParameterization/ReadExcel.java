package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step:1->set the path for the excelsheet
		
		XSSFWorkbook book=new XSSFWorkbook("./Exceldata/SampleData.xlsx");
		
		//Step:2->identify the sheet		
		XSSFSheet sheet = book.getSheetAt(0);
			
		//book-->sheet->read the row-->col-->read the values
		XSSFRow row = sheet.getRow(1);		
		XSSFCell cell = row.getCell(2);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		
		int rowCount= sheet.getLastRowNum();//by default it considers the first row as header
		System.out.println(rowCount);
				
		int cellCount = row.getLastCellNum();
		System.out.println(cellCount);
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				//book-->sheet->read the row-->col-->read the values
				String datas = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(datas);
							}
			
		}
		/*
		 * int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();//returns all the
		 * active cell in the sheet
		 * 
		 * System.out.println(physicalNumberOfRows);
		 */
		
		
		
	}

}
