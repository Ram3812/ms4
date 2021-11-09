package com.mindtree.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	private static XSSFWorkbook workbook;
	private static XSSFSheet Sheet;

	public static Object[] getBook(String XlsFile, String key) {
		try {
			FileInputStream FIS = new FileInputStream(new File(XlsFile));
			workbook = new XSSFWorkbook(FIS);
			Sheet = workbook.getSheetAt(0);
		} catch (IOException e) {
			System.out.println(e.toString() + ": Invalid File Path");
		}
		Object[] Data = new Object[3];
		Iterator<Row> rows = Sheet.iterator();
		Row reqR = null;
		boolean con = true;
		while (rows.hasNext() && con) {
			Row r = rows.next();
			Iterator<Cell> cells = r.cellIterator();
			while (cells.hasNext()) {
				Cell c = cells.next();
				if (c.getStringCellValue().equalsIgnoreCase(key)) {
					reqR = r;
					con = false;
					break;
				}
			}
		}
		Iterator<Cell> cells = reqR.cellIterator();
		int i = 0;
		while (cells.hasNext()) {
			Cell c = cells.next();
			if (!c.getStringCellValue().equalsIgnoreCase("BookName")) {
				Data[i] = c.getStringCellValue();
				i++;
			}
		}
		return Data;
	}
}