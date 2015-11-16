import java.util.Arrays;
/*
 *
 *IntBag class
 *
 *author Baran Felek
 */
 
public class IntBag {
	
	private int[] bag;
	private int valid;	
		
	// ??The values themselves must be stored in the first valid elements of bag??
	
	//Constructors
	//Default constructor
	public IntBag() {
		
		bag = new int[100];
		valid = 0;
				
	}
	
	public IntBag(int max) {
		
		bag = new int[max];
		valid = 0;
	}
	
	public int getValid() {
		return valid;
	}
	public int getSize() {
		return bag.length;
	}
	
	//Add value to the end of collection
	public boolean addValue(int value) {
		
		if (valid>=bag.length)
			return false;
		else{	 
			for(int i=0;i<bag.length;i++)
				bag[i] = value;	
		}	
		return true;		
			
	}
	
	
	//add value at a particular index
	public void addValueParticularIndex (int value,int index) {	
		
		if((index >= 0) && (index < bag.length))
		{
    		bag[index] = value;		
		}
	
	}	
	// remove the value
	public void removeValue (int number) {
		
		if ( (number > bag.length) && (number <= 0))
				System.out.println ( "There is no place to exist.");
		else{
			if ( bag[number] == 0)
				System.out.println ( "There is no value to remove.");
			else  {
				bag[number] = 0;
				for ( int i = number; i < bag.length; i++)
					bag[i] = bag[i + 1];
					
				bag[bag.length - 1] = 0;
				valid--;
			}
		}
	}
	
	//test whether the collection contains a given value or not.
	public boolean compareToValue(IntBag i) {
	
		if(valid == getValid())
			return true;
		else 
			return false;		
		
	}
	
	
	
	//toString method that returns a String representation of the collection.
	public String toString() {
		return Arrays.toString(bag);
	}
	
	//returning the number of values in the collection
	public int size() {
		
		return valid;
	}
	
	// Get value	
	public int getValue(int value){
		
		if ( value < bag.length && value >= 0 )
			return bag[value];
		else{
			System.out.println ( "There is no place to exist.");
			return 0;
		}
	}
		
	//take a number at index i.
	public int TakeNumber(int value) {
		
   		return bag[value];   		
   	}
   	
   	//Part c : findAll method which return all instance of a given value in collection.
   	public String findAll ( int value){
		String find = "";
		for ( int i = 0; i < bag.length; i++){
			if ( bag[i] == value)
				find = find + i + "	";
		}
		return find;
	}
   	   
    
}
