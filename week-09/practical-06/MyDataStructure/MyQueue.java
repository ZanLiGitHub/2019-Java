public class MyQueue{

    Node node = new Node();

	private Node front;
	private Node rear;

	public MyQueue(){
		this.front = null;
		this.rear = null;
	}

	public void enqueue(Node node){
		if(this.rear != null ){
			node.next = this.rear;
			this.rear = node;

		} else{
			this.rear = node;
		}
	}

	public String dequeue(){
		String tmpS = null;
		if(this.rear != null){
			if(this.rear.next != null){
				Node tmp = this.rear;
				Node prev = null;
				while(tmp.next != null){
					prev = tmp;
					tmp = tmp.next;
				}
				tmpS = prev.next.getData();
				prev.next = null;

			}else{
				tmpS = this.rear.getData();
				this.rear = null;
			}
		}else{
			tmpS = null;
			System.out.println("Queue is empty");
		}
		return tmpS;
	}

	public boolean isEmpty(){
		boolean tmp = true;
		if(this.rear == null){
			tmp = true;
		}else{
			tmp = false;
		}
		return tmp;
	}

	public void displayQueue(){
		if(this.rear != null){
			Node tmp = this.rear;
			do{
				System.out.print(tmp.data + " ");
				tmp = tmp.next;
			}while(tmp != null);
		}
		System.out.println();
	}
}