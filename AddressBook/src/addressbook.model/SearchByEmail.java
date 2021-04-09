package addressbook.model;
public class SearchByEmail implements Option
{
    @Override
    public  String doOption(String s, AddressBook a)
    {
        Entry entry = a.getByEmail(s);
        return entry.toString();

    }
    

    @Override
    public boolean requiresText()
    {
        return true;
    }


}
