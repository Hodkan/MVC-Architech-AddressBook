package addressbook.controller;

import java.io.*;
import addressbook.model.*;
import addressbook.view.*;

public class ABController
{
    SearchByName op1;
    SearchByEmail op2;
    DisplayAllEntries op3;
    addressbook.model.AddressBookApp model;
    ABView view;
    AddressBook addressBook = null;

    public void initializeOptions() throws IOException
    {
        try
        {
            model = new addressbook.model.AddressBookApp();
            view = new ABView();
            op1 = new SearchByName();
            op2 = new SearchByEmail();
            op3 = new DisplayAllEntries();
            model.addOption(op1);
            model.addOption(op2);
            model.addOption(op3);
            addressBook = model.readAddressBook(view.getFileName());
        }

        catch(IOException eq)
        {
            throw new IOException("");
        }
        
    }

    
    public String optionControl(int selection) throws NumberFormatException, NullPointerException
    {
        String result = null;
        if(selection <= model.getOptionsSize())
        {
            String searchTerm = null;
            if(termControl(selection))
            {
                searchTerm = view.getTerm();
            }
            
            result = model.getOption(selection).doOption(searchTerm,addressBook);
        }

        else if(selection == model.getOptionsSize()+1)
        {
            result = "done";
        }

        return result;
    }


    public boolean termControl(int selection)
    {
        return model.getOption(selection).requiresText();
    }






}
