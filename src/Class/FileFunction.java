/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.File;
import static testsomeshit.GUI.infoBox;

/**
 *
 * @author alan0
 */
public class FileFunction {
    
    public static boolean checkField(String str) {
        return !str.equals("");//no empty is true
    }
    
    public static void delete(File file){
    	if(file.isDirectory()){
    		//directory is empty, then delete it
    		if(file.list().length==0){
    			
    		   file.delete();
    		   System.out.println("Directory is deleted : " + file.getAbsolutePath());
    			
    		}else{
    		   //list all the directory contents
        	   String files[] = file.list();
     
        	   for (String temp : files) {
        	      //construct the file structure
        	      File fileDelete = new File(file, temp);
        		 
        	      //recursive delete
        	     delete(fileDelete);
        	   }
        		
        	   //check the directory again, if empty then delete it
        	   if(file.list().length==0){
           	     file.delete();
        	     System.out.println("Directory is deleted : " + file.getAbsolutePath());
        	   }
    		}
    	}else{
            try{
                boolean deleteStatus = file.delete();
                
                System.out.println("File delete status : "+ deleteStatus +"\nFile path : " + file.getAbsolutePath());
                infoBox("File delete status : "+ deleteStatus +"\nFile path : " + file.getAbsolutePath(), "File delete status");

            } catch(Exception e){
                System.out.println("An error occur : " + e.getMessage());
                infoBox("An error occur : " + e.getMessage(), "Warning...");
            }
    	}
    }
}
