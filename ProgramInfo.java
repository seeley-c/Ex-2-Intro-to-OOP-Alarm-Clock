/* **********************************************************
 * Programmer:      C. Seeley
 * Class:           CS30S
 * 
 * Assignment:      Lab 2.1 Program Info
 *
 * Description:     
 * *************************************************************
 */
 
 // import files here as needed

public class ProgramInfo {  // begin class
 	
 	// *********** class variables *********
     
                private static String assignmentData = ""; 
                //variable for assignment
                private static String questionData = "";
                //variable for question
                
                
 	// ********** instance variable **********
     
 	// ********** constructors ***********
                
           /***************************************************
            * Purpose:    default banner
            * Interface:
            * in:         none
            * return      none
            ****************************************************/
            public ProgramInfo(){
                assignmentData = "";
            }//end default constructors    
            
           /***************************************************
           * Purpose:    print banner with assignment name
           * Interface:
           * in:         assignment
           * return      none
           ****************************************************/
            public ProgramInfo(String a){
                assignmentData = a;
                
            }//end initialized constructor
            
            /***************************************************
           * Purpose:    print banner with assignment name and
           *             question
           * Interface:
           * in:         assignment and question
           * return      none
           ****************************************************/
            public ProgramInfo(String a, String b){
                assignmentData = a;
                questionData = b;
                
            }//end initialized constructor
            
 	// ********** accessors **********
            
            
            /***********************************
            * purpose: get the assignment name
            *
            * Interface: 
            * in:       none
            * return:   assignment (String)
            //**********************************/
            public String getAssignment(){
                String assignment = assignmentData;
                return assignment;
            }//end getAssignment()
            
            /***********************************
            * purpose: get the class name
            *
            * Interface: 
            * in:       none
            * return:   classData (String)
            //**********************************/
            public String getClassData() { 
                String classData = "CS30S";
                return classData;
            }
            
            /***********************************
            * purpose: get the name of programmer
            *
            * Interface: 
            * in:       none
            * return:   nameData (String)
            //**********************************/
            public String getName(){
                String nameData = "C. Seeley";
                return nameData;
            }//end getName()
            
            /***********************************
            * purpose: get the question name
            *
            * Interface: 
            * in:       none
            * return:   question (String)
            //**********************************/
            public String getQuestion() {
                String question = questionData;
                return question;
            }//end getQuestion()
            
            /***********************************
            * purpose: report all properties of
            *          program info
            *
            * Interface: 
            * in:       none
            * return:   programInfo (String)
            //**********************************/
            public String toString(){
                String programInfo= "";
                programInfo =  "*********************************\n";
                programInfo += "Name:        " + this.getName() + "\n";
		programInfo += "Class:       " + this.getClassData() + "\n";
		programInfo += "Assignment:  " + this.getAssignment() + " " + this.getQuestion() + "\n";
		programInfo += "***********************************\n";
                return programInfo;
            }//end toString()
            
            /***********************************
            * purpose:  return end of program
            *           output
            *
            * Interface: 
            * in:       none
            * return:   endOfProgram (String)
            //**********************************/
            public String endOfFile(){
                String endOfProgram = "End of processing";
                return endOfProgram;
            }//end endOfFile()
            
 	// ********** mutators **********
        
 }  // end class