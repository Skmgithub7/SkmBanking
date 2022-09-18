package Skm.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

public class XLUtils {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Row row;
	public static Cell cell;
}
	
	/*public static int getRowCount(String xlfile, String xlsheet) throws IOException 
	{
		fi = new FileInputStream(xlfile);
		wb=new Workbook(fi);
		ws=wb.getSheet(xlsheet);
	}
}*/
