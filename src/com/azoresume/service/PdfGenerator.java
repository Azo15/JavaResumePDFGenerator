package com.azoresume.service;

import com.azoresume.model.Person;
import com.azoresume.model.Experience;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.FileOutputStream;
import java.util.List;

public class PdfGenerator {

    public void generate(Person person, List<Experience> experiences, String imagePath) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Resume.pdf"));
            document.open();

            // Fotoğraf
            Image image = Image.getInstance(imagePath);
            image.scaleToFit(100, 100);
            image.setAlignment(Element.ALIGN_RIGHT);
            document.add(image);

            // Başlık
            Font nameFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
            Paragraph name = new Paragraph(person.getName(), nameFont);
            name.setAlignment(Element.ALIGN_LEFT);
            document.add(name);

            document.add(new Paragraph(person.getEmail()));
            document.add(new Paragraph(person.getPhone()));
            document.add(new Paragraph(person.getAddress()));
            document.add(new Paragraph("\n" + person.getSummary()));
            document.add(new Paragraph("\n--------------------------------------\n"));

            // İş Deneyimleri
            Font expTitle = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
            document.add(new Paragraph("Work Experience:", expTitle));
            document.add(new Paragraph("\n"));

            for (Experience e : experiences) {
                document.add(new Paragraph(e.getCompany() + " - " + e.getPosition()));
                document.add(new Paragraph(e.getDuration()));
                document.add(new Paragraph(e.getDescription()));
                document.add(new Paragraph("\n"));
            }

            document.close();
            System.out.println("PDF oluşturuldu: Resume.pdf");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
