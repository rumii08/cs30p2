package skillbuilder;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Skillbuilder2
{

	public static void main(String[] args) 
	{
	
	    File textFile;
	    Scanner input = new Scanner(System.in);
	    String response ;
	    
	    textFile = new File("C:\\Users\\38086508\\git\\cs30p2\\chapter11\\src\\skillbuilder\\zzz.txt");
	    
		
	    if(textFile.exists())
	    	
	    {
			
			System.out.println("zzz. txt already exists");
	    }
	    
	    else
	    {
	    	
	    	try 
	    	{
	         
	    		textFile.createNewFile();
	    		 System.out.println("File is created.");
	    	}
	    
	    
	    	catch(IOException e)
			{
			 System.out.println("File could not be created.");
			 System.err.println("IOException: "+ e.getMessage());
			}
	    		    
	    	 System.out.println("would you like to(K)eep or (D)elete the File");
			
			if(response.equalsIgnoreCase("D"))
				
				File.delete())
          System.out.println("FIle Deleted!");
          
          
          
          
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
