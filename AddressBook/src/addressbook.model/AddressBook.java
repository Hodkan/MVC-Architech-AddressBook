package addressbook.model;
import java.util.*;

/**
 * Contains all the address book entries.
 * 
 * @author ...
 */
public class AddressBook
{
    // Insert your code here.
    private Map<String,Entry> aBook;
    
    public AddressBook()
    {
        aBook = new HashMap<String,Entry>();
    }


    public void add(String name,Entry email)
    {
        aBook.put(name,email);
    }

    public Entry getByName(String name)
    {
        return aBook.get(name);
    }

    public void delete(String name)
    {
        aBook.remove(name);
    }

    //To return name and email in order, I need all of them in the entry which is ok.
    // But Entry is stored in set and it is not returning objects in order.
    
    //Needs to check "" condition
    public Entry getByEmail(String email)
    {
        Entry foundEntry = null;
        for(String key : aBook.keySet())
        {
            if(aBook.get(key).find(email))
            {
                foundEntry = aBook.get(key);
            }
        }

        return foundEntry;

    }

    public String display()
    {
        String result = "";
        for(String key : aBook.keySet())
        {
            result = result  +  aBook.get(key) + "\n";
        }

        return result;
    }
        
}
