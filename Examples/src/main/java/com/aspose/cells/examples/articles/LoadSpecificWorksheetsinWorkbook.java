package com.aspose.cells.examples.articles;

import com.aspose.cells.LoadDataOption;
import com.aspose.cells.LoadFormat;
import com.aspose.cells.LoadOptions;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class LoadSpecificWorksheetsinWorkbook {
	public static void main(String[] args) throws Exception {
		// ExStart:LoadSpecificWorksheetsinWorkbook
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(LoadSpecificWorksheetsinWorkbook.class);

		// Define a new Workbook
		Workbook workbook;

		// Set the load data option with selected sheet(s)
		LoadDataOption dataOption = new LoadDataOption();
		dataOption.SheetNames = new String[] { "Sheet2" };

		// Load the workbook with the specified worksheet only
		LoadOptions loadOptions = new LoadOptions(LoadFormat.XLSX);
		loadOptions.setLoadDataOptions(dataOption);
		loadOptions.setLoadDataAndFormatting(true);

		// Create the workbook
		workbook = new Workbook(dataDir + "sample.xlsx", loadOptions);

		// Perform your desired task

		// Save the workbook
		workbook.save(dataDir + "output.xlsx", SaveFormat.XLSX);
		// ExEnd:LoadSpecificWorksheetsinWorkbook
	}
}
