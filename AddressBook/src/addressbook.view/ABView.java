package addressbook.view;

import addressbook.controller.*;
import java.io.*;
import java.util.*;
public class ABView
{

    private static Scanner input = new Scanner(System.in);
    private String fileName;
    public String getFileName()
    {
        System.out.print("Enter address book filename: ");
        fileName = input.nextLine();

        return fileName;
    }

                            
        


    public static void showMenu()
    {
        ABController ctrl = new ABController();


        try
        {
            ctrl.initializeOptions();
        


            boolean done = false;
            while(!done)                                                            
            {                                                                       
                int option;                                                         
                                                                                
                try                                                                 
                {                                                                   
                    System.out.println("(1) Search by name, (2) Search by email, (3) Display All Entries, (4) Quit");
                    option = Integer.parseInt(input.nextLine());
                    String result = ctrl.optionControl(option);
                
                    if(result.equals("done"))
                    {
                        done = true;
                    }
                
                    else
                    {
                        System.out.println(result);
                    }
                }

                                                                                
                catch(NumberFormatException e)                                      
                {                                                                      
                    // The user entered something non-numerical.                    
                    System.out.println("Enter a number");    
                }                                                                   
                                                                                
                catch(NullPointerException e)                                       
                {                                                                   
                    System.out.println("Entry could not found.");                   
                }                                                                   
            }
        }

        catch(IOException ex)
        {
            System.out.println("File could not be found!");
        }

    }                                  

     

   public String getTerm()
    {
        System.out.println("Enter a search term: ");
        String searchTerm = input.nextLine();
        return searchTerm;
    }                                     
    








}
