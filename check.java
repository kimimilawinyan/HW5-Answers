import java.util.Scanner;


public class check
{
    // instance variables - replace the example below with your own
    public static int checknumber;
    public static int amount;
    public static String name;
    public static String payee;
    public static String reason;
    
    

    //Constructor
    public check()
    {
        // initialise instance variables
        
        
        System.out.println("Please enter check number: ");
        Scanner in1 = new Scanner(System.in);
        checknumber = in1.nextInt();
        
        System.out.println("Please enter amount to be paid forward: ");
        Scanner in2 = new Scanner(System.in);
        amount = in2.nextInt();
        
        name = "Gregory Gregson";
        payee = "Timothy Timson";
        reason = "PAYMEMENT";
        
    }

    //Method
    public static void printCheck()
    {
        // Simulate the printing of a ticket.
        System.out.println("");
        System.out.println("# Your Name: " +name +"         <   " +checknumber +"   >");
        System.out.println("# Pay to the Order of: " +payee +"     $ " +amount +"   ");
        System.out.println("#");
        System.out.println("# For: " + reason + "");
        System.out.println("############################################");
        System.out.println("");

        //
    }
}
