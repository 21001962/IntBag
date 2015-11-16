import java.util.*;
/**
 * @(#)Lab01.java
 *
 * Lab01 part c: main class and display the menu with following options.
 *
 * @author Baran Felek
 * @version 1.00 2013/2/11
 */
 
public class Display {
    
    public static void main(String[] args) {
    	
	    
	    Scanner scan = new Scanner(System.in);
	     
	    //VARIABLES
	    int option = 0;
	    String save = "";
	    int num = 0;
	    int pos = 0;
	    IntBag bag = new IntBag();
	    
	    
		//PROGRAM CODE	
	    while ( option != 9){
	    	
	    	//OPTIONS
	    	if ( option == 1){
	    		System.out.println ( "Enter the maximum capacity.");
	    		bag = new IntBag (scan.nextInt());
	    	}
	    	else if ( option == 2){
	    		System.out.println ( "Start entering the values.");
	    		for ( int i = 0; i > 0; i = scan.nextInt()){
	    			if ( i > 0)
	    				bag.addValue(i);
	    		}
	    	}
	    	else if ( option == 3){
	    		System.out.println ( bag.toString());
	    	}
	    	else if ( option == 4){
	    		System.out.println ( "Enter the value you wish to add.");
	    		num = scan.nextInt();
	    		System.out.println ( "Write index between 0 - " + (bag.getSize()-1) + " :");
	    		pos = scan.nextInt();
	    		if (pos > bag.getSize()) {
	    			System.out.println ( "Write index between 0 - " + (bag.getSize()-1) + " :");
	    			pos = scan.nextInt();
	    		}
	    		bag.addValueParticularIndex(num,pos);
	    		System.out.println ( "Done!");
	    	}
	    	else if ( option == 5){
	    		System.out.println ( "Enter the location between 0 - " + bag.getSize() + " :");
	    		pos = scan.nextInt();
	    		bag.removeValue( pos);
	    		System.out.println ( "Done!");
	    	}
	    //	else if ( option == 6){
	    //		num = bag.getValue(generator.nextInt()));
	    		
	    //		System.out.println ( num + " is chosen.");
	    //	}
	    	else if ( option == 7){
	    		save = bag.findAll( num);
	    		System.out.println ( "Done!");
	    	}
	    	else if ( option == 8){
	    		System.out.println ( save);
	    	}
	    	//Main menu
	    	System.out.println ( "Enter the corresponding number according to option you wish choose.");
		    System.out.println ( "1/Create a new empty collection with a specified maximum capacity. (any previous values are lost.)"); 
		    System.out.println ( "2/Read a set of positive values into the collection (use a negative value to indicate all the valueshave been entered. A default collection is given if user does not create a collection.)"); 
		    System.out.println ( "3/Print the collection of values.");
		    System.out.println ( "4/Add a value to the collection of values at a specified location.");
		    System.out.println ( "5/Remove the value at a specified location from the collection of values");
		    System.out.println ( "6/Read a single test value.");
		    System.out.println ( "7/Compute the set of locations of the test value within the collection* (see note below).");
		    System.out.println ( "8/Print the set of locations.");
		    System.out.println ( "9/Quit the program.)");
	    	option = scan.nextInt();
	    }
	    	
	    
	    }
}
