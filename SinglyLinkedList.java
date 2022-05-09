public class SinglyLinkedList{
	private int count = 0;
	private LinkNode start = null;
	private LinkNode end = null;
	
	
	public SinglyLinkedList(){
		this.start = null;
		this.end = null;
	}
	
	//Getters
	public int getCount(){
		return count;
	}
	public LinkNode getStart(){
		return this.start;
	}
	public LinkNode getEnd(){
		return this.end;
	}
	
	//Setters
	public void setCount(int count){
		this.count = count;
	}
	
	public void setStart(LinkNode start){
		this.start = start;
	}
	
	public void setEnd(LinkNode end){
		this.end = end;
	}
	
	//Adding Data to LinkedList
	public void add(Currency data){
		 
		
	}
	

	
	//Add Nodes to the linked list in front
	public void prepend(Currency obj){
		LinkNode node = new LinkNode(obj);
		if(isListEmpty()){
			this.start = node;
			this.end = this.start;
		} else {
			node.setNext(this.start);
			this.start = node;
		}
		count++;
	}
	
	public void append(Currency obj){
		LinkNode node = new LinkNode(obj);
		if(isListEmpty()){
			this.start = node;
			this.end = node;
		} else {
			this.end.setNext(node);
		}
		this.end = node;
		count++;
	}
	
	//Adds currency object to the index of the SLL 
	public void addCurrency(Currency obj, int index){
		LinkNode node = start;
		if( index < 0 ){
			System.out.println("This index is invalid.");
			return;
		}
		if ( index == 0 ){
			this.prepend(obj);
		} else {

			while(index != -1){
				index--;
				if( index == 0){
					LinkNode newNode = new LinkNode(obj);
					newNode.next = start.next;
					start.next = newNode;
					break;
				}
			}
		}
	}
	
	//Removes Currency object from the SLL and returns a copy of object.
	public Currency removeCurrency(Currency obj){
		//System.out.println("Remove currency obj " + obj.print());
		LinkNode node = this.start;
		int index = 0;
		
		while(!obj.isEqual(node.getData())){
			node = node.getNext();
			index++;
		}
		Currency currencyRef = removeCurrency(index);
		return currencyRef;
	}
	
	//////Removes Currency object from the SLL based on index and returns a copy of the object.
	public Currency removeCurrency(int index){
		//System.out.println("Remove currency index at " + index);
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		}
		LinkNode node = start;
		for (int i = 0; i < index-1; i++) {
			node = node.getNext();
        }
        if( index == 0){
			start = node.getNext();
		} else {
			LinkNode next = node.getNext().getNext();
			node.next = next;
			return node.getData();
		}
		return node.getData();
	}
		
	
	
	//Currency object as parameter and returns the node index at which the Currency is found in the list.
	public int findCurrency(Currency obj){
		int index = 0;
		LinkNode node = this.start;
		while(node != null){
			if(obj.isEqual(node.getData())){
				System.out.println("Found " + obj.print() + " at index " + index);
				return index;
			}
			index++;
			node = node.getNext();
		}

			System.out.println("Did not find " + obj.print()+ " at any index.");

		return -1; 
	}
	
	//getCurrency method which takes an index values as a parameter and returns the Currency object.
	public Currency getCurrency(int index){
		int counter = 0;
		LinkNode node = start;
		
		while( counter != index){
			node = node.next;
			counter++;
		}	
		return node.getData();
	}
	
	//printList method which returns a string of all the Currency objects in the list in the order of index, tab spaced.	
	public String printList() {
		StringBuilder sb = new StringBuilder("");
		LinkNode node = this.start;
		if(node==null){
			return "No elements present";
			}
			while (node != null) {
				sb.append(node.getData().print());
				node = node.getNext();
				if(node!=null)
				sb.append("	");
			}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	//isListEmpty method which returns if a list is empty or not.
	public boolean isListEmpty() {
		return this.count == 0;
	}
	
	//countCurrency method which returns a count of Currency nodes in the list.
	public int countCurrency(){
		return this.count;
	}

}
