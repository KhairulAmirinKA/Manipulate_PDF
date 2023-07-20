/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learn_pdfbox;

/**
 *
 * @author Khairul<Khairul Amirin UM>
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;

public class Calculate_Page {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            File file= new File("LinkedList.pdf");
            
            PDDocument doc= Loader.loadPDF(file);
            
            int page= doc.getNumberOfPages();
            
            System.out.println("The number of pages: "+ page);
            
            
        } 
        
        catch (FileNotFoundException e) {
            System.out.println("Not found");
        }
        
        catch(IOException ie){
            ie.printStackTrace();
        }
    }
    
}
