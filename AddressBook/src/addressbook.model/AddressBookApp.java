package addressbook.model;
import java.util.*;
import java.io.*;

public class AddressBookApp
{
    public static List<Option> options = new ArrayList<Option>();

   
    public int getOptionsSize()
    {
        return options.size();
    }

    public Option getOption(int i)
    {
        return options.get(i-1);
    }

    public void addOption(Option x)
    {
        this.options.add(x);
    }




 

    public static AddressBook readAddressBook(String fileName) throws IOException
    {                                                                           
        AddressBook addressBook = new AddressBook();                            
                                                                                
        BufferedReader reader = new BufferedReader(new FileReader(fileName));   
        String line = reader.readLine();                                        
        while(line != null)                                                     
        {                                                                       
            String[] parts = line.split(":");                                   
                                                                                
            Entry entry = new Entry();                                          
            int length = parts.length;                                          
            entry.setName(parts[0]);                                            
            for(int i = 1 ; i <length; i++)                                     
            {                                                                   
                entry.addEntry(parts[i]);                                       
            }                                                                   
                                                                                
            addressBook.add(parts[0],entry);                                    
                                                                                
                                                                                
            line = reader.readLine();                                           
        }                                                                       
        reader.close();                                                         
                                                                                
        return addressBook;                                                     
    }          

}
