package com.aspose.cells.examples.data.addon.namedranges;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class AccessSpecificNamedRange {

	public static void main(String[] args) throws Exception {
		// ExStart:AccessSpecificNamedRange
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AccessSpecificNamedRange.class);

		// Instantiating a Workbook object
		Workbook workbook = new Workbook(dataDir + "book1.xls");

		WorksheetCollection worksheets = workbook.getWorksheets();

		// Accessing the first worksheet in the Excel file
		Worksheet sheet = worksheets.get(0);
		Cells cells = sheet.getCells();

		// Getting the specified named range
		Range namedRange = worksheets.getRangeByName("TestRange");

		// Print message
		System.out.println("Named Range : " + namedRange.getRefersTo());
		// ExEnd:AccessSpecificNamedRange
	}
}
