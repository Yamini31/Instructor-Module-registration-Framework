import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.opencsv.CSVWriter;

public class ExcelSavingData {
	
	//static File f=new File("/home/qainfotech/eclipse-workspace/MacmillanInstructorModule/DataWrite.csv");
	
	public static void abc(String id)
	{ 
		File file = new File("/home/qainfotech/eclipse-workspace/MacmillanInstructorModule/DataWrite.csv"); 
    try { 
              
    	FileWriter outputfile = new FileWriter(file); 
  
        CSVWriter writer = new CSVWriter(outputfile); 
  
        // adding header to csv 
        String[] header = {"id"}; 
        writer.writeNext(header); 
  
        // add data to csv 
        String[] data1 = new String[10];
        for (int i = 0; i < data1.length; i++) {
        
        writer.writeNext(data1); 
        
        }
  
        // closing writer connection 
        writer.close(); 
    } 
    catch (IOException e) { 
        // TODO Auto-generated catch block 
        e.printStackTrace(); 
    } 
	}
}
