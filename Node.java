public class Node{


	Node next;
	Object data;

	// used only for stack
	Object max;
	Object min;

	// used for the hashmap
	int key;
	Object value;

	// - constructor 
	public Node(){
		this.next = null;
		this.data = null;
	}

	public Node(Object data){
		this.next = null;
		this.data = data;
	}

	public Node(Node next, Object data){
		this.next = next;
		this.data = data;
	}

	public Node(int key, Object value){
		this.key = key;
		this.value = value;
	}

	public Object getData(){
		return this.data;
	}

	public void setData(Object data){
		this.data = data;
	}

	public Node getNext(){
		return this.next;
	}

	public void setNext(Node next){
		this.next = next;
	}

	public void setMin(Object data){
		this.min = data;
	}

	public Object getMin(){
		return this.min;
	}

	public void setMax(Object data){
		this.max = data;
	}

	public Object getMax(){
		return this.max;
	}

	public void setKey(int key){
		this.key = key;
	}

	public int getKey(){
		return this.key;
	}

	public void setValue(Object value){
		this.value = value;
	}

	public Object getValue(){
		return this.value;
	}
}