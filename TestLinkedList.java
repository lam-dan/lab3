public class TestLinkedList {
	
	public static void main(String [] args){
		System.out.println("Welcome to ADT Testing by Daniel Lam and Chitra Srinivasan.");
		
		// Initializing Pound and Dollar in currencies array
		Currency[] currencies = new Currency[20];
		currencies[0] = new Dollar(57.12);
		currencies[1] = new Dollar(23.44);
		currencies[2] = new Dollar(87.43);
		currencies[3] = new Dollar(68.99);
		currencies[4] = new Dollar(111.22);
		currencies[5] = new Dollar(44.55);
		currencies[6] = new Dollar(77.77);
		currencies[7] = new Dollar(18.36);
		currencies[8] = new Dollar(543.21);
		currencies[9] = new Dollar(20.21);
		currencies[10] = new Dollar(345.67);
		currencies[11] = new Dollar(36.18);
		currencies[12] = new Dollar(48.48);
		currencies[13] = new Dollar(101.00);
		currencies[14] = new Dollar(11.00);
		currencies[15] = new Dollar(21.00);
		currencies[16] = new Dollar(51.00);
		currencies[17] = new Dollar(1.00);
		currencies[18] = new Dollar(251.00);
		currencies[19] = new Dollar(151.00);
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.prepend(currencies[0]);
		linkedList.prepend(currencies[1]);
		linkedList.prepend(currencies[2]);
		linkedList.prepend(currencies[3]);
		linkedList.prepend(currencies[4]);
		linkedList.prepend(currencies[5]);
		linkedList.prepend(currencies[6]);
		
		linkedList.findCurrency(new Dollar(87.43));
		linkedList.findCurrency(new Dollar(44.56));
		linkedList.removeCurrency(new Dollar(111.22));
		linkedList.removeCurrency(2);
		linkedList.printList();
		
		linkedList.addCurrency(currencies[8], 3); 
		linkedList.addCurrency(currencies[9], 4);
		linkedList.addCurrency(currencies[10], 0);
		linkedList.addCurrency(currencies[11], 1);
		linkedList.printList();
		
		
		
		
		
		
		
	}


}

