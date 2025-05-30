/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarianPackage;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author USER
 */
public class PrintReceipt {
    private String content;

    public PrintReceipt(String content) {
        this.content = content;
    }

   public void printReceipt() {
    try {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
            public int print(Graphics g, PageFormat pf, int page) {
                if (page > 0) return NO_SUCH_PAGE;

                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());

                // Split content into lines
                String[] lines = content.split("\n");
                int y = 100; // Starting y position
                int lineHeight = g.getFontMetrics().getHeight();

                for (String line : lines) {
                    g.drawString(line, 100, y);
                    y += lineHeight;
                }

                return PAGE_EXISTS;
            }
        });

        if (job.printDialog()) {
            job.print();
        }
    } catch (PrinterException e) {
        e.printStackTrace();
    }
   }
}