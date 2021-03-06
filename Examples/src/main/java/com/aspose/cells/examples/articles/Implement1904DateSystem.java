package com.aspose.cells.examples.articles;

import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class Implement1904DateSystem {
	public static void main(String[] args) throws Exception {
		// ExStart:Implement1904DateSystem
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(Implement1904DateSystem.class);
		// Initialize a new Workbook
		Workbook workbook = new Workbook(dataDir + "Mybook.xlsx");

		// Implement 1904 date system
		workbook.getSettings().setDate1904(true);

		// Save the excel file
		workbook.save(dataDir + "OutPut.xls");
		// ExEnd:Implement1904DateSystem
	}
}
