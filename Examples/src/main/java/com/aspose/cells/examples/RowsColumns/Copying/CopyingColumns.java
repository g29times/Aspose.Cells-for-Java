package com.aspose.cells.examples.RowsColumns.Copying;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.examples.Utils;

public class CopyingColumns {

	public static void main(String[] args) throws Exception {
		// ExStart:CopyingColumns
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CopyingColumns.class);

		// Create a new Workbook.
		Workbook excelWorkbook = new Workbook(dataDir + "book1.xls");

		// Get the first worksheet in the workbook.
		Worksheet wsTemplate = excelWorkbook.getWorksheets().get(0);

		// Copy the first column from the first worksheet of the first workbook
		// into
		// the first worksheet of the second workbook.

		wsTemplate.getCells().copyColumn(wsTemplate.getCells(), 1, 4);

		// Save the excel file.
		excelWorkbook.save(dataDir + "output.xls");

		// Print message
		System.out.println("Column copied successfully.");
		// ExEnd:CopyingColumns
	}
}
