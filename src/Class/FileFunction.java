/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.File;
//import java.io.IOException;
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
        String fileType = "N/A";
        boolean deleteStatus = false;
        
    	if(file.isDirectory()){
            fileType = "dir";
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
                fileType = "file";
                deleteStatus = file.delete();
                
                upadateFileMsg(file, fileType, deleteStatus);
                //System.out.println("File delete status : " + deleteStatus + "\nFile path : " + file.getAbsolutePath());
                //infoBox("File delete status : " + deleteStatus + "\nFile path : " + file.getAbsolutePath(), "File delete status");
            } catch(NullPointerException e){
//                System.out.println("An error occur : " + e.getMessage());
//                infoBox("An error occur : " + e.getMessage(), "Warning...");
                upadateFileMsg(file, fileType, deleteStatus);
            } catch(Exception e){
//                System.out.println("An error occur : " + e.getMessage());
//                infoBox("An error occur : " + e.getMessage(), "Warning...");
                upadateFileMsg(file, fileType, deleteStatus);
            } 
            //NullPointerException
    	}
    }
    
    public static void upadateFileMsg(File file,String fileType, boolean status){
        String msgOutput = "File delete status : " + status + "\nFile path : " + file.getAbsolutePath();
        String msgOutput2 = "";
        //if (fileType.equals("file")){
        System.out.println(msgOutput);
        infoBox(msgOutput, "File delete status");
        //}
        
        if (!status){
            if (file.canRead())
            System.out.println("Tips : \nThe file look no have the permission to delete.");
        }
    }
}
