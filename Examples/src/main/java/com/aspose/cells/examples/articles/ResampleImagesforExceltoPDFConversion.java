package com.aspose.cells.examples.articles;

import com.aspose.cells.PdfSaveOptions;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class ResampleImagesforExceltoPDFConversion {
	public static void main(String[] args) throws Exception {
		// ExStart:ResampleImagesforExceltoPDFConversion
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ResampleImagesforExceltoPDFConversion.class);
		// Initialize a new Workbook
		// Open an Excel file
		Workbook workbook = new Workbook(dataDir + "Book1.xlsx");

		// Instantiate the PdfSaveOptions
		PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
		// Set Image Resample properties
		pdfSaveOptions.setImageResample(300, 70);

		// Save the PDF file
		workbook.save(dataDir + "output.pdf", pdfSaveOptions);
		// ExEnd:ResampleImagesforExceltoPDFConversion
	}
}
