package com.aspose.cells.examples.articles;

import com.aspose.cells.Color;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.examples.Utils;

public class SetWorksheetTabColor {
	public static void main(String[] args) throws Exception {
		// ExStart:SetWorksheetTabColor
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SetWorksheetTabColor.class);
		// Instantiate a new Workbook
		Workbook workbook = new Workbook(dataDir + "Book1.xls");
		// Get the first worksheet in the book
		Worksheet worksheet = workbook.getWorksheets().get(0);
		// Set the tab color
		worksheet.setTabColor(Color.getRed());
		// Save the Excel file
		workbook.save(dataDir + "worksheettabcolor.xls");
		// ExEnd:SetWorksheetTabColor
	}
}
