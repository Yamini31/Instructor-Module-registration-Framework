package SendMavenEmail.MacmillanInstructorModule;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class csvWrite {

	

	//static File f=new File("/home/qainfotech/eclipse-workspace/MacmillanInstructorModule/DataWrite.csv");
	
	public static void abc(String id)
	{ 
		File file = new File("/home/qainfotech/eclipse-workspace/MacmillanInstructorModule/DataWrite.csv"); 
    try { 
              
    	FileWriter outputfile = new FileWriter(file); 
  
        CSVWriter writer = new CSVWriter(outputfile); 
  
        // adding header to csv 
        String[] header = {id};
        writer.writeNext(header);
    
        writer.close(); 
    } 
    catch (IOException e) { 
        // TODO Auto-generated catch block 
        e.printStackTrace(); 
    } 
	}
}
