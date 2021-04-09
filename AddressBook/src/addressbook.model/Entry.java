package addressbook.model;
import java.util.*;
        
/**
 * Represents a single address book entry.
 * 
 * @author ...
 */
public class Entry 
{
    // Insert your code here.

    private Set<String> emails;
    private String name;

    public void setName(String inName)
    {
        name = inName;   
    }

    public String getName()
    {
        return name;
    }

    public Entry()
    {
        emails = new HashSet<String>();
        name = null;
    }

    public Set getEntry()
    {
        return emails;
    }

    public void addEntry(String email)
    {
    
        emails.add(email);
    }

    public void remove(String email)
    {
        emails.remove(email);
    }

    public void display()
    {
        for(String email : emails)
        {
            System.out.print(email + ", ");
        }

        System.out.println();
    }

    public boolean find(String email)
    {
        return emails.contains(email);
    }
    

    public String toString()
    {
        String result = "";
        for(String email:emails)
        {
            result = result + ", " + email;
        }

        result = name + result;

        return result;
    }
            

    
}
