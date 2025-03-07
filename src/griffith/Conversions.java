package griffith;

public class Conversions {
	final double RATE = 1.07; //This constant is the rate of exchange for euros to dollars
	
	public double euroToDollar(double euro) {
		return RATE*euro;
	}
	
	public double dollarToEuro(double dollar) {
		return dollar/RATE;
	}
	
	public int stringToInteger (String val) {
		int multiplier = 1; //This is used to determine if the number is negative or positive
		int power = val.length()-1; //This is needed for multiplying powers of 10 to each individual number
		int total = 0;
	if(!val.matches("^[-]?[0-9]*$") || val.isEmpty())
		throw new IllegalArgumentException("String can't be empty or of incorrect format");
		for(char i: val.toCharArray()) {
		if(i == '-') {
			multiplier = -1;
			power--;
			continue;
		}
		total+= (i-'0')*(Math.pow(10, power)); //To get the value of a number from an ascii table		
		power--;
		}
		return total*multiplier;
	}
	
	public String integerToString (int val) {
		return "";
	}
	public String switchCase() {	// change uppercase to lowercase and vice versa
		return "";
	} 
}
