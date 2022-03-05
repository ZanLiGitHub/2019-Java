public class Node {

	public String data = "data";
    public Node next;

    public Node(){
    	this.data = null;
    	this.next = null;
    }
    public Node(String data){
   		this.data = data;
   		this.next = null;
    }

    public void setData(String data){
    	this.data = data;
    }
    public void setNext(Node next){
    	this.next = next;
    }
    public String getData(){
    	return data;
    }
    public Node getNext(){
    	return next;
    }

    public void printNode(Node node){
 		System.out.println(node.getData()+" is saved in this node.");
    } 
}