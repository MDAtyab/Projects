package invoiceGeneration;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;

import java.io.IOException;

public class Main {
	public static void main(String[] args)throws IOException {
	
		String path = "e:\\Project/Invoice.pdf";
		PdfWriter pdfWriter = new PdfWriter(path);
		PdfDocument pdfDocument = new PdfDocument(pdfWriter);
	
		Document document = new Document(pdfDocument);
		pdfDocument.setDefaultPageSize(PageSize.A4);
		
		float col = 280f;
		float columnWidth[] = {col, col};
		Table table = new Table(columnWidth);
		
		table.setBackgroundColor(new DeviceRgb(63, 169, 219));
		table.setFontColor(Color.WHITE);
		table.addCell(new Cell().add("INVOICE")
				.setTextAlignment(TextAlignment.CENTER)
					.setVerticalAlignment(VerticalAlignment.MIDDLE)
					.setMarginTop(30f)
					.setMarginBottom(30f)
					.setFontSize(30f)
					.setBorder(Border.NO_BORDER)
					
		
				);
		
		table.addCell(new Cell().add("Haaris Infotech\nB-30, Twin Courtz Apartments,\nAnna High Road, Perungudi,\nChennai - 600096")
			.setTextAlignment(TextAlignment.RIGHT)
				.setMarginTop(30f)
				.setMarginBottom(30f)
				.setBorder(Border.NO_BORDER)
				.setMarginRight(10f)
				);
		
		float colWidth[] = {80, 300, 100, 80};
		Table customerInfoTable = new Table(colWidth);
		
		customerInfoTable.addCell(new Cell(0,4)
				.add("Customer Information")
				.setBold()
				.setBorder(Border.NO_BORDER));
		
		customerInfoTable.addCell(new Cell().add("Name").setBorder(Border.NO_BORDER));
		customerInfoTable.addCell(new Cell().add("Atyab Husain").setBorder(Border.NO_BORDER));
		customerInfoTable.addCell(new Cell().add("Invoice No.").setBorder(Border.NO_BORDER));
		customerInfoTable.addCell(new Cell().add("67").setBorder(Border.NO_BORDER));
		
		customerInfoTable.addCell(new Cell().add("Contact No.").setBorder(Border.NO_BORDER));
		customerInfoTable.addCell(new Cell().add("9122126391").setBorder(Border.NO_BORDER));
		customerInfoTable.addCell(new Cell().add("Date:").setBorder(Border.NO_BORDER));
		customerInfoTable.addCell(new Cell().add("15-06-2022").setBorder(Border.NO_BORDER));
		
		
		float itemInfoColWidth[] = {140, 140, 140, 140};
		Table itemInfoTable = new Table(itemInfoColWidth);
		
		itemInfoTable.addCell(new Cell().add("Date")
				.setBackgroundColor(new DeviceRgb(63,169,219))
				.setFontColor(Color.WHITE));
		itemInfoTable.addCell(new Cell().add("Topic")
				.setBackgroundColor(new DeviceRgb(63,169,219))
				.setFontColor(Color.WHITE));
		itemInfoTable.addCell(new Cell().add("Hrs.")
				.setBackgroundColor(new DeviceRgb(63,169,219))
				.setFontColor(Color.WHITE)
				.setTextAlignment(TextAlignment.RIGHT));
		itemInfoTable.addCell(new Cell().add("Price")
				.setBackgroundColor(new DeviceRgb(63,169,219))
				.setFontColor(Color.WHITE)
				.setTextAlignment(TextAlignment.RIGHT));
		
		itemInfoTable.addCell(new Cell().add("June 18-26"));
		itemInfoTable.addCell(new Cell().add("lang & Util Package"));
		itemInfoTable.addCell(new Cell().add("6")
				.setTextAlignment(TextAlignment.RIGHT));
		itemInfoTable.addCell(new Cell().add("200")
				.setTextAlignment(TextAlignment.RIGHT));
		
		itemInfoTable.addCell(new Cell().add("July 2-10"));
		itemInfoTable.addCell(new Cell().add("IO,NIO & JDBC"));
		itemInfoTable.addCell(new Cell().add("6")
				.setTextAlignment(TextAlignment.RIGHT));
		itemInfoTable.addCell(new Cell().add("300")
				.setTextAlignment(TextAlignment.RIGHT));
		
		itemInfoTable.addCell(new Cell().add("July 16-24"));
		itemInfoTable.addCell(new Cell().add("HTML5,JScript,Servlet & JSP"));
		itemInfoTable.addCell(new Cell().add("6")
				.setTextAlignment(TextAlignment.RIGHT));
		itemInfoTable.addCell(new Cell().add("400")
				.setTextAlignment(TextAlignment.RIGHT));
		
		itemInfoTable.addCell(new Cell().add("July 30-Aug 7"));
		itemInfoTable.addCell(new Cell().add("Servlets Project & SpringBoot DI"));
		itemInfoTable.addCell(new Cell().add("6")
				.setTextAlignment(TextAlignment.RIGHT));
		itemInfoTable.addCell(new Cell().add("200")
				.setTextAlignment(TextAlignment.RIGHT));
		
		itemInfoTable.addCell(new Cell().add("Aug 13-Sept 25"));
		itemInfoTable.addCell(new Cell().add("SpringBoot AOP,JPA,Project & SpringWeb REST"));
		itemInfoTable.addCell(new Cell().add("18")
				.setTextAlignment(TextAlignment.RIGHT));
		itemInfoTable.addCell(new Cell().add("400")
				.setTextAlignment(TextAlignment.RIGHT));
		
		itemInfoTable.addCell(new Cell().add("")
				.setBackgroundColor(new DeviceRgb(63,169,219))
				.setBorder(Border.NO_BORDER));
		itemInfoTable.addCell(new Cell().add("")
				.setBackgroundColor(new DeviceRgb(63,169,219))
				.setBorder(Border.NO_BORDER));
		itemInfoTable.addCell(new Cell().add("Total Hrs.  42")
				.setTextAlignment(TextAlignment.RIGHT)
				.setBackgroundColor(new DeviceRgb(63,169,219))
				.setBorder(Border.NO_BORDER)
				.setFontColor(Color.WHITE));
		itemInfoTable.addCell(new Cell().add("Total Amount  1500")
				.setTextAlignment(TextAlignment.RIGHT)
				.setBackgroundColor(new DeviceRgb(63,169,219))
				.setBorder(Border.NO_BORDER)
				.setFontColor(Color.WHITE));
		
		
		
		
		document.add(table);
		document.add(new Paragraph("\n"));
		document.add(customerInfoTable);
		document.add(new Paragraph("\n"));
		document.add(itemInfoTable);
		document.add(new Paragraph("M.H. Shoiab")
				.setTextAlignment(TextAlignment.RIGHT));
		document.add(new Paragraph("(Authorised Signatory)")
			.setTextAlignment(TextAlignment.RIGHT));
		document.close(); 
		
		System.out.println("pdf created");
	}
	
}
