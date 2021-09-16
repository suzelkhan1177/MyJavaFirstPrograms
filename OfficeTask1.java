import java.io.*;
	import java.util.*;
	import java.text.*;

	public class createLogFile extends Thread {

	    public static void Logfiles(int i){

	     Date dNow = new Date( );
	      SimpleDateFormat ft =
	      new SimpleDateFormat ("yyyy.MM.dd  hh:mm:ss");


	        try {  
	                
	            Writer w = new FileWriter(i+".txt");

	              String content = " : Hello I am Suzel"; 
	                   
	            for(int j=1; j<=10; j++){
	              
	                 try{           
	               
	            w.write(ft.format(dNow) + content + "\n ");
	            Thread.sleep(100);

	                   }catch(InterruptedException e){
	                          System.out.println(e);
	                      }  

	               }

	              w.close();
	          

	        } catch (IOException e) {
	            e.printStackTrace();
	        }



	}  
	    public static void main(String[] args) {

	    	
	    	   
	    	  for(int i=1; i<=150; i++){  
	             Logfiles(i);
	          }
	    	
	    	 
	              
	    }  
	}  
