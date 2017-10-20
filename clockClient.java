import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// **********************************************************************
// Programmer:          C. Seeley
// Class:               CS30S
//
// Assignment:          Intro to OOP Alarm Clock 
//
// Description:         outputs current time and alarm time
//
// Input:               system time
//
// Output:              current time and alarm time
// ***********************************************************************



public class clockClient {  // begin class
    
	public static void main(String args[]) {  // begin main
            
	// ***************declaration of constants **************
	
	// **************declaration of variables ***************
            
	// ************create objects ****************
            
            DateFormat df = new SimpleDateFormat("hh:mm:ss");
            Date dateobj = new Date();
            //create time object
            
            ProgramInfo progInfo = new ProgramInfo("Lab Ex 2", "Intro to OOP");
            //create program info
            
            Clock clock1 = new Clock(df.format(dateobj), "7:30:00"); 
            //create clock 1
            Clock clock2 = new Clock(df.format(dateobj), "7:30:00");
            //create clock 2
            Clock clock3 = new Clock(df.format(dateobj), "7:30:00");
            //create clock 3
        
	// **********create input stream ****************
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** ********Print Banner **************
        
            System.out.println(progInfo.toString()); //output program info
            
	// *****************get input ******************
	
	// *************************processing ****************

	// ******************output *********************
        
            System.out.println("Clock 1: \n" + clock1.toString());
            //output clock with current time and alarm time
        
            clock2.setTime("1:00:50");  //set current time
            System.out.println("Clock 2: \n" + clock2.toString());
            //output clock with set time and alarm time
            
            clock3.advTime();           //advance current time one second
            clock3.setAlarm("8:30:00"); //set alarm time
            System.out.println("Clock 3: \n" + clock3.toString());
            //output clock with advanced time and set alarm time
            
	// ***************closing message ***************
	
		System.out.println(progInfo.endOfFile()); //output end of file
	
	}  // end main	
}  // end class