
/**
 * The GiftListTester performs tests on the GiftList class.
 * 
 * @author Richard White 
 * @version 2013-12-05
 */

import java.util.Scanner;

public class GiftListInteractiveTester
{
    public static void main(String[] args)
    {
        int errorCheck = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Creating empty Xmas List");
        GiftList myXmasGifts = new GiftList();  // initiliazing gift list
        
        String choice = "0";
        while (!choice.equals("8"))
        {
            System.out.println("1) add person");
            System.out.println("2) add person + gift");
            System.out.println("3) view shopping list (only 'not done')");
            System.out.println("4) view complete list");
            System.out.println("5) edit gift");
            System.out.println("6) mark gift entry as purchased");
            System.out.println("7) remove someone");
            System.out.println("8) exit program");
            System.out.print("Your selection: ");
            choice = in.nextLine();
            
            if (choice.equals("1"))
            {
                System.out.print("Enter name of person to add: ");
                String person = in.nextLine();
                myXmasGifts.addToList(person);
            }
            else if (choice.equals("2"))
            {
                System.out.print("Enter name of person to add: ");
                String person = in.nextLine();
                System.out.print("Enter name of gift: ");
                String gift = in.nextLine();
                myXmasGifts.addToList(person, gift);
            }
            else if (choice.equals("3"))
            {
                System.out.println("Printing out just the shopping list");
                System.out.println(myXmasGifts.toPurchase());
            }
            else if (choice.equals("4"))
            {
                System.out.println("Printing out full list:");
                System.out.println(myXmasGifts.seeFullList());  
            }
            else if (choice.equals("5"))
            {
                System.out.print("Enter name of person whose gift your editing: ");
                String person = in.nextLine();
                System.out.print("Enter name of new gift: ");
                String gift = in.nextLine();
                myXmasGifts.editGift(person,gift);   
            }
            else if (choice.equals("6"))
            {
                System.out.print("Enter name of person whose gift you've purchased: ");
                String person = in.nextLine();
                errorCheck = myXmasGifts.checkOffList(person);
                if (errorCheck != 1) System.out.println("There was an error!");
            }
            else if (choice.equals("7"))
            {
                System.out.print("Enter name of person to remove: ");
                String person = in.nextLine();
                errorCheck = myXmasGifts.beenNaughty(person);
                if (errorCheck == 0) System.out.println("Error: " + person + " not found.");
            }
            else if (choice.equals("8"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid entry--please try again.");
            }
        }
        System.out.println("Happy shopping! Goodbye!");
    }
}
