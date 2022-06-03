package cs350s22.component.ui.parser;

import java.io.*;
import java.util.*;
import cs350s22.support.*;
import cs350s22.test.MySensor;

public class Parser{
	//Variable List
	public A_ParserHelper parserHelper;
	public String commandText;
	
	//CONSTRUCTORS
	public Parser(A_ParserHelper parserHelper, String commandText){
		this.parserHelper = parserHelper;
		this.commandText = commandText;
	}
	
	public void parse() throws ParseException, IOException{
		String input = this.commandText;
		String parserCheck = null;
		String output = null;
		
		//Split off leading term into 2-slot array
		String[] splitArray = input.split(" ", 2);
	    parserCheck = splitArray[0];
	    
	    if(splitArray.length > 1) {
	    	output = splitArray[1];
	    }
	    
	    //Navigation Tree
		if(parserCheck.equals("CREATE")){
		    treeCreate(output);
		}
		else if(parserCheck.equals("SEND")){
		    treeSend(output);
		}
		
		//Immediate Action
		//CLOCK Methods
		if(parserCheck.equals("@CLOCK")){
		    Clock myClock = Clock.getInstance();    //Get a hold of the clock
			
			//Check if we're turning the clock on or off
			if(output.equals("PAUSE")){
			    myClock.isActive(false);            //Turn the clock off
			}
			else if(output.equals("RESUME")){
			    myClock.isActive(true);             //Turn the clock on
			}
			
			//Check for anything else
			else{
			    String[] actionArray = output.split(" ", 2);
				
				//Are we running "ONESTEP"
				if(actionArray[0].equals("ONESTEP")){
					int counter = Integer.parseInt(actionArray[1]);     //Convert VALUE to int
				    myClock.onestep(counter);							//Run appropriate method
				}
				
				//Are we running "SET RATE"
				else if(actionArray[0].equals("SET")){
					String[] setRate = actionArray[1].split(" ", 2);	//Split remaining string to isolate VALUE
					int counter = Integer.parseInt(setRate[1]);			//Convert VALUE to int
					myClock.setRate(counter);							//Run appropriate method
				}
			}
		}
		
		if(parserCheck.equals("@EXIT")){
			this.parserHelper.exit();
		}
		
		if(parserCheck.equals("@RUN")){
		    this.parserHelper.run(output);
		}
		if(parserCheck.equals("@CONFIGURE")){
			//CODE HERE
		}
		if(parserCheck.equals("BUILD")){
			//CODE HERE
		}
	}

	public void treeCreate(String input) {
		String parserCheck = null;
		String output = null;
		
		//Split off leading term into 2-slot array
		String[] splitArray = input.split(" ", 2);
	    parserCheck = splitArray[0];
	    
	    if(splitArray.length > 1) {
	    	output = splitArray[1];
	    }
	    
	    //Navigation Tree
	  	if(parserCheck.equals("ACTUATOR")){
	  	    //Insert Code Here
	  	}
	  	else if(parserCheck.equals("DEPENDENCY")) {
	  		//Insert Code Here
	  	}
	  	else if(parserCheck.equals("MAPPER")) {
	  		//Insert Code Here
	  	}
	  	else if(parserCheck.equals("REPORTER")) {
	  		//Insert Code Here
	  	}
	  	else if(parserCheck.equals("SENSOR")) {
	  		//Insert Code Here
	  		createSensor(output);
	  	}
	  	else if(parserCheck.equals("WATCHDOG")) {
	  		//Insert Code Here
	  	}
	}
	
	public void treeSend(String input) {
		String parserCheck = null;
		String output = null;
		
		//Split off leading term into 2-slot array
		String[] splitArray = input.split(" ", 2);
	    parserCheck = splitArray[0];
	    
	    if(splitArray.length > 1) {
	    	output = splitArray[1];
	    }
	    
	    //Navigation Tree
	    
	}
	
	public void createSensor(String input)
	{
		String output = null;
		//Split off leading term into 2-slot array
		String[] splitArray = input.split(" ", 0);
	    String sensorType = splitArray[0];
	    Identifier sensorName = Identifier.make(splitArray[1]);
	    
	    if(splitArray.length == 2)
	    {
	    	MySensor s = new MySensor(sensorName);
	    	//System.out.println("Sensor Created");
	    }
	    
	    else
	    {
	    	/*
	    		Split up the command with the uppercase words.
	    		You don't have to save those values into a list. All you
	    		have to do is use them in the different Sensor constructors.
	    		Groups, Reporters, Watchdogs, and Mappers are all optional.
	    	*/
	    }
	    	
	    	
	    //GROUP myGroup1 myGroup2 myGroup3
	    
	    /*if(sensorType == "SPEED")
	    {
	    	String groupName = splitArray[4];
	    }
	    
	    else if(sensorType == "POSITION")
	    {
	    	String groupName = splitArray[4];
	    }*/
	    
	    /*if i + 1 != watchdogs
	     * then i + 1 get symboltable[i] for value and stick in list
	     */
	}
}