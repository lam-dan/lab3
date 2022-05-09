public class LinkNode {
	private Currency data = null;
	private LinkNode next;
	
	public LinkNode(Currency currency){
		data = currency;
		next = null;
	}
	
	//Getters
	public Currency getData(){
		return data;
	}
	public LinkNode getNext(){
		return next;
	}
	
	//Setters
	public void setData(Currency data){
		this.data = data;
	}
	
	public void setNext(LinkNode next){
		this.next = next;
	}
	

	
}
