package com.Email.Download;
// Important Points
// 1. Create Maven Project
//  2.  javax.mail.jar
// 3. Activation Jar Add

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;  
import java.util.Properties;  
import javax.mail.Folder;  
import javax.mail.Message;  
import javax.mail.MessagingException;  
import javax.mail.NoSuchProviderException;  
import javax.mail.Session;  
import com.sun.mail.pop3.POP3Store;  
  
public class EmailAttachmentReceiver{  
  
 public static void receiveEmail(String host, String storeType,  
  String user, String password, String port) throws IOException {  
  try {  
 
   Properties properties = new Properties();  

   
   properties.put("mail.pop3.host", host);
   properties.put("mail.pop3.port", port);

   properties.setProperty("mail.pop3.socketFactory.class",
           "javax.net.ssl.SSLSocketFactory");
   properties.setProperty("mail.pop3.socketFactory.fallback", "false");
   properties.setProperty("mail.pop3.socketFactory.port",
           String.valueOf(port));
   Session emailSession = Session.getDefaultInstance(properties);  
     

   POP3Store emailStore = (POP3Store) emailSession.getStore(storeType);  
   emailStore.connect(user, password);  
  
 
   Folder emailFolder = emailStore.getFolder("INBOX");  
   emailFolder.open(Folder.READ_ONLY);  
  

   Message[] messages = emailFolder.getMessages();  
//   for (int i = 0; i < messages.length; i++) {
   for (int i = messages.length-1; i>=0; i--) {  
    Message message = messages[i];  
//    System.out.println("---------------------------------");  
//    System.out.println("Email Number " + (i + 1));  
//    System.out.println("Subject: " + message.getSubject());  
//    System.out.println("From: " + message.getFrom()[0]);  
//    System.out.println("Text: " + message.getContent().toString());  
    
    File file = new File("/home/credentek/Desktop/Attachment/"+ i+ ".txt");
    String fileData = message.getContent().toString();
    try
    {
     
      
       
       if( file.createNewFile())
       {
    	   FileOutputStream fos = new FileOutputStream(file);
    	   fos.write(fileData.getBytes());
    	   fos.flush();
    	   fos.close();
          System.out.println("File "+ i+ " created successfully");
       }
       else
       {
          System.out.println("File already exists");
       }
    }
    catch(IOException ex)
    {
       System.out.println("Exception : ");
       ex.printStackTrace();
    }
    
    
   }  
  
 
   emailFolder.close(false);  
   emailStore.close();  
  
  } catch (NoSuchProviderException e) {e.printStackTrace();}   
  catch (MessagingException e) {e.printStackTrace();}  
 }  
  
 public static void main(String[] args) throws IOException {  
  
	 System.out.println("Email Download wating");
	 String host = "pop.gmail.com";
     String port = "995";

  String mailStoreType = "pop3";  
  String username= "fantailp.support@credentek.com";  
  String password= "123f@nt@ilp";
  
  receiveEmail(host, mailStoreType, username, password,port);  
  
 }  
}  
