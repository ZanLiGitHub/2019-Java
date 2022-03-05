public class Node{
	private int index; 


	public Node(){
		this.index = 0;
	}
	public Node(int index){
		this.index = index;
	}


	public void setIndex(int index){
		this.index = index;
	}
	public int getIndex(){
		return index;
	}


	public void printNode(){
		System.out.println("Data: "+ this.getIndex());
	}
}