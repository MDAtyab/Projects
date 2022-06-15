package pdfGeneration;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
public class HelloWorld
{
   public static void main(String[] args) throws MalformedURLException, IOException
   {
      Document document = new Document();
   
      try
      {
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
         document.open();
         document.add(new Paragraph("A Hello World PDF document."));
         
//       Setting File Attributes to the pdf.
//       The Properties can be viewed on System Editor by clicking
//       Right button on the pdf document and selecting properties option.  
         document.addAuthor("Atyab Husain");
         document.addCreationDate();
         document.addCreator("HowToDoInJava.com");
         document.addTitle("Set Attribute Example");
         document.addSubject("An example to show how attributes can be added to pdf files.");
         
//       Adding a jpeg format image stored in system to the pdf.
         
         //Add Image
         Image image1 = Image.getInstance("Studio_Project.jpeg");

         //Fixed Positioning
         image1.setAbsolutePosition(100f, 550f);

         //Scale to new height and new width of image
         image1.scaleAbsolute(200, 200);
         
         //Add to document
         document.add(image1);
         
//       Adding Table to the pdf  
 
         PdfPTable table = new PdfPTable(3); // 3 columns.
         table.setWidthPercentage(100); //Width 100%
         table.setSpacingBefore(10f); //Space before table
         table.setSpacingAfter(10f); //Space after table
  
         //Set Column widths
         float[] columnWidths = {1f, 1f, 1f};
         table.setWidths(columnWidths);
  
         PdfPCell cell1 = new PdfPCell(new Paragraph("Cell 1"));
         cell1.setBorderColor(BaseColor.BLUE);
         cell1.setPaddingLeft(10);
         cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
         cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
  
         PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
         cell2.setBorderColor(BaseColor.GREEN);
         cell2.setPaddingLeft(10);
         cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
         cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
  
         PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
         cell3.setBorderColor(BaseColor.RED);
         cell3.setPaddingLeft(10);
         cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
         cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
  
         //To avoid having the cell border and the content overlap, if you are having thick cell borders
         //cell1.setUserBorderPadding(true);
         //cell2.setUserBorderPadding(true);
         //cell3.setUserBorderPadding(true);
  
         table.addCell(cell1);
         table.addCell(cell2);
         table.addCell(cell3);
         document.newPage();
         
         document.add(table);
      
         document.close();
         writer.close();
      } catch (DocumentException e)
      {
         e.printStackTrace();
      } catch (FileNotFoundException e)
      {
         e.printStackTrace();
      }
   }
}