public class hashmap{

	int table_size = 10;
	Node table [];

	public hashmap(){
		table = new Node[10];
		for (int i =0; i< table_size; i++){
			table[i]=null;
		}

	}

	public Object get(int key){

		int hash = key % table_size;

		while(table[hash] != null && table[hash].getKey() != key){
				hash = (hash+1)%table_size;
		}
		if(table[hash] == null){
			return -1;
		}
		else{
			return table[hash].getValue();
		}

	}

	public void put(int key, Object value){
		int hash = key % table_size;

		while (table[hash]!=null && table[hash].getKey() != key){
			hash = (hash + 1)%table_size;
		}

		table[hash] = new Node(key, value);

	}
}