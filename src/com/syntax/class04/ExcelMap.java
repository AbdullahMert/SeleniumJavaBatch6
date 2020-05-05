package com.syntax.class04;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMap {

	public static void main(String[] args) throws IOException {
		String pathSystem = System.getProperty("user.dir");
		String fullPath = pathSystem + "\\TestData\\Test.xlsx";
		FileInputStream fis = new FileInputStream(fullPath);

		Workbook book = new XSSFWorkbook(fis);
		Sheet sheet = book.getSheet("Sheet1");

		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();

		List<Map<String, String>> listMap = new ArrayList<>();

		for (int i = 1; i < rowCount; i++) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int j = 0; j < colCount; j++) {
				String key = sheet.getRow(0).getCell(j).toString();
				String value = sheet.getRow(i).getCell(j).toString();
				map.put(key, value);
			}
			listMap.add(map);
		}
		System.out.println(listMap);
	}

}
