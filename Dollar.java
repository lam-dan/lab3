
public class Dollar extends Currency{
	private String name;
	
	public Dollar(){
		this.name = "Dollar";	
	}
	
	public Dollar(double number) {
        super(number);
        this.name = "Dollar";
    }
    
    public Dollar(Currency obj) {
		super(obj);
		this.name = "Dollar";
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void add(Currency obj) {
		if(!obj.getClass().getName().equals(this.getName())){
            System.out.println("Invalid addition.");
            return;
        }        
        super.add(obj);
    }
    
    @Override
    public void subtract(Currency obj) {
        if(!obj.getClass().getName().equals(this.getName()) ){
            System.out.println("Invalid subtraction.");
            return;
        }
        super.subtract(obj);
    }
    
    @Override
    public boolean isGreater(Currency obj) {
        return super.isGreater(obj);
    }

    @Override
    public boolean isEqual(Currency obj) {
        return super.isEqual(obj);
    }
    
    @Override
    public void print() {
		super.print();
		System.out.print(" " + this.getName() + " ");
	}
	

	
}
