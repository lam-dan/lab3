import java.text.DecimalFormat;

//Updated print() method to return a string instead of printing it for SingleLinkedList print()
// method to work properly.

abstract class Currency {
	private int noteValue;
	private int coinValue;
	
	// Default constructor
	public Currency(){
		this.noteValue = 0;
		this.coinValue = 0;
	}
	
	// A normal parameterized constructor
	public Currency(double number){
		if(number < 0){
			throw new IllegalArgumentException("Currency value cannot be less than 0.");
		}
		int intValue = (int) number;
		this.noteValue = intValue;
		this.coinValue = (int) Math.round((100*(number - Math.floor(intValue))));
	}
	
	// Copy constructor
	Currency(Currency obj){
		this.noteValue = obj.noteValue;
		this.coinValue = obj.coinValue;
	}
	
	// Getters and Setters
	public void setNoteValue(int number){
		if(number > 0){
			this.noteValue = number;
		}
	}
	
	public int getNoteValue(){
		return noteValue;
	}
	
	public void setCoinValue(int number){
		if(number > 0){
			this.coinValue = number;
		}
	}
	
	public int getCoinValue(){
		return coinValue;
	}
	
	// Additions & Subtractions
	public void add(Currency obj){
		this.noteValue += obj.noteValue;
		this.coinValue += obj.coinValue;
		if(this.coinValue >= 100){
			this.noteValue ++;
			this.coinValue = this.coinValue % 100;
		}
	}
	
	public void subtract(Currency obj){
		if (!this.isGreater(obj) && !this.isEqual(obj)) {
			System.out.println("Invalid subtraction");
            return;
        }
        this.noteValue -= obj.noteValue;
        this.coinValue -= obj.coinValue;        
        if(this.coinValue < 0) {
			this.noteValue -= 1;
            this.coinValue += 100;
        }
	}
	
	// Comparison
	public boolean isEqual(Currency obj){
		if(this.noteValue == obj.noteValue && this.coinValue == obj.coinValue){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isGreater(Currency obj){
		if(this.noteValue > obj.noteValue) {
			return true;
		} 
		else if (this.noteValue < obj.noteValue){
			return false;
		}
		else if (this.coinValue > obj.coinValue){
			return true;
		}
		else if (this.noteValue < obj.noteValue){
			return false;
		} 
		else {
			return false;
		}
	}
	
	public String print(){
		String coinString = String.valueOf(this.coinValue);
		if(this.coinValue == 0){
			coinString = "00";
		}
		else if( coinString.length() > 2){
			coinString = coinString.substring(coinString.length() - 2);
		}
		//System.out.print(this.noteValue + "." + coinString);
		return this.noteValue + "." + coinString;
	}
}
