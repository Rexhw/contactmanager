/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager;

/**
 *
 * @author rexbolt1
 */
public class ContactApp {
    Contact[]contacts = new Contact[100];
    int count = 0;
         
        public void addContact(String userName,String userLast,String userEmail,String userPhone){
            Contact c = new Contact(); //calls back from Contact.java
            c.setUserName(userName); //sets userName, blah blah 
            c.setUserLast(userLast);
            c.setUserEmail(userEmail);
            c.setUserPhone(userPhone);
            contacts[count] = c; //sets C (Contact) to 
            count = count + 1;
            //dbHandler.insertRow(Strings)
            
        }
        String[] getContactList(){
            String[] stringArray = new String[contacts.length]; //creates StringArray to a String of the number of Contacts
            for (int i=0; i < contacts.length; i++){ //for loop to count i
                if(contacts[i] != null){ //if contacts i is not empty
                    stringArray[i] = contacts[i].toString(); //then stringArray will
                }
            }
        return stringArray;    
        }
        
        void deleteContact(){
            
        }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    String[] getContactFields(int selected){
        if(selected > 1){
            Contact c = contacts[selected];
            String[] fields = new String[4];
            fields[0] = c.getUserName();
            fields[1] = c.getUserLast();
            fields[2] = c.getUserPhone();
            fields[3] = c.getUserEmail();
            return fields;
        } else{
            return null;
        }
    }
}

