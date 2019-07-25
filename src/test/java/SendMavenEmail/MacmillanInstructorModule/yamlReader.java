package SendMavenEmail.MacmillanInstructorModule;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.esotericsoftware.yamlbeans.YamlReader;

public class yamlReader {
	  
	static String value="";
	//static String locatorid="";
	  
	  public static String readingDataFromYamlFile(String locator) throws IOException {
		  
	  //File file1 = new File("/home/qainfotech/eclipse-workspace/MacmillanInstructorModule/Data.yaml");
	  
	  YamlReader y = new YamlReader (new FileReader (System.getProperty("user.dir")+"/Data.yml"));
	  Object object = y.read();
	  System.out.println(object);
	  Map map = (Map)object;
	  value = (String) map.get(locator);
	 // System.out.println(map.get(locator));
	 
	  
	  //BufferedReader br1 = new BufferedReader(new FileReader(file1));
	 
//	  String st1; 
//	  while ((st1 = br1.readLine()) != null)
//	  {
//           String[] aux1 = st1.split(":");
//           
//		   for (int i = 0; i < aux1.length; i++) {
//		   
//			 //  System.out.println(aux1[i]);
//			   
//			   if(aux1[i].equalsIgnoreCase(locator))
//			   {
//				    value=aux1[i+1];
//				    break;
//			   }
//		   }
//			   
//	}
	return value;
	  
	  }
	  
	/*
	 * public static void main(String args[]) throws IOException {
	 * readingDataFromYamlFile("vistext2"); }
	 */

	
}
