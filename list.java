public class list{

	Node head = null;
	int size = 0;

	public void add(Object data){

		if(this.head == null || this.head.getNext() == null){
			this.head = new Node();
		}

		Node pointer = this.head;

		while(pointer.getNext() != null){
			pointer = pointer.getNext();
		}

		pointer.setNext(new Node(data));
		this.size++;
	}

	public boolean isempty(){
		if(this.head == null || this.head.getNext() == null){
			return (true);
		}else{
			return(false);
		}
	}

	public void remove(){

		if(isempty() == true){
			return ;
		}

		Node pointer = this.head;

		while(pointer.getNext().getNext() != null){
			pointer = pointer.getNext();
		}

		pointer.getNext().setData(null);

		pointer.setNext(null);
		this.size--;

	}

	public void removedata(Object data){

		if(isempty() == true){
			return ;
		}

		Node pointer = head;
		while(!(pointer.getNext().getData().equals(data))){
			pointer = pointer.getNext();
		}
		Node temp = pointer.getNext();
		pointer.setNext(pointer.getNext().getNext());
		temp.setData(null);
		temp.setNext(null);
		this.size--;

	}

	public void printlist(){

		
		Node pointer = this.head;
		while(pointer.getNext() != null){

			pointer = pointer.getNext();
			System.out.print(pointer.getData()+ " ");
		}
		System.out.println();

	}

	public int getSize(){
		return this.size;
	}
}