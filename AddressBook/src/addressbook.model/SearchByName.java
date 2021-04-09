package addressbook.model;
public class SearchByName implements Option
{
    @Override
    public String doOption(String s,AddressBook a)
    {
        Entry entryFound = a.getByName(s);
        return entryFound.toString();    

    }

    @Override
    public boolean requiresText()
    {
        return true;
    }


}
