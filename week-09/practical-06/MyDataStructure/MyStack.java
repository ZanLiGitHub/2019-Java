public class MyStack{

	Node node = new Node();
	
	private Node top;

	public MyStack(){
		this.top = null;
	}

	public void push(Node node){
  		Node tmp = this.top;
  		if(this.top == null){
  			this.top = node;
  		}else{
  			node.setNext(this.top);
  			this.top = node;
  		}
	}

	public Node pop(){
		Node tmp = this.top;
		if(this.top == null){
			System.out.println("Stack is empty.");
			tmp = null;
		}else{
			tmp = this.top;
			this.top = node.getNext();
		}
		return tmp;
	}

	public Node peek(){
		Node tmp = this.top;
		if(this.top == null){
			System.out.println("Stack is empty.");
			tmp = null;
		}else{
			tmp = this.top;
		}
		return tmp;
	}

	public boolean isEmpty(){
		boolean tmp = true;
		if(this.top == null){
			tmp = true;
		}else{
			tmp = false;
		}
		return tmp;
	}
}