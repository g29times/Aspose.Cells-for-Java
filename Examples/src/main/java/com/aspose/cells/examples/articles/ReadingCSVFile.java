package com.aspose.cells.examples.articles;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.TxtLoadOptions;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class ReadingCSVFile {
	public static void main(String[] args) throws Exception {
		// ExStart:ReadingCSVFile
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadingCSVFile.class);

		// Set Multi Encoded Property to True
		TxtLoadOptions options = new TxtLoadOptions();
		options.setMultiEncoded(true);

		// Load the CSV file into Workbook
		Workbook workbook = new Workbook(dataDir + "MutliEncoded.csv", options);

		// Save it in XLSX format
		workbook.save(dataDir + "out.xlsx", SaveFormat.XLSX);
		// ExEnd:ReadingCSVFile
	}
}
