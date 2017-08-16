public class stack{

	int size = 0;
	public Node head = null;

	public stack(){
		head = new Node();
	}

	public Object getMax(){
		return head.getNext().getMax();
	}

	public Object getMin(){
		return head.getNext().getMin();
	}


	public Object pop(){
		if(head.getNext()==null){
			return null;
		}
		else{
			Object temp = head.getNext().getData();
			head.setNext(head.getNext().getNext());
			return temp;
		}
	}
	public void push(Object data){

		// - for the first node.
		if(this.head == null || this.head.getNext()==null){
			head.setNext(new Node(data));
			head.getNext().setMin(data);
			head.getNext().setMax(data);

		}
		else{
			
			head.setNext(new Node(head.getNext(), data));

			// - setting max
			if ((int)head.getNext().getData() > (int)head.getNext().getNext().getMax()){
				head.getNext().setMax(data);
			}
			else{
				head.getNext().setMax((int)head.getNext().getNext().getMax());
			}
			
			// - setting min
			if ((int)head.getNext().getData() < (int)head.getNext().getNext().getMin()){
				head.getNext().setMin(data);
			}
			else{
				head.getNext().setMin((int)head.getNext().getNext().getMin());
			}
			
		}
	

	}




}