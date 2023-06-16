package dataprovide;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadXLdata 
{
	@DataProvider(name = "p1")
public String[][] readData() throws IOException
{
	FileInputStream file=new FileInputStream("./dataXLfile/loginData.xlsx");///DataDriverFramework1/dataXLfile/loginData.xlsx
	XSSFWorkbook book=new XSSFWorkbook(file);
	XSSFSheet sheet=book.getSheetAt(0);
	int lastrow=sheet.getLastRowNum();
	int lastcell=sheet.getRow(0).getLastCellNum();
	System.out.println("lastrow number: "+ lastrow);
	System.out.println("last cell number : "+lastcell);

	String[][] data=new String[lastrow][lastcell];

	for(int i=1;i<=sheet.getLastRowNum();i++)
	{
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<lastcell;j++)
		{
			XSSFCell cell=row.getCell(j);
			cell.setCellType(CellType.STRING);
			String value=cell.getStringCellValue();
			System.out.println(value);
			 data[i-1][j]=value;
		}
	}
	return data;
}
}
