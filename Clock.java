/* **********************************************************
 * Programmer:      C. Seeley
 * Class:           CS30S
 * 
 * Assignment:      Intro to OOP Alarm Clock 
 *
 * Description:     properties and behaviours of a clock object
 * *************************************************************
 */
 
 // import files here as needed

public class Clock {  // begin class
 	
 	// *********** class variables *********
     
                private String currentTime = "";    //variable for current time
                private String alarmTime = "";      //variable for alarm time
                
                private int hour = 0;           //int for current hour
                private int minute = 0;         //int for current minute
                private int second = 0;         //int for current second
                private int hourAlarm = 0;      //int for alarm hour
                private int minuteAlarm = 0;    //int for alarm minute
                private int secondAlarm = 0;    //int for alarm second
                
 	// ********** instance variable **********
     
 	// ********** constructors ***********
                
           /***************************************************
            * Purpose:    create a new clock
            * Interface:  
            * in:         none
            * return      none
            ****************************************************/
            public Clock(){
                currentTime = "";
                alarmTime = "";
            }//end default constructors    
            
            /***************************************************
            * Purpose:    create a new clock with current time
            * Interface:
            * in:         current time (String)
            * return      none
            ****************************************************/
            public Clock(String a){
                String[] delim = a.split(":");
                hour = Integer.parseInt(delim[0]); 
                minute = Integer.parseInt(delim[1]);  
                second = Integer.parseInt(delim[2]);
                alarmTime = "";
            }//end initialized constructors    
            
            /***************************************************
            * Purpose:    create a new clock with current time
            *             and alarm time
            * Interface:
            * in:         current time (string) and alarm time
            *             (string)
            * return      none
            ****************************************************/
            public Clock(String a, String b){
                String[] delim = a.split(":");
                hour = Integer.parseInt(delim[0]); 
                minute = Integer.parseInt(delim[1]);  
                second = Integer.parseInt(delim[2]);
                
                delim = b.split(":");
                hourAlarm = Integer.parseInt(delim[0]); 
                minuteAlarm = Integer.parseInt(delim[1]);  
                secondAlarm = Integer.parseInt(delim[2]);
            }//end initialized constructors 
            
 	// ********** accessors **********
            
            /***********************************
            * purpose: report current time and
            *          alarm time
            *
            * Interface: 
            * in:       none
            * return:   alarmClock (String)
            //**********************************/
            public String toString(){  //create toString() accessor
                String alarmClock = "Current time: "+ hour + ":" + minute + ":" + second + "\n";
                alarmClock += "Alarm time: " + hourAlarm + ":" + minuteAlarm + ":" + secondAlarm + "\n";
                return alarmClock;
            } //end toString()
           
            
 	// ********** mutators **********
        
        /***********************************
 	* purpose: set the time for the alarm
        *
        * Interface: 
        * in:       alarm (string)
        * return:   none
        //**********************************/
        
        public void setAlarm(String a) {
            String[] delim = a.split(":");
            hourAlarm = Integer.parseInt(delim[0]); 
            minuteAlarm = Integer.parseInt(delim[1]);  
            secondAlarm = Integer.parseInt(delim[2]);
        } //end setAlarm()
        
        /***********************************
 	* purpose:  manually set the time
        *
        * Interface: 
        * in:       time (string)
        * return:   none
        //**********************************/
        
        public void setTime(String a) {
            String[] delim = a.split(":");
            hour = Integer.parseInt(delim[0]); 
            minute = Integer.parseInt(delim[1]);  
            second = Integer.parseInt(delim[2]);
        } //end setTime()
        
        /***********************************
 	* purpose: advance the time one second
        *
        * Interface: 
        * in:       none
        * return:   none
        //**********************************/
        
        public void advTime() {
            second = second + 1;   
        } //end advTime()
        
 }  // end class