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
	public void addCurrency(Currency obj, int node){
		
		
	}
	
	//Removes Currency object from the SLL and returns a copy of object.
	public Currency removeCurrency(Currency obj){
		
		return obj;
	}
	
	////Removes Currency object from the SLL based on index and returns a copy of the object.
	//public Currency removeCurrency(int index){
		//Currency obj = new Currency
		//return obj;
	//}
	
	//Currency object as parameter and returns the node index at which the Currency is found in the list.
	public int findCurrency(Currency obj){
		int index = 0;
		return index;
	}
	
	//getCurrency method which takes an index values as a parameter and returns the Currency object.
	//public Currency getCurrency(int index){
		
		
		//return Currency;
	//}
	
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
