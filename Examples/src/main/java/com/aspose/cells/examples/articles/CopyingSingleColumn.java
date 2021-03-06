package com.aspose.cells.examples.articles;

import com.aspose.cells.Cells;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class CopyingSingleColumn {
	public static void main(String[] args) throws Exception {
		// ExStart:CopyingSingleColumn
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CopyingSingleColumn.class);
		// Create an instance of Workbook class by loading the existing spreadsheet
		Workbook workbook = new Workbook(dataDir + "aspose-sample.xlsx");

		// Get the cells collection of first workshet
		Cells cells = workbook.getWorksheets().get("Columns").getCells();

		// Copy the first column to next 10 columns
		for (int i = 1; i <= 10; i++) {
			cells.copyColumn(cells, 0, i);
		}
		// Save the result on disc
		workbook.save(dataDir + "output.xlsx");
		// ExEnd:CopyingSingleColumn
	}
}
