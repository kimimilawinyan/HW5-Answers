import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//KNOWN BUG: ASKS FOR INITIALIZATION OF CHECK AT START OF APPLICATION BEFORE SELECTION IS MADE.

public class Main extends check
{
    //
    public int quit = 1;
    public int b = 0;

    //User interface
    public Main(int quit)
    {
        while (true){
        // User selection
        System.out.println("Please make a selection.");
        System.out.println("");
        System.out.println("(1). Current Balance.");
        System.out.println("(2). List All Checks.");
        System.out.println("(3). Make Deposit");
        System.out.println("(4). Pay a Bill (write check/withdrawl).");
        System.out.println("(5). Load Previous Check From File.");
        System.out.println("(6). Quit Program.");
        System.out.println("");
        
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        
        switch (i) {
            
            case 1: 
            System.out.println("Balance has been selected");
            System.out.println("Your current balance is: " +b);
            System.out.println("");
            break;
            
            
            /** List checks **/
            case 2: 
            
            //Could not get objects to save to an array list.
            
            System.out.println("List checks has been selected");
            System.out.println("");
            break;
            
            /** Deposit **/
            case 3: 
            System.out.println("Deposit has been selected");
            System.out.println("");
            System.out.println("Enter amount to add to current balace of ("+b +"): ");
            
            Scanner in2 = new Scanner(System.in);
            int x = in2.nextInt();
            b = b+x;
            
            System.out.println("");
            System.out.println("Your new balance is: " +b);
            System.out.println("");
            break;
            
            /** Write check **/
            case 4: 
            System.out.println("Write check has been selected");
            System.out.println("");
            
            
            check check1 = new check();
            check.printCheck();
   
        class FileOutput {

	public void main(String[] args) {

		try 
		{
			
			// write object to file
			FileOutputStream f = new FileOutputStream("check.txt");
			ObjectOutputStream oos = new ObjectOutputStream(f);
			oos.writeObject(check1);
			oos.close();

			// read object from file
			FileInputStream fis = new FileInputStream("check.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			check result = (check) ois.readObject();
			ois.close();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	        }
	}
	    b = b - amount;
	    
            break;
            
            
            
            
            
            
            
            
            
            /** Load **/
            case 5: 
            System.out.println("Loading check from previos application use. Looking for file 'check.txt'");
            
        class FileInput {

	public void main(String[] args) 
	{

		try 
		{

			// read object from file
			FileInputStream fis = new FileInputStream("check.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			check result = (check) ois.readObject();
			ois.close();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	        }
	}
            System.out.println("");
            break;
            
            /** Quit **/
            case 6: 
            System.out.println("Quit Program has been selected");
            System.out.println("");
            quit = quit + 100;
            break;
            
            default: 
            System.out.println("Selection invalid, please make another selection.");
            System.out.println("");
            break;
            
            
            

        
        }

        if (quit > 2){
        System.exit(0);
        }
    
        }
    }
    
    //Quit
    public int Quit()
    {
        return quit;
    }    
}

//Could not get objects to save to an array list
