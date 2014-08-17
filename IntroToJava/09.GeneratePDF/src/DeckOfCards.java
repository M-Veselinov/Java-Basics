import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class DeckOfCards {
	public static void main(String[] args) {
		try {
			//creating new PDF document
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("MyFirstFile.pdf"));
			document.open();
			//creating table in the new document
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(80);
			table.getDefaultCell().setFixedHeight(140);
			//setting font
			
			String result = " ";
        
        	char jack = 'J';
        	char queen = 'Q';
        	char knight = 'K';
        	char ace = 'A';
        
        	final Font NORMAL = new Font(FontFamily.SYMBOL, 20);
            final Font RED = new Font(FontFamily.SYMBOL, 20);
            RED.setColor(BaseColor.RED);
            
        	char clubs = 170;
			char spades = 167;
			char hearts = 168;
			char diamonds = 169;
        	
        	for (int i = 0; i < 13; i++) {
        	
        		for (int j = 0; j < 4; j++) {
				
        			switch (i) {
        			case 0:result = "2"; break;
        			case 1:result = "3"; break;
        			case 2:result = "4"; break;
        			case 3:result = "5"; break;
        			case 4:result = "6"; break;
        			case 5:result = "7"; break;
        			case 6:result = "8"; break;
        			case 7:result = "9"; break;
        			case 8:result = "10"; break;
        			case 9:result = " "+jack; break;
        			case 10:result = " "+ queen; break;
					case 11:result = " "+ knight; break;
					case 12:result = " " + ace;	break;
					default: 
						; break;
        			}
				
        			switch (j) {
        			case 0: table.addCell(new Paragraph(result + clubs, NORMAL)); break;
        			case 1: table.addCell(new Paragraph(result + diamonds, RED)); break;
        			case 2: table.addCell(new Paragraph(result + spades, NORMAL)); break;
        			case 3: table.addCell(new Paragraph(result + hearts, RED)); break;
        			}
				
        		}
			
        	}
        	
        	document.add(table);
        	document.close();
        	
		}
	
		catch (Exception e) {
			 e.printStackTrace();
		}
		
	}
}
